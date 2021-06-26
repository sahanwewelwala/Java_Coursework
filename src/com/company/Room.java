package com.company;

public class Room extends Person {
    private int room_number;
    private String guest_name;
    private int no_guests;



    public void setdataguest(int id, String name,int payguestid,String pay_guest_name,String pay_guest_surname,String pay_guest_cardno,int guest_no) {
        this.room_number = id;
        this.guest_name = name;
        this.payguestid=payguestid;
        this.pay_guest_firstname=pay_guest_name;
        this.pay_guest_surname=pay_guest_surname;
        this.pay_guest_crcardno=pay_guest_cardno;
        this.no_guests=guest_no;

    }

    public void viewempty(){
            if (guest_name.contains("empty")) {
               System.out.println("Room Number "+room_number+" Is Empty");
            }

        }
    public void findguest(String findguest_name){

        if (guest_name.equals(findguest_name)) {
            System.out.println("Room Number "+room_number+" Is Ocupied by "+getGuest_name()+" \nPay guest name :"+ pay_guest_firstname+" \npayguest lastname :"+pay_guest_surname
                    +"\nPay guest card number :"+pay_guest_crcardno+"\nNumber of guest no:"+no_guests);
        }

      }

    public String getdata(){
        return "room number :"+room_number+" Guestname :"+guest_name+" \nPay guest name :"+ pay_guest_firstname+" \npayguest lastname :"+pay_guest_surname
                +"\nPay guest card number :"+pay_guest_crcardno+"\nNumber of guest no:"+no_guests;
    }
    public String getdatatostore(){
        return room_number+" "+guest_name+" "+ pay_guest_firstname+" "+pay_guest_surname +" "+pay_guest_crcardno+" "+no_guests;
    }

    public String getGuest_name() {
        return guest_name;
    }
}


