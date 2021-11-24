package com.izdebski.service;

import com.izdebski.message.ActiveMQMessage;

public class Communication {

    private ActiveMQMessage activeMQMessage;


    public Communication(ActiveMQMessage activeMQMessage) {
        super();
        this.activeMQMessage = activeMQMessage;
    }

    public void communicate(){
        activeMQMessage.sendMessage();
    }
}