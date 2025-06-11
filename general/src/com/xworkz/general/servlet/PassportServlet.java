package com.xworkz.general.servlet;

import com.xworkz.general.dto.PassportDTO;
import com.xworkz.general.service.PassportService;
import com.xworkz.general.service.PassportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/PassportApplicationServlet")
public class PassportServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String applicantName =req.getParameter("applicantName");
        double aadhaarNo =Double.parseDouble(req.getParameter("aadhaarNo"));
        String address =req.getParameter("address");
        double panNo =Double.parseDouble(req.getParameter("panNo"));
        String country =req.getParameter("country");
        String state =req.getParameter("state");
        String city =req.getParameter("city");
        int pinCode =Integer.parseInt(req.getParameter("pinCode"));
        String passportType =req.getParameter("passportType");
        double paymentRef =Double.parseDouble(req.getParameter("paymentRef"));

        PassportDTO passportDTO=new PassportDTO(applicantName,aadhaarNo,address,panNo,country,state,city,pinCode,passportType,paymentRef);
        System.out.println("dto :"+passportDTO);

        PassportService passportService=new PassportServiceImpl();
        passportService.validate(passportDTO);
    }
}
