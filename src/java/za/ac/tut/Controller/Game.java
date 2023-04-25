/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.Model.GameT;

/**
 *
 * @author dell
 */
public class Game extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        String userToss = request.getParameter("userToss");
        
        GameT g = new GameT();
        
        g.compToss(session);
        g.score(session, userToss);
        
        Integer tossCnt = (Integer)session.getAttribute("tossCnt");
        tossCnt++;
        
        session.setAttribute("userToss", userToss);
        session.setAttribute("tossCnt", tossCnt);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

}
