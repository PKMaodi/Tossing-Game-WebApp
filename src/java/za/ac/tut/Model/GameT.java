/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.Model;

import java.util.Random;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class GameT {

    public GameT() {
    }
    public String compToss(HttpSession session){
        String compToss = (String)session.getAttribute("compToss");
        Random r = new Random();
        Integer t = r.nextInt(1) + 3;
        Integer index = (int) (Math.random() * 2);
        if(1 == index){
            compToss = "Head";
        }
        else{
            compToss = "Tail";
        }
        session.setAttribute("compToss", compToss);
        return compToss;
    }
    
    public void score(HttpSession session, String userToss){
        String compToss = (String)session.getAttribute("compToss");
        Integer compWon = (Integer)session.getAttribute("compWon");
        Integer userWon = (Integer)session.getAttribute("userWon");
        
        if(compToss.equalsIgnoreCase(userToss)){
            userWon++;
        }
        else{
            compWon++;
        }
        
        session.setAttribute("compWon", compWon);
        session.setAttribute("userWon", userWon);
    
    }
}
