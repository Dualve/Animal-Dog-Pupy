package com.company;

public class ClonePupy {
    static Pupy clonePupy(Pupy ob){
        try{
            ob = (Pupy) ob.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        ob.setColor("Brown");
        ob.setTypeOfAnimal("Dog");
        ob.setVoice("Woof");
        ob.setYears(1);
        ob.setName("Doodge");

        return ob;
    }
}
