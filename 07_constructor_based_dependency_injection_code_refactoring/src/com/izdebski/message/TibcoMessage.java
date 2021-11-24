package com.izdebski.message;

public class TibcoMessage implements Messaging {

    @Override
    public void sendMessage() {
        System.out.println("Sending message via Tibco ...");
    }
}