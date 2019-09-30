package com.company;

public class CloneAnimal {
    static Animal cloneAnimal(Animal ob){
        try{
            ob = (Animal) ob.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        ob.setColor("Black");
        ob.setTypeOfAnimal("Cat");
        ob.setVoice("Mia");
        return ob;
    }
}
