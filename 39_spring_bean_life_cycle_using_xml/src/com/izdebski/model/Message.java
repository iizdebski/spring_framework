package com.izdebski.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PreDestroy;
import javax.xml.ws.Dispatch;

public class Message {

    private int messageId;
    private String message;

    @PreDestroy
    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void init() throws Exception {
        System.out.println("Bean is going through init process..");
    }
    public void destroy() throws Exception {
        System.out.println("Bean is going to destroy..");
    }
}