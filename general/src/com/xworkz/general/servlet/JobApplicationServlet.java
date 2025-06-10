package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobApplicationDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/JobApplicationServlet")
public class JobApplicationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String fullName = req.getParameter("fullName");
         String email = req.getParameter("email");
         String education = req.getParameter("education");
         String skills = req.getParameter("skills");
         int expectedSalary = Integer.parseInt(req.getParameter("expectedSalary"));
         String experience = req.getParameter("experience");

        JobApplicationDTO jobApplicationDTO= new JobApplicationDTO(fullName,email,education,skills,expectedSalary,experience);
        System.out.println("dto"+jobApplicationDTO);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("");
        req.setAttribute("jobDto",jobApplicationDTO);
        requestDispatcher.forward(req,resp);
    }
}
