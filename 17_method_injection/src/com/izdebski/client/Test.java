package com.izdebski.client;

import com.izdebski.model.Ticket;
import com.izdebski.model.TicketVendingMachine;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        TicketVendingMachine ticketVendingMachine = ctx.getBean("ticketVendingMachine", TicketVendingMachine.class);

        Ticket ticket = ticketVendingMachine.generateTicket();

        System.out.println(ticket.printTicket());
        ctx.close();
    }
}