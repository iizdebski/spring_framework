package com.izdebski.service;

import com.izdebski.message.Messaging;

public class Communication {

    private Messaging messaging;

    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
    }

    public void communicate(){
        messaging.sendMessage();
    }
}