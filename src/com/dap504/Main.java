package com.dap504;

/**
 * demo for enums
 */
public class Main {



    public static void main(String[] args) {
	Player player1 = new Player();

        String directionOfShot = "left";
        String returnShot;
//
//        if (  directionOfShot.equals("left") ){
//           returnShot =  ShotType.BACKHAND.toString();
//        }
//
//        else {
//            returnShot = ShotType.FOREHAND.toString();
//        }
//
//
//        System.out.println("The return shot will be : " + returnShot);





        for (ShotType theShot: ShotType.values()) {

            System.out.println(theShot.name() + " = " + theShot);

        }


    }
}
