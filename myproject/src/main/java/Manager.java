package com.xyzcorp;

public class Manager extends Employee implements Intoxicatable {
   
   private boolean isDrunk;
   private int count;

   public Manager(String firstName, String lastName, boolean isDrunk) {
      super(firstName, lastName);
      this.isDrunk = isDrunk;
   }

   public String drink() {
       count++;
       if (count == 10) isDrunk = true;
       return "These people don't listen to me!";
   }

   public boolean isDrunk() {
       return isDrunk;
   }

   public String favoriteChaser() {
       return "Everclear";
   }
}
