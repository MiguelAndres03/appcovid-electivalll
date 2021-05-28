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
@WebServlet(name = "DatosSintomas", urlPatterns = {"/DatosSintomas"})
public class DatosSintomas extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String chbox1 = request.getParameter("cbox1");
        String chbox2 = request.getParameter("cbox2");
        String chbox3 = request.getParameter("cbox3");
        String chbox4 = request.getParameter("cbox4");
        String chbox5 = request.getParameter("cbox5");
        
        
        
        OperDatos oper = new OperDatos();
        entidad.Datos d = new entidad.Datos();
        
        d.setSintoma1(chbox1);
        d.setSintoma2(chbox2);
        d.setSintoma3(chbox3);
        d.setSintoma4(chbox4);
        d.setSintoma5(chbox5);
        
        int x = oper.crear2(d);
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/redirec.jsp");
        rd.forward(request, response);
        
        try(PrintWriter out = response.getWriter())
        {
            out.println("Nombre: " + chbox1);
            out.println("Nombre: " + chbox2);
            out.println("Nombre: " + chbox3);
            out.println("Nombre: " + chbox4);
            out.println("Nombre: " + chbox5);
        }
                    
    }

}
