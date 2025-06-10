package com.xworkz.general.servlet;

import com.xworkz.general.dto.DrivingLicenseDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/DrivingLicenseServlet")
public class DrivingLicenseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String fullName =req.getParameter("fullName");
        String address =req.getParameter("address");
        double mobile =Double.parseDouble(req.getParameter("mobile"));
        String appliedDate =req.getParameter("appliedDate");
        String vehicleType =req.getParameter("vehicleType");
        DrivingLicenseDTO drivingLicenseDTO=new DrivingLicenseDTO(fullName,address,mobile,appliedDate,vehicleType);
        System.out.println("dto"+drivingLicenseDTO);
    }
}
