package com.xworkz.general.servlet;

import com.xworkz.general.dto.BirthCertificateDTO;
import com.xworkz.general.service.BirthCertificateImpl;
import com.xworkz.general.service.BirthCertificateService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/BirthCertificateServlet")
public class BirthCertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String birthId=req.getParameter("birthId");
        String hospitalName=req.getParameter("hospitalName");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        LocalDate dateOfBirth= LocalDate.parse(req.getParameter("dateOfBirth"));
        LocalTime timeOfBirth= LocalTime.parse(req.getParameter("timeOfBirth"));
        String doctorName=req.getParameter("doctorName");
        String nurseName=req.getParameter("nurseName");
        String hospitalType=req.getParameter("hospitalType");

        BirthCertificateDTO dto=new BirthCertificateDTO(birthId,hospitalName,fatherName,motherName,dateOfBirth,timeOfBirth,doctorName,nurseName,hospitalType);
        System.out.println("dto:"+dto);

        BirthCertificateService birthCertificateService=new BirthCertificateImpl();
        birthCertificateService.birthCertificateValidate(dto);


    }
}
