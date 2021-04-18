package com.company;



public class Main {

    public static void main(String[] args){

        Lamp.printStaticNumberOfObj();

        Lamp first_lamp = new Lamp();

        Lamp second_lamp = new Lamp("China", "ShanHaiElectric", 3, "glass");

        Lamp third_lamp = new Lamp("Germany", "EuropeElectric", 90, 360, 3, "plastic", "energysaving", 60);

        System.out.println(first_lamp);

        System.out.println(second_lamp);

        System.out.println(third_lamp);

        first_lamp.printNumberOfObj();

        first_lamp.resetValues("Ukraine", "Electric", 120, 90, 10, "glass", "super energysaving", 5);

        System.out.println(first_lamp);
    }
}

