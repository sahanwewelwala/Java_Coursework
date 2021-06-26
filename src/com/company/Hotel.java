package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.Scanner;

public class Hotel {
     String roomName="";
     int roomNum = 0;
     String  payingname="";
     String  payingsurname="";
     String  creditcardno="";
     int number_guests=0;


    String userinput="";
    Room rooms[]= new Room[6];
    //Person payguest[]=new Person[6];

    public void initialise() {
        for (int x = 0; x <6; x++ ) {
            rooms[x]= new Room();
            rooms[x].setdataguest(x,"empty",x,"empty","empty","000000000000000",0);
          //  payguest[x]=new Person();

        }

        System.out.println( "initilise");
    }

    //Available
    void rooms() {
        System.out.println( " rooms in the hotel");
        for (int x = 0; x <rooms.length; x++ ) {

            System.out.println(rooms[x].getdata());
            System.out.println();


        }

    }
    //Add new guest method
    public  void guest(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  room number :") ;
        roomNum = input.nextInt();
        System.out.print("Enter name for room " + roomNum +" :" ) ;
        roomName = input.next();
        System.out.print("Enter paying guest name :");
         payingname =input.next();
        System.out.print("Enter paying guest surname :");
         payingsurname =input.next();
        System.out.print("Enter paying guest Credit card number :");
        creditcardno=input.next();
        System.out.print("Enter  number of guests :");
        number_guests=input.nextInt();
        rooms[roomNum].setdataguest(roomNum,roomName,roomNum,payingname,payingsurname,creditcardno,number_guests);
        System.out.println(rooms[roomNum].getdata());

    }
    //Empty rooms method
    void empty_Rooms(){
        for (int x = 0; x <rooms.length; x++ ) {
            rooms[x].viewempty();

        }
    }

    //delete user
    public void  delete_guest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter which room to delete guest:") ;
        roomNum=input.nextInt();
        System.out.println(rooms[roomNum].getdata());
        rooms[roomNum].setdataguest(roomNum, "empty",roomNum,"empty","empty","000000000000",0);
        System.out.println("\nRoom "+roomNum+" User Deleted Succesfully");

    }
    //find_User
    void  find_User(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter which room  guest you want to find:") ;
        String guestName=input.next();
        for(int i = 0; i < rooms.length; i++) {
            rooms[i].findguest(guestName);
        }
    }
    //storing data to text file
    public  void store_value()throws Exception{

        try (FileWriter writer = new FileWriter("C:/Users/Sahan Wewelwala/IdeaProjects/HotelCourseWorkPart2/src/com/company/data.txt")) {

            for (int i = 0; i<rooms.length; ++i) {

                writer.write(rooms[i].getdatatostore()+"\n");


            }
            writer.close();
            System.out.println("Succesfully Stored Data");
        }


    }
    //Retriving data to object class
    public void  load_Data()throws Exception{
        // Open this file.
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Sahan Wewelwala/IdeaProjects/HotelCourseWorkPart2/src/com/company/data.txt"));

        // Read lines from file.
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            // Split line on comma.
            String[] parts = line.split(" ");

                rooms[Integer.parseInt(parts[0])].setdataguest(Integer.parseInt(parts[0]),parts[1],Integer.parseInt(parts[0]),parts[2],parts[3],parts[4],Integer.parseInt(parts[5]));


        }
        for (int x=0;x<6;x++) {
            System.out.println("\n"+rooms[x].getdata());
        }
        reader.close();

    }



    //Print name in alphabatic order
    void ordered_alphabatically(){
        String  temp;
        String[] ord_list=new String[6];

        for(int i = 0; i <ord_list.length; i++){
            ord_list[i]=rooms[i].getGuest_name();

        }
        for (int i = 0; i < ord_list.length; i++)
        {
            for (int j = i + 1; j < ord_list.length; j++) {
                String [] sort=new String[8];

                if (ord_list[i].compareTo(ord_list[j])>0)
                {
                    temp = ord_list[i];
                    ord_list[i] = ord_list[j];
                    ord_list[j] = temp;
                }
            }
        }
       System.out.println("Guest list-"+ Arrays.toString(ord_list));
    }

}
