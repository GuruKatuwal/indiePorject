package BillingSystem.controller;

import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(
        urlPatterns = {"/editUser"}
)

public class EditUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        GenericDao<User> genericDao = DaoFactory.createDao(User.class);
//        User userToUpdate = genericDao.getById(Integer.parseInt(req.getParameter("id")));
//
//        userToUpdate.setName(req.getParameter("name"));
//        userToUpdate.setAddress(req.getParameter("address"));
//        userToUpdate.setCity(req.getParameter("city"));
//        userToUpdate.setState(req.getParameter("state"));
//        userToUpdate.setZipcode(req.getParameter("zipcode"));
//        userToUpdate.setPhone(req.getParameter("phone"));
//        userToUpdate.setDescription(req.getParameter("description"));
//        userToUpdate.setDateOfBirth(LocalDate.parse(req.getParameter("dateOfBirth")));
//
//        genericDao.saveOrUpdate(userToUpdate);

//
//        String name = req.getParameter("name");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String address = req.getParameter("address");
//        String city = req.getParameter("city");
//        String state = req.getParameter("state");
//        String zipcode = req.getParameter("zipcode");
//        String phone = req.getParameter("phone");
//        String description = req.getParameter("description");
//        String dateOfBirth = req.getParameter("dateOfBirth");
//        int id = Integer.parseInt(req.getParameter("id"));
//
//        GenericDao genericDao = new GenericDao(User.class);
//        User userToUpdate = (User)genericDao.getById(id);
//
//        userToUpdate.setName(name);
//        userToUpdate.setUsername(username);
//        userToUpdate.setPassword(password);
//        userToUpdate.setAddress(address);
//        userToUpdate.setCity(city);
//        userToUpdate.setState(state);
//        userToUpdate.setZipcode(zipcode);
//        userToUpdate.setPhone(phone);
//        userToUpdate.setDescription(description);
//        userToUpdate.setDateOfBirth(LocalDate.parse(dateOfBirth));
//
//        genericDao.saveOrUpdate(userToUpdate);


           GenericDao genericDao = new GenericDao();

           User user = new User(Integer.valueOf(req.getParameter("id")),req.getParameter("name"),req.getParameter("username"),req.getParameter("password"),req.getParameter("address"),req.getParameter("city"),req.getParameter("state"),req.getParameter("zipcode"),req.getParameter("phone"),req.getParameter("description"));
           genericDao.saveOrUpdate(user);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        req.setAttribute("user", genericDao.getById(Integer.parseInt(req.getParameter("id"))));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
        dispatcher.forward(req,resp);
    }
}
