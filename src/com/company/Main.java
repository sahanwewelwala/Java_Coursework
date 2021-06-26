package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput="";

        Hotel h1=new Hotel();
       // Room r1=new Room();
        h1.initialise(); //better to initialise in a procedure

        while (!userinput.equals("q")){
            print_menu();
            userinput=input.next();
            if (userinput.equals("v")){
                h1.rooms();
            }else if (userinput.equals("a")){
                h1.guest();
            }else if(userinput.equals("e")){
                h1.empty_Rooms();
            }else if(userinput.equals("d")){
                h1.delete_guest();
            }else if(userinput.equals("f")){
                h1.find_User();

            }else if (userinput.equals("q")){
                System.out.println("System Exit");
            }else if(userinput.equals("s")){
                try {
                    h1.store_value();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if(userinput.equals("l")){
                try {
                    h1.load_Data();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if (userinput.equals("o")){
                h1.ordered_alphabatically();
            }

        }
    }
    private static void print_menu(){
        System.out.println("\n ---------------------------------- ");
        System.out.println("Enter 'v' to view room ");
        System.out.println("Enter 'a' to add Room Guest");
        System.out.println("Enter 'e' to view empty rooms");
        System.out.println("Enter 'd' to delete customer");
        System.out.println("Enter 'f' to find guest name");
        System.out.println("Enter 's'to Store data");
        System.out.println("Enter 'l'to load data from file");
        System.out.println("Enter 'o'to view names in alphabatic order");
        System.out.println("Enter 'q'to exit");


    }

}

