package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Player playerOne = new Player();
    private static Player playerTwo = new Player();
    public static void main(String[] args) {

        boolean quit = false;

        while (playerOne.getHealthPoints() >0 && playerTwo.getHealthPoints() >0 && !quit){

            System.out.println("0 - quit\n" +
                    "1 - Player One Punch\n" +
                    "2 - Player two Punch");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0: quit = true;
                    System.out.println("You Quit, You Lose!");
                break;

                case 1: playerOnePunch();
                break;

                case 2: playerTwoPunch();
                break;
            }
        }

    }

    public static void playerOnePunch(){
        playerTwo.damageDone();
        if (playerTwo.getHealthPoints()<= 0){
            System.out.println("PLAYER ONE WINS!!!\n" +
                    "░░░░░░░░░░░░▄▄▄█▀▀▀▀▀▀▀▀█▄▄▄░░░░░░░░░░░░\n" +
                    "░░░░░░░░▄▄█▀▀░░░░░░░░░░░░░░▀▀█▄▄░░░░░░░░\n" +
                    "░░░░░░▄█▀░░░░▄▄▄▄▄▄▄░░░░░░░░░░░▀█▄░░░░░░\n" +
                    "░░░░▄█▀░░░▄██▄▄▄▄▄▄▄██▄░░░░▄█▀▀▀▀██▄░░░░\n" +
                    "░░░█▀░░░░█▀▀▀░░▄██░░▄▄█░░░██▀▀▀███▄██░░░\n" +
                    "░░█░░░░░░▀█▀▀▀▀▀▀▀▀▀██▀░░░▀█▀▀▀▀███▄▄█░░\n" +
                    "░█░░░░░░░░░▀▀█▄▄██▀▀░░░░░░░░▀▄▄▄░░░▄▄▀█░\n" +
                    "█▀░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▀▀▀▀░░▀█\n" +
                    "█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄░░░░█\n" +
                    "█░░░░░░░░░░░░░░░░░░░░░░░░▄▄▄▄▄██░░▀█░░░█\n" +
                    "█░░░░░░░░░░░░░░█░░░▄▄▄█▀▀▀░░░▄█▀░░░░░░░█\n" +
                    "█░░░░░░░░░░░░░░░░░░▀░░░░░░░░█▀░░░░░░░░░█\n" +
                    "█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█\n" +
                    "░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░\n" +
                    "░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░░\n" +
                    "░░░█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█░░░\n" +
                    "░░░░▀█▄░░░░░░░░░░░░░░░░░░░░░░░░░░▄█▀░░░░\n" +
                    "░░░░░░▀█▄░░░░░░░░░░░░░░░░░░░░░░▄█▀░░░░░░\n");
        } else {
            System.out.println("========================\n" +
                    "Health: PLAYER TWO  " + playerTwo.getHealthPoints() +
                    "\n========================");
        }
    }

    public static void playerTwoPunch(){
        playerOne.damageDone();
        if (playerOne.getHealthPoints() <=0) {
            System.out.println("KO PLAYER TWO WINS!!!\n" +
                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                    "░░░░░░░░░░░░░▄▄▄▄▄▄▄░░░░░░░░░\n" +
                    "░░░░░░░░░▄▀▀▀░░░░░░░▀▄░░░░░░░\n" +
                    "░░░░░░░▄▀░░░░░░░░░░░░▀▄░░░░░░\n" +
                    "░░░░░░▄▀░░░░░░░░░░▄▀▀▄▀▄░░░░░\n" +
                    "░░░░▄▀░░░░░░░░░░▄▀░░██▄▀▄░░░░\n" +
                    "░░░▄▀░░▄▀▀▀▄░░░░█░░░▀▀░█▀▄░░░\n" +
                    "░░░█░░█▄▄░░░█░░░▀▄░░░░░▐░█░░░\n" +
                    "░░▐▌░░█▀▀░░▄▀░░░░░▀▄▄▄▄▀░░█░░\n" +
                    "░░▐▌░░█░░░▄▀░░░░░░░░░░░░░░█░░\n" +
                    "░░▐▌░░░▀▀▀░░░░░░░░░░░░░░░░▐▌░\n" +
                    "░░▐▌░░░░░░░░░░░░░░░▄░░░░░░▐▌░\n" +
                    "░░▐▌░░░░░░░░░▄░░░░░█░░░░░░▐▌░\n" +
                    "░░░█░░░░░░░░░▀█▄░░▄█░░░░░░▐▌░\n" +
                    "░░░▐▌░░░░░░░░░░▀▀▀▀░░░░░░░▐▌░\n" +
                    "░░░░█░░░░░░░░░░░░░░░░░░░░░█░░\n" +
                    "░░░░▐▌▀▄░░░░░░░░░░░░░░░░░▐▌░░\n" +
                    "░░░░░█░░▀░░░░░░░░░░░░░░░░▀░░░\n" +
                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        } else {
            System.out.println("=========================\n" +
                    "Health: PLAYER ONE  " + playerOne.getHealthPoints() +
                    "\n=========================");

        }
    }
}
