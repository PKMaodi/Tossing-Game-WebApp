<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Welcome</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            String userName = (String)session.getAttribute("userName");
        %>
        <h1>
            Hi <%=userName%>. Make a toss!!
        </h1>
        <form action="Game.do" method="POST">
            <table>
                <tr>
                    <td>
                        <select name="userToss">
                            <option>Head</option>
                            <option>Tail</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Play!"/>
                    </td>
                </tr>
                
            </table>
        </form>
        
    </body>
</html>
