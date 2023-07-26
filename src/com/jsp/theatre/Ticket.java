package com.jsp.theatre;

public class Ticket {
    private String movie_name;
    private int no_of_ticket;

    public Ticket(String movien,int ticketno){
        this.movie_name=movien;
        this.no_of_ticket=ticketno;
    }
//    public void setMovie_name(String moviename){
//        this.movie_name=moviename;
//    }
    public String getMovie_name(){
        return movie_name;
    }
    public void setNo_of_ticket(int ticketno){
        this.no_of_ticket=ticketno;
    }
    public int getNo_of_ticket(){
        return no_of_ticket;
    }
    public void printTicket(){

        System.out.println("movie name= "+movie_name);
        System.out.println("ticket number="+no_of_ticket);

    }

}
