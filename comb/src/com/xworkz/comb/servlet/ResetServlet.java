package com.xworkz.comb.servlet;

import com.xworkz.comb.service.UserService;
import com.xworkz.comb.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(urlPatterns = "/ResetServlet")
public class ResetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String userId= (String) session.getAttribute("userId");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");
        UserService userService=new UserServiceImpl();
        String result=userService.updatePassword(userId,password,confirmPassword);
        System.out.println("pass ;"+password+"con :"+confirmPassword);
        System.out.println(result);
        System.out.println(userId);
        if (result.equals("true")){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            String error="password do not match";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("ResetPage.jsp");
            requestDispatcher.forward(req,resp);
        }

    }
}
