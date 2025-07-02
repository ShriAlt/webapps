package com.xworkz.comb.servlet;

import com.xworkz.comb.dto.ImageDTO;
import com.xworkz.comb.service.UserService;
import com.xworkz.comb.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
@WebServlet(urlPatterns = "/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("userId");
        UserService userService=new UserServiceImpl();
        System.out.println(userId);
        ImageDTO dto=userService.fetchImage(userId);
        System.out.println("servlet dto==="+dto);

        if (dto!=null){
            System.out.println("dto"+dto);
            req.setAttribute("dto",dto);
        }
        else {
            String error="userId do not exist or user yet to upload the image ";
            req.setAttribute("error",error);
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("ProfilePage.jsp");
        requestDispatcher.forward(req,resp);

    }
}
