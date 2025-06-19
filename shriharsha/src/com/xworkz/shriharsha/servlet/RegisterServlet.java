package com.xworkz.shriharsha.servlet;

import com.xworkz.shriharsha.dto.RegisterDTO;
import com.xworkz.shriharsha.service.RegisterService;
import com.xworkz.shriharsha.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("fullName");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        String email=req.getParameter("email");
        String phoneNumber=req.getParameter("number");


        RegisterDTO registerDTO=new RegisterDTO(name,fatherName,motherName,email,phoneNumber);
        RegisterService registerService=new RegisterServiceImpl();
        registerService.validate(registerDTO);

        System.out.println("name:"+name);
        System.out.println("fatherName:"+fatherName);
        System.out.println("motherName:"+motherName);
        System.out.println("name:"+phoneNumber);
        System.out.println("name:"+email);
    }
}
