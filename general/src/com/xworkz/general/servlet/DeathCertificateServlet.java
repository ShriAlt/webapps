package com.xworkz.general.servlet;

import com.xworkz.general.dto.DeathCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/DeathCertificateServlet")
public class DeathCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fullName =req.getParameter("fullName");
        String causeOfDeath =req.getParameter("causeOfDeath");
        LocalDate dateOfDeath =LocalDate.parse(req.getParameter("dateOfDeath"));
        LocalTime timeOfDeath =LocalTime.parse(req.getParameter("timeOfDeath"));
        int ageAtDeath =Integer.parseInt(req.getParameter("ageAtDeath"));
        String certifiedBy =req.getParameter("certifiedBy");
        String hospitalName =req.getParameter("hospitalName");
        String mannerOfDeath =req.getParameter("mannerOfDeath");
        String gender =req.getParameter("gender");
        String identifyingMarks =req.getParameter("identifyingMarks");

        DeathCertificateDTO deathCertificateDTO=new DeathCertificateDTO(fullName,causeOfDeath,dateOfDeath,timeOfDeath,ageAtDeath,certifiedBy,hospitalName,mannerOfDeath,gender,identifyingMarks);
        System.out.println("dto"+deathCertificateDTO);
    }
}
