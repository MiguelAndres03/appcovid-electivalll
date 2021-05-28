/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import impelementacion.OperDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@WebServlet(name = "conteo", urlPatterns = {"/conteo"})
public class conteo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        OperDatos oper = new OperDatos();
        entidad.Datos d = new entidad.Datos();
        
        int[] datos= new int[5];
        datos=oper.consultar();
       

        
        request.setAttribute("fiebre", datos[0] + "   Personas presentan fiebre");
        request.setAttribute("toz", datos[1] + "   Personas presentan toz seca");
        request.setAttribute("cansancio", datos[2] + "   Personas presentan cansancio");
        request.setAttribute("dolor", datos[3] + "   Personas presentan dolor muscular ");
        request.setAttribute("dResperirar", datos[4] + "   Personas presentan dificultad para respirar ");
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/conteo.jsp");
        rd.forward(request, response);
        
       // System.out.println(datos[0]);
        
       
 //       rd = request.getRequestDispatcher("/index.jsp");
 //       rd.forward(request, response);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet conteo</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("Fiebre:   "   +datos[0] +",  " );
            out.println("Toz seca:   "   +datos[1]+",  ");
            out.println("Cansancio:   "   +datos[2]+",  ");
            out.println("Dolor muscular:   "   +datos[3]+",  ");
            out.println("Dificultad para respirar:   "   +datos[4]+",  ");
            
            out.println("</body>");
            out.println("</html>");
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
