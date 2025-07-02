package com.xworkz.comb.dto;

import java.io.File;
import java.io.Serializable;

public class ImageDTO implements Serializable {

    private   String fileName ;
    private   String contentType ;
    private   long size ;
    private   String userId ;
    private   String fullPath ;

    public ImageDTO() {
    }

    @Override
    public String toString() {
        return "ImageDTO{" +
                "fileName='" + fileName + '\'' +
                ", contentType='" + contentType + '\'' +
                ", size=" + size +
                ", userId='" + userId + '\'' +
                ", fullPath='" + fullPath + '\'' +
                '}';
    }

    public ImageDTO(String fileName, String contentType, long size, String userId, String fullPath) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.size = size;
        this.userId = userId;
        this.fullPath = fullPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
}
