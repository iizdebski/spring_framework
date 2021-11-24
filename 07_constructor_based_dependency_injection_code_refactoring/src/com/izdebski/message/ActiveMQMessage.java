package com.izdebski.message;

public class ActiveMQMessage implements Messaging {

    public void sendMessage(){
        System.out.println("Sending message Via Active MQ ...");
    }
}