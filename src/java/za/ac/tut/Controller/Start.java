/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class Start extends HttpServlet {
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
        HttpSession session = request.getSession(true);
        String userName = request.getParameter("userName");
        String compToss = "";
        String userToss = null;
        Integer tossCnt = 0;
        Integer compWon = 0;
        Integer userWon = 0;
        
        session.setAttribute("compToss", compToss);
        session.setAttribute("userName", userName);
        session.setAttribute("userToss", userToss);
        session.setAttribute("tossCnt", tossCnt);
        session.setAttribute("compWon", compWon);
        session.setAttribute("userWon", userWon);
        
        RequestDispatcher disp = request.getRequestDispatcher("Toss.jsp");
        disp.forward(request, response);
        
    }

}
