package Controller;

import Model.Product;
import Model.ProductDAO;
import Model.Transaction;
import Model.TransactionDAO;
import Model.User;
import Model.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

    //Instancias Modelo
    User us=new User();
    UserDAO udao=new UserDAO();
    Product p = new Product();
    ProductDAO pdao=new ProductDAO();
    Transaction t=new Transaction();
    Transaction dT=new Transaction();
    TransactionDAO tdao=new TransactionDAO();
    TransactionDAO tdao2=new TransactionDAO();
    
    //Instancias Controlador
        
        //  users
        int idu; 
        
        //transactions
        int cidt; 
        List<Transaction> listP = new ArrayList<>();
        List<Product> listP2=new ArrayList<>();
        int item;
        int ccodep;
        String cnamep;
        int cquantityp;
        String nserie;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String action = request.getParameter("action");
        User uss=(User)request.getSession().getAttribute("luser");
        request.getSession().setAttribute("User", uss);
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if (menu.equals("Users")) {
            switch (action) {
                case "List":
                    List listU = udao.ListU();
                    request.setAttribute("users", listU);
                    break;
                case "Add":
                    String CLUpass= request.getParameter("vpasssu");
                    String CLUname=request.getParameter("vnamesu");
                    String CLUpnum=request.getParameter("vpnumsu");
                    String CLUstatus=request.getParameter("vstatussu");
                    String CLUuser=request.getParameter("vusersu");
                    us.setPass(CLUpass);
                    us.setName(CLUname);
                    us.setPnum(CLUpnum);
                    us.setStatus(CLUstatus);
                    us.setUser(CLUuser);
                    udao.AddU(us);
                    request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                case "Edit":
                     idu=Integer.parseInt(request.getParameter("id"));
                     User u=udao.ListId(idu);
                     request.setAttribute("CSuser", u);
                     request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                case "Update":
                    
                    String CLUpassU= request.getParameter("vpasssu");
                    String CLUnameU=request.getParameter("vnamesu");
                    String CLUpnumU=request.getParameter("vpnumsu");
                    String CLUstatusU=request.getParameter("vstatussu");
                    String CLUuserU=request.getParameter("vusersu");
                    us.setId(idu);
                    us.setPass(CLUpassU);
                    us.setName(CLUnameU);
                    us.setPnum(CLUpnumU);
                    us.setStatus(CLUstatusU);
                    us.setUser(CLUuserU);
                    udao.Update(us);
                    request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                case "Desactivate":
                    idu=Integer.parseInt(request.getParameter("id"));
                    us.setId(idu);
                    us.setStatus("2");
                    udao.Desactivate(us);
                    request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("users.jsp").forward(request, response);
        }
        if (menu.equals("Transactions")) {
            switch (action) {
                case "Search":
                    int ccodep = Integer.parseInt(request.getParameter("vcodep"));
                    p = pdao.SearchP(ccodep);
                    request.setAttribute("product", p);
                    request.setAttribute("listP", listP);
                    request.setAttribute("nserie", nserie);
                    break;
                case "Add":
                    item = item + 1;
                    ccodep = p.getId();
                    cnamep = request.getParameter("vnamep");
                    cquantityp = Integer.parseInt(request.getParameter("vquantityp"));
                    
                    t = new Transaction();
                    t.setItem(item);
                    t.setMidproduct(ccodep);
                    t.setMnamep(cnamep);
                    t.setMquantity(cquantityp);
                    listP.add(t);
                    request.setAttribute("nserie", nserie);
                    request.setAttribute("listP", listP);
                    request.setAttribute("nserie", nserie);
                    break;
                case "Save":
                    //Save Transaction-----------------------------------
                    t.setMiduser(uss.getId());
                    t.setSnumber(nserie);
                    java.util.Date timenow=new java.util.Date();
                    SimpleDateFormat formateador = new SimpleDateFormat("yyy/MM/dd");
                    t.setMdate(formateador.format(timenow));
                    t.setMstatusp("1");
                    tdao.SaveTransaction(t);

                    //Save Details Transaction --------------------------------
                    int idv = Integer.parseInt(tdao.IdTransaction());
                    for (int i = 0; i < listP.size(); i++) {
                        t = new Transaction();
                        t.setId(idv);
                        t.setMidproduct(listP.get(i).getMidproduct());
                        t.setMquantity(listP.get(i).getMquantity());
                        tdao.SaveDetailsT(t);
                    }

                    //Update Stock --------------------------------
                    String typeT="";
                    typeT=request.getParameter("type");
                    for (int i = 0; i < listP.size(); i++) {
                        int cantidad = listP.get(i).getMquantity();
                        int idproducto = listP.get(i).getMidproduct();
                        Product pr = new Product();
                        ProductDAO pdaot = new ProductDAO();
                        pr = pdaot.SearchP(idproducto);
                        if(typeT.equals("In")){
                            int su = pr.getStock()+cantidad;
                            pdaot.UpsdateS(su, idproducto);
                        }
                        if(typeT.equals("Out")){
                            int su = pr.getStock()-cantidad;
                            pdaot.UpsdateS(su, idproducto);
                        }
                    }
                    listP = new ArrayList<>();
                    break;
                default:
                    listP = new ArrayList<>();
                    item=0;
                    nserie = tdao.ReadSn();
                    if (nserie == null) {
                        nserie = "00001";
                        request.setAttribute("nserie", nserie);
                    } else {
                        int incrementar = Integer.parseInt(nserie);
                        nserie = tdao2.IncrementateSn(incrementar);
                        request.setAttribute("nserie", nserie);
                    }
                    request.getRequestDispatcher("transactions.jsp").forward(request, response);
            }
            request.getRequestDispatcher("transactions.jsp").forward(request, response);
        }
        if (menu.equals("Inventory")) {
            switch (action) {
                case "List":
                    List listPs=pdao.ListP();
                    request.setAttribute("products", listPs);
                    break;
                case "History":
                    request.getRequestDispatcher("Controller?menu=Ihistory&action=List").forward(request, response);
                    break;
                case "Modify":
                    request.getRequestDispatcher("Controller?menu=Transactions&action=default").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("inventory.jsp").forward(request, response);
        }
        if (menu.equals("Ihistory")) {
            switch (action) {
                case "List":
                    List listH=tdao.ReadTransaction();
                    request.setAttribute("history", listH);
                    request.setAttribute("dT", dT);
                    break;
                case "Details":
                    cidt=Integer.parseInt(request.getParameter("vidt"));
                    dT=tdao.ReadTransactionId(cidt);
                    List listD=tdao.ReadDetailsT(cidt);
                    request.setAttribute("details", listD);
                    request.setAttribute("dT", dT);
                    request.getRequestDispatcher("Controller?menu=Ihistory&action=List").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            dT=new Transaction();
            request.getRequestDispatcher("invhistory.jsp").forward(request, response);
        }
        if (menu.equals("Profile")) {
            switch (action) {
                case "":
                    break;
                default:
                    request.getRequestDispatcher("profile.jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
