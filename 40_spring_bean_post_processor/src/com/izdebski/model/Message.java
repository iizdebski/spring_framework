package com.izdebski.model;

public class Message {

    private int messageId;
    private String message;

    public Message() {
        System.out.println("Constructor ...");
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        System.out.println("setMessageId");
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("setMessage");
        this.message = message;
    }

    public void init(){
        System.out.println("Bean is going through init...");
    }

    public void destroy(){
        System.out.println("Bean is going through destroy...");
    }
}