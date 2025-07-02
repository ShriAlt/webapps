package com.xworkz.comb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(urlPatterns = "/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {

    private static final String UPLOAD_DIR = "C:/Users/shrih/OneDrive/Pictures/Documents/webapps/comb/resource/userImages";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File(UPLOAD_DIR);
        Part part = req.getPart("image");
        String fileName = part.getSubmittedFileName();
        String fullPath = UPLOAD_DIR + File.separator + fileName;
        part.write(fullPath);
    }
}
