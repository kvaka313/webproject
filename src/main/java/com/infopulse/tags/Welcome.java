package com.infopulse.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class Welcome extends BodyTagSupport {
    private String name;

    @Override
    public int doStartTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.println("Hello, "+name);
        }
        catch( IOException ioException ) {
            throw new JspException( ioException.getMessage() );
        }
        return EVAL_BODY_BUFFERED;
    }


    @Override
    public int doEndTag(){
        String body = getBodyContent().getString();
        JspWriter out = pageContext.getOut();
        try {
            out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
