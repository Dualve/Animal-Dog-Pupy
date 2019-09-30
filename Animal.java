package com.company;

public class Animal extends AbstractAnimal implements Cloneable{

    static private int amountOfAnimal;

    static {
        amountOfAnimal = 0;
    }

    protected String typeOfAnimal;
    protected String color;
    protected String voice;

    Animal() {
    }

    public Animal(String typeOfAnimal, String color, String voice) {

        this.color = color;
        this.typeOfAnimal = typeOfAnimal;
        this.voice = voice;
        Animal.increaseAmount();
    }

    static private void increaseAmount(){
        amountOfAnimal++;
    }

    static public int getAmount(){
        return amountOfAnimal;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    final public String getColor() {
        return this.color;
    }

    @Override
    final public void setColor(String color) {
        this.color = color;
    }

    @Override
    final public String getTypeOfAnimal() {
        return this.typeOfAnimal;
    }

    @Override
    final public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    @Override
    final public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    final public String getVoice() {
        return this.voice;
    }

    @Override
    public void run() {
        System.out.println(typeOfAnimal + " is running");
    }

    @Override
    public void jump() {
        System.out.println(typeOfAnimal + " is jumping");
    }

    @Override
    public void bite() {
        System.out.println(typeOfAnimal + " is trying to bite");
    }

    @Override
    public String toString() {

        return "This is " + this.typeOfAnimal + ". It has " + this.color + " color and voice - "
                + this.voice + ".";
    }

    @Override
    public int hashCode() {
        return (this.color == null ? 0 : color.hashCode()) + (this.voice == null ? 1 : voice.hashCode())
                + (this.typeOfAnimal == null ? 2 : typeOfAnimal.hashCode());
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null) {
            return false;
        }
        if (getClass() != ob.getClass()) {
            return false;
        }
        Animal an = (Animal) ob;
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

        return true;
}
}
