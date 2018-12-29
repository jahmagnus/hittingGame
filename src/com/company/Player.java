package com.company;


import java.util.Random;

public class Player {

    Random rand = new Random();
    private int healthPoints;


    public Player() {
        this.healthPoints = 100;

    }

    public int getHealthPoints() {
        return this.healthPoints;
    }


    @Override
    public String toString() {
        return "Player{" +
                "healthPoints=" + healthPoints;
    }

   private boolean hasPunch(){
        int randomNumber = rand.nextInt(10) + 1;

        if (randomNumber <= 2) {
            return false;
        }
        else {
            return true;
        }
   }

   public void damageDone(){
        int damageAmount = 0;
        if (!hasPunch()){
            System.out.println("Punch Missed!");;
        }
        else {
            damageAmount = rand.nextInt(15) + 1;
            System.out.println("Punch landed! " + damageAmount + " damage done");
            this.healthPoints -= damageAmount;
        }
   }

}