package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobApplicationDTO;
import com.xworkz.general.service.JobService;
import com.xworkz.general.service.JobServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/SearchAll")
public class JobSearchAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JobService jobService=new JobServiceImpl();
        List<JobApplicationDTO> dto=jobService.searchAll();
        if (dto==null){
            String error="not found";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("JobFullDetails.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            String result="Details are found";
            req.setAttribute("result",result);
            req.setAttribute("dto",dto);
            System.out.println("servlet"+dto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("JobFullDetails.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
