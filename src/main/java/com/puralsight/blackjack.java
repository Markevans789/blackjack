package com.puralsight;

import java.util.Scanner;

public class blackjack {
    static Scanner input = new Scanner(System.in);
    private static String Player1;
    private static String Player2;
    private static String Player3;
    private static String Player4;

    void Random() {

    }

    public static String main(String[] args){
        System.out.println("==== BLACKJACK ====");

        //Ask for player names
        System.out.println("Enter player1 names:");
        String player1 = input.nextLine().trim();

        System.out.println("Enter player2 names:");
        String player2 = input.nextLine().trim();

        System.out.println("Enter player3 names:");
        String player3 = input.nextLine().trim();

        System.out.println("Enter player4 names:");
        String player4 = input.nextLine().trim();
        
        if (player1.isEmpty()) player1 = "player1";
        if (player2.isEmpty()) player2 = "player2";
        if (player3.isEmpty()) player3 = "player3";
        if (player4.isEmpty()) player4 = "player4";

        System.out.println("\n Welcome " + Player1 + ", " + Player2 + "," + Player3 + "and" + Player4);
    }
}