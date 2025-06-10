package com.xworkz.general.servlet;

import com.xworkz.general.dto.MarriageCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
@WebServlet(urlPatterns = "/MarriageCertificateServlet")
public class MarriageCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName =req.getParameter("groomName");
        String brideName =req.getParameter("brideName");
        String location =req.getParameter("location");
        String address =req.getParameter("address");
        String religion =req.getParameter("religion");
        LocalDate marriageDate =LocalDate.parse(req.getParameter("marriageDate"));
        String witness1 =req.getParameter("witness1");
        String witness2 =req.getParameter("witness2");
        String officerPresent =req.getParameter("officerPresent");

        MarriageCertificateDTO marriageCertificateDTO=new MarriageCertificateDTO(groomName,brideName,location,address,religion,marriageDate,witness1,witness2,officerPresent);
        System.out.println("dto"+marriageCertificateDTO);

    }
}
