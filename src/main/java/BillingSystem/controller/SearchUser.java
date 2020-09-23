package BillingSystem.controller;

import BillingSystem.persistence.UserData;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        UserData userData = new UserData();
//        if (req.getParameter("submit").equals("search")){
//            req.setAttribute("users", userData.getUsersByLastName(req.getParameter("searchTerm")));
//        } else {
//            req.setAttribute("users", userData.getAllUsers());
//        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}