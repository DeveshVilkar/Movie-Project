package com.jsp.theatre;
import java.util.Scanner;

public class BoxOffice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Theatre th=new Theatre("inox");
        boolean flag=true;
        while(flag){
            System.out.println("Enter 1.to show seat availabilty 2.Book ticket 3.to check the ticket detail 4.cancel the ticket 5. exit");
            int a= sc.nextInt();
            switch (a){
                case 1:{
                    int numberofseats= th.getNo_of_seats();
                    System.out.println(numberofseats +" seats are available");
                }break;
                case 2:{
                    System.out.println("enter the movie name=");
                    String name=sc.next();
                    System.out.println("enter the number of ticket to book");
                    int tickets=sc.nextInt();
                    th.setTicket(new Ticket(name,tickets));
                   int res= th.bookTicket();
                    System.out.println("successfully booked "+res+" tickets");
                }break;
                case 3:{
                    System.out.println("ticket details");
                    th.printAllDetail();
                }break;
                case 4:{
                    System.out.println("enter the number of ticket to cancel=");
                    int cancel=sc.nextInt();
                    th.cancelTicket(cancel);
                }break;
                case 5:{
                    flag=false;
                }break;
                default:{
                    System.out.println("wrong input");
                }break;
            }

        }



    }

}
