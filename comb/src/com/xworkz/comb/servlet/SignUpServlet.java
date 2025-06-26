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

@WebServlet(urlPatterns = "/SignUpServlet")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("userId");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");

        UserDTO dto=new UserDTO(userId,email,password,confirmPassword);
        UserService userService=new UserServiceImpl();
        String result=userService.validate(dto);
        if (result.equals("true")){
            req.setAttribute("dto",dto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            String error="please give valid information";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignUpPage.jsp");
            requestDispatcher.forward(req,resp);
        }

    }
}
