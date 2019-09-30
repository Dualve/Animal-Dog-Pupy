package com.company;

import java.lang.management.ClassLoadingMXBean;

public class Dog extends Animal implements Cloneable {

    protected String name;


    public Dog(String name, String typeOfAnimal,
               String barking, String color) {
        super(typeOfAnimal, color , barking);
        this.name = name;
    }

    final public void setName(String name) {
        this.name = name;
    }

    final public String getName() {
        return this.name;
    }

    public void bark(){
        System.out.println(this.getVoice() + " " + this.getVoice() + ".");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public void run() {
        System.out.println("The " + this.getTypeOfAnimal() + " "
                + this.getName() + " is running");
    }

    @Override
    public void jump(){
        System.out.println("The " + this.getTypeOfAnimal() + " "
                + this.getName() + " is jumping");
    }

    @Override
    public void bite(){
        System.out.println("The " + this.getTypeOfAnimal() + " "
                + this.getName() + " is trying to bite");
    }

    @Override
    public String toString(){
        return super.toString() + " Its name is " + this.name + ".\n" ;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + (name == null? 4: name.hashCode());
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) {
            return true;
        }
        if (ob == null) {
            return false;
        }
        if (getClass() != ob.getClass()) {
            return false;
        }
        Dog an = (Dog) ob;
        if (color == null) {
            if (an.color != null) {
                return false;
            }
        }
        else if (!color.equals(an.color)){
            return false;
        }
        if(typeOfAnimal == null){
            if(an.typeOfAnimal != null){
                return false;
            }
        }
        else if(!typeOfAnimal.equals(an.typeOfAnimal)){
            return false;
        }
        if(voice == null){
            if(an.voice != null){
                return false;
            }
        }
        else if(!voice.equals(an.voice)){
            return false;
        }
        if(name == null){
            if(an.name != null){
                return false;
            }
        }
        else if(!name.equals(an.name)){
            return false;
        }

        return true;
    }

}
