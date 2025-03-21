package ma.ensa.jeeexame1.controller;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.ensa.jeeexame1.dao.daoImpl.UserImpl;
import ma.ensa.jeeexame1.entity.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserController extends HttpServlet {
    public  void init() throws ServletException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        UserImpl userImpl = new UserImpl();
        List<User> users=userImpl.findAll();
        Gson gson = new Gson();
        String users_ser="";
        gson.toJson(users,User.class,out);



    }
}
