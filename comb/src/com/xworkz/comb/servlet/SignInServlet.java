package com.xworkz.comb.servlet;

import com.xworkz.comb.dto.UserDTO;
import com.xworkz.comb.service.UserService;
import com.xworkz.comb.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/SignInServlet")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO dto=new UserDTO();
        dto.setUserId(req.getParameter("userId"));
        dto.setPassword(req.getParameter("password"));
        UserService userService=new UserServiceImpl();
        String result=userService.check(dto);
        if (result.equals("true")){
            req.setAttribute("dto",dto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            String error="id and password  do not match";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignInPage.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
