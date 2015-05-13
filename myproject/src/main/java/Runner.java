package com.xyzcorp;

import static java.lang.System.out;

public class Runner {

   public static void main(String[] args) {
      Employee e = new Employee("Bob", "Barker");
      out.println("Hello " + e);
      out.println(e.laugh());

      Manager m = new Manager("Bill", "Lumbergh", false);
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.drink());
      out.println(m.isDrunk());
   }
}
