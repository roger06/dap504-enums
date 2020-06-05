package com.dap504;

public class Player {

    String firstName, lastName;
    int serverPower;



   public  static final int numPlayers = 8;


    public Player(String firstName, String lastName, int serverPower) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.serverPower = serverPower;

    }

    public Player() {
    }

    public static  void showNumPlayers(){

        System.out.println(numPlayers);


    }





    public void  getServerPower() {
        System.out.println(serverPower); ;
    }
}
