package com.company;

public class Main {

    public static void main(String[] args) {
        Pupy karl1 = new Pupy("Simon", "Dog", "Woof", "Gray", 1);
        Pupy karl2 = new Pupy("Simon", "Dog", "Woof", "Gray", 2);
        Pupy karl3 = new Pupy("Ted", "Dog", "Woof", "Gray", 1);

        Dog karl4 = new Pupy("Simon", "Dog", "Woof", "Gray", 1);
        Dog karl5 = new Pupy("Simon", "Dog", "Woof", "Gray", 2);

        Animal karl6 = new Pupy("Simon", "Dog", "Woof", "Gray", 1);
        Animal karl7 = new Dog("Simon", "Dog", "Woof", "Gray");

        Dog karl8 = new Dog("Simon", "Dog", "Woof", "Gray");

        System.out.println("\n\n");

        System.out.println(CloneDog.cloneDog(karl8).toString());
        System.out.println(ClonePupy.clonePupy(karl1).toString());
        System.out.println(karl1.toString());

        System.out.println("\n\n");

        System.out.println(karl1.getClass() + " karl1");
        System.out.println(karl4.getClass() + " karl4");
        System.out.println(karl7.getClass() + " karl7");

        System.out.println("\n\n");

        //karl4.getYears() - так как ссылка на Dog а данный метод там не определен
        //karl6.bark() - так как ссылка на Animal а данный метод там не определен
        karl2.bark();
        karl2.jump();
        karl3.run();
        karl3.bite();

        System.out.println();

        System.out.println(karl1.hashCode() + " karl1\n" + karl4.hashCode() +" karl4\n" + karl6.hashCode() + " karl6");
        System.out.println(karl7.hashCode() + " karl6");

        System.out.println("");

        System.out.println(karl1.equals(karl2) + " karl 1 and 2");
        System.out.println(karl1.equals(karl3) + " karl 1 and 3");
        System.out.println(karl1.toString());

        System.out.println("");

        System.out.println(karl4.equals(karl5) + " karl 4 and 5");
        System.out.println(karl4.equals(karl1) + " karl 1 and 4");
        System.out.println(karl5.toString());

        System.out.println("");

        System.out.println(karl6.equals(karl1) + " karl 1 and 6");
        System.out.println(karl6.equals(karl4) + " karl 4 and 6");
        System.out.println(karl6.equals(karl7) + " karl 6 and 7");

        System.out.println(karl6.toString());
        System.out.println(karl7.toString());

        System.out.println(" ");

        System.out.println(Animal.getAmount() + " - amount of animal.");
    }
}
