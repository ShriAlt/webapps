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
@WebServlet(urlPatterns = "/OtpServlet")
public class OtpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userOtp=req.getParameter("otp");
        UserService userService=new UserServiceImpl();
        HttpSession session = req.getSession();
        String sentOtp = (String) session.getAttribute("sentOtp");
        String userId = (String) session.getAttribute("userId");
        String result=userService.validateOtp(userOtp,sentOtp,userId);
        System.out.println(result);
        System.out.println("sent :"+sentOtp+"usr :"+userOtp);
        if (result.equals("true")){

            session.setAttribute("userName",userId);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("ResetPage.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            String error="otp is wrong ";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Otp.jsp");
            requestDispatcher.forward(req,resp);
        }

    }
}
