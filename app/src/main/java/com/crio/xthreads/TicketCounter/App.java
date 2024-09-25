package com.crio.xthreads.TicketCounter;

public class App {
    public static void main(String[] args) {

        // TODO: Initialize the TicketCounter and Simulate Concurrent Ticket Booking.
        // 1. Initialize the TicketCounter object with a specific number of available tickets (e.g., 10 tickets).
        // 2. Create multiple customer threads using the CustomerThread class, each representing a customer
        //    attempting to book a certain number of tickets.
        // 3. Start all the customer threads to simulate concurrent ticket booking, allowing them to run in parallel.
        TicketCounter ticketCounter = new TicketCounter(30);

        Thread thread1 = new Thread(new CustomerThread(ticketCounter, "Aditya", 10));
        Thread thread2 = new Thread(new CustomerThread(ticketCounter, "Vishal", 5));
        Thread thread3 = new Thread(new CustomerThread(ticketCounter, "Shankar", 120));
        Thread thread4 = new Thread(new CustomerThread(ticketCounter, "Abhay", 20));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
