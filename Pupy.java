package com.company;

final public class Pupy extends Dog implements Cloneable{

    private int years;

    public Pupy(String name, String typeOfAnimal, String barking, String color, int years) {
        super(name, typeOfAnimal, barking, color);
        this.years = years;
    }

    final public void setYears(int years) {
        this.years = years;
    }

    final public int getYears() {
        return this.years;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public void jump() {
        System.out.println("The " + this.getTypeOfAnimal() + " "
                + this.getName() + " cannot jump, it is so small");
    }

    @Override
    public String toString() {
        return super.toString() + " It is " + years + " years old.";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 2*years;
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
        Pupy an = (Pupy) ob;
        if (color == null) {
            if (an.color != null) {
                return false;
            }
        } else if (!color.equals(an.color)) {
            return false;
        }
        if (typeOfAnimal == null) {
            if (an.typeOfAnimal != null) {
                return false;
            }
        } else if (!typeOfAnimal.equals(an.typeOfAnimal)) {
            return false;
        }
        if (voice == null) {
            if (an.voice != null) {
                return false;
            }
        } else if (!voice.equals(an.voice)) {
            return false;
        }
        if (name == null) {
            if (an.name != null) {
                return false;
            }
        } else if (!name.equals(an.name)) {
            return false;
        }

        if (years != an.years) {
            return false;
        }

        return true;
    }
}
