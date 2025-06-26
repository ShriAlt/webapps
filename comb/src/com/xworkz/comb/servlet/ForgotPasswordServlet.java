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
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(urlPatterns = "/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String userId=req.getParameter("userId");
       UserDTO dto=new UserDTO();
       dto.setUserId(userId);
        UserService userService=new UserServiceImpl();
       String result= userService.checkUserId(dto);
       if (result.equals(userId)){
          String sentOtp= userService.sendOtp(userId);
           HttpSession session = req.getSession();
           session.setAttribute("sentOtp", sentOtp);
           session.setAttribute("userId", userId);

           RequestDispatcher rd = req.getRequestDispatcher("Otp.jsp");
           rd.forward(req, resp);

       }
       else {
           String error="User Id not found";
           req.setAttribute("error",error);
           RequestDispatcher requestDispatcher=req.getRequestDispatcher("ForgotPassword.jsp");
           requestDispatcher.forward(req,resp);

       }

    }
}
