package com.company;

public abstract class AbstractAnimal {

    protected String typeOfAnimal;
    protected String color;
    protected String voice;

    AbstractAnimal() {
    }

    abstract public String getColor();

    abstract public void setColor(String color);

    abstract public String getTypeOfAnimal();

    abstract public void setTypeOfAnimal(String typeOfAnimal);

    abstract public void setVoice(String voice);

    abstract public String getVoice();

    public abstract void run();

    public abstract void jump();

    public abstract void bite();
}
