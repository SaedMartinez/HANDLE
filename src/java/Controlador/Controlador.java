
package Controlador;

import Modelo.Product;
import Modelo.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Product p=new Product();
    ProductDAO pdao=new ProductDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu=request.getParameter("menu");
        String accion=request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        if (menu.equals("Inventory1")) {
            request.getRequestDispatcher("inventory1.jsp").forward(request, response);
        }
        if (menu.equals("Inventory2")) {
            switch(accion){
                case "Listing":
                    List lista=pdao.listing();
                    request.setAttribute("vproducts", lista);
                    break;
                default:     
            }
            request.getRequestDispatcher("inventory2.jsp").forward(request, response);
        }
        if (menu.equals("Inventory3")) {
            request.getRequestDispatcher("inventory3.jsp").forward(request, response);
        }
        if (menu.equals("Users")) {
            request.getRequestDispatcher("menusers.jsp").forward(request, response);
        }
        if (menu.equals("Profile")) {
            request.getRequestDispatcher("cprofile.jsp").forward(request, response);
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
