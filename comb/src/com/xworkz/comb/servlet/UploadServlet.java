package com.xworkz.comb.servlet;

import com.xworkz.comb.dto.ImageDTO;
import com.xworkz.comb.service.UserService;
import com.xworkz.comb.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

@WebServlet(urlPatterns = "/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {

    private static final String UPLOAD_DIR = "C:/Users/shrih/OneDrive/Pictures/Documents/webapps/comb/resource/userImages";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Part imagepart = req.getPart("image");

        String fileName = imagepart.getSubmittedFileName();
        String contentType=imagepart.getContentType();
        long size=imagepart.getSize();
        String userId= req.getParameter("userId");
        String fullPath = UPLOAD_DIR + File.separator + fileName;

        imagepart.write(fullPath);
        //passing meta data
        ImageDTO imageDTO=new ImageDTO(fileName,contentType,size,userId,fullPath);
        System.out.println("image DTO"+imageDTO);
        UserService userService=new UserServiceImpl();
        String result=userService.validateImage(imageDTO);
        if (result.equals("true")){
            System.out.println("userId exsits");
        }
        else {
            System.out.println("user id do not exists");
            String error="user id do not exist";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("UploadImage.jsp");
            requestDispatcher.forward(req,resp);
        }




    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String fileName = req.getParameter("name");
        File file = new File(UPLOAD_DIR + File.separator + fileName);

        String contentType = getServletContext().getMimeType(file.getName());

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        resp.setContentType(contentType);

        try (OutputStream out = resp.getOutputStream()) {
            Files.copy(file.toPath(), out);
        }
    }
    }

