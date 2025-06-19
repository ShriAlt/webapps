package com.xworkz.shriharsha.servlet;

import com.xworkz.shriharsha.dto.LoginDTO;
import com.xworkz.shriharsha.service.LoginService;
import com.xworkz.shriharsha.service.LoginServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName =req.getParameter("userName");
        String password =req.getParameter("password");
        LoginDTO loginDTO=new LoginDTO(userName,password);
        LoginService loginService=new LoginServiceImpl();
        loginService.validate(loginDTO);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
        requestDispatcher.forward(req,resp);

    }
}
