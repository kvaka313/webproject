package com.infopulse.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAtributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
       String value = (String)event.getValue();
       String name= (String)event.getName();
       HttpSession hs = event.getSession();
       value+=" from listener";
       hs.setAttribute(name, value);

    }
}
