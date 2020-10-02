package Controller;

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
    
    //Instancias Controlador
    int ide;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String action = request.getParameter("action");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if (menu.equals("Users")) {
            switch (action) {
                case "List":
                    List listU = udao.list();
                    request.setAttribute("users", listU);
                    break;
                case "Agregar":
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
                    udao.addU(us);
                    request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                case "Edit":
                     ide=Integer.parseInt(request.getParameter("id"));
                     User u=udao.ListId(ide);
                     request.setAttribute("CSuser", u);
                     request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                case "Actualizar":
                    
                    String CLUpassU= request.getParameter("vpasssu");
                    String CLUnameU=request.getParameter("vnamesu");
                    String CLUpnumU=request.getParameter("vpnumsu");
                    String CLUstatusU=request.getParameter("vstatussu");
                    String CLUuserU=request.getParameter("vusersu");
                    us.setId(ide);
                    us.setPass(CLUpassU);
                    us.setName(CLUnameU);
                    us.setPnum(CLUpnumU);
                    us.setStatus(CLUstatusU);
                    us.setUser(CLUuserU);
                    udao.update(us);
                    request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                case "Desactivate":
                    ide=Integer.parseInt(request.getParameter("id"));
                    us.setId(ide);
                    us.setStatus("2");
                    udao.desactivate(us);
                    request.getRequestDispatcher("Controller?menu=Users&action=List").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("users.jsp").forward(request, response);
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
