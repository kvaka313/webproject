package com.infopulse.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class Welcome extends TagSupport {
    public int doStartTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.println("Hello, all");
        }
        catch( IOException ioException ) {
            throw new JspException( ioException.getMessage() );
        }
        return SKIP_BODY;
    }
}
