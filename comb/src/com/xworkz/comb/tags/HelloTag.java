package com.xworkz.comb.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport{

        private String name;

        // Setter method for the attribute
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int doStartTag() throws JspException {
            try {
                // Write to the response
                pageContext.getOut().println("Hello, " + name + "! Welcome to Custom Tags.");
            } catch (IOException e) {
                throw new JspException("Error in HelloTag", e);
            }
            return SKIP_BODY; // No body content
        }
    }


