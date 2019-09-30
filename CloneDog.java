package com.company;

public class CloneDog {
    static Dog cloneDog(Dog ob){
        try{
            ob = (Dog) ob.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return ob;
    }
}
