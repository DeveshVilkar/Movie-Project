package com.jsp.theatre;

public class Theatre {
   private String theatre_name;
   private int no_of_seats=500;
   private Ticket ticket;

   public Theatre(String n){
       this.theatre_name=n;
   }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public String getTheatre_name() {
        return theatre_name;
    }

    public void setTheatre_name(String theatre_name) {
        this.theatre_name = theatre_name;
    }
//    code of theatre operation
    public int bookTicket(){
       if (ticket.getNo_of_ticket()<=no_of_seats){
           no_of_seats=no_of_seats - ticket.getNo_of_ticket();
           return ticket.getNo_of_ticket();
       }else{
           System.out.println("seat availability is less");
           return -1;
       }
    }
    public int seatAvailability(){
       return no_of_seats;
    }

//  printing all detail of movie
     public void printAllDetail(){
         System.out.println("========ticket detail========");
       System.out.println("Theatre name=" +theatre_name);
       ticket.printTicket();
}

//    cancelation code
    public void cancelTicket(int n){
       if (n<=ticket.getNo_of_ticket()){
           no_of_seats=no_of_seats+n;
           ticket.setNo_of_ticket(ticket.getNo_of_ticket()-n);
       }else {
           System.out.println("technical issue");
       }



    }
}
