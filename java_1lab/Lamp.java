package com.company;

public class Lamp {
    private String countryProducer = "Ukraine";
    private String firmProducer = "Ukraine";
    private double lightingPower = 12;
    private double workingDuration = 3;
    private int price = 100;
    private String material = "glass";
    private static int numberOfObj = 0;
    protected String typeOfEnergyUse = "ordinary";
    protected double sizeInCm = 5;

    public Lamp() {
        numberOfObj += 1;
    }

    public Lamp(String countryProducer, String firmProducer, int price, String material ) {
        this.countryProducer = countryProducer;
        this.firmProducer = firmProducer;
        this.price = price;
        this.material = material;
        numberOfObj += 1;
    }
    public Lamp(String countryProducer, String firmProducer, double lightingPower,
                double workingDuration, int price, String material, String typeOfEnergyUse, double sizeInCm) {
        this(countryProducer, firmProducer, price, material);
        this.lightingPower = lightingPower;
        this.workingDuration = workingDuration;
        this.typeOfEnergyUse = typeOfEnergyUse;
        this.sizeInCm = sizeInCm;
        numberOfObj += 1;
    }



    @Override
    public String toString() {
        return "Lamp:\n"
                + "CountryProducer: " + countryProducer
                + ", \nFirmProducer: " + firmProducer
                + ", \nLightingPower: " + lightingPower
                + ", \nWorkingDuration: " + workingDuration
                + ", \nPrice: " + price
                + ", \nMaterial: " + material
                + ", \nType of energy use: " + typeOfEnergyUse
                + ", \nSizeInCm: " + sizeInCm + "\n";
    }

    public static void printStaticNumberOfObj() {
        System.out.println(numberOfObj);
    }

    public void printNumberOfObj() {
        System.out.println(numberOfObj);
    }

    public void resetValues(String countryProducer, String firmProducer, double lightingPower,
                            double workingDuration, int price, String material, String typeOfEnergyUse, double sizeInCm) {
        this.countryProducer = countryProducer;
        this.firmProducer = firmProducer;
        this.lightingPower = lightingPower;
        this.workingDuration = workingDuration;
        this.price = price;
        this.material = material;
        this.typeOfEnergyUse = typeOfEnergyUse;
        this.sizeInCm = sizeInCm;
    }

    public String getCountryProducer() {
        return this.countryProducer;
    }

    public String getFirmProducer() {
        return this.firmProducer;
    }

    public double getLightingPower() {
        return this.lightingPower;
    }

    public double getWorkingDuration() {
        return this.workingDuration;
    }

    public double getPrice() {
        return this.price;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    public void setFirmProducer(String firmProducer) {
        this.firmProducer = firmProducer;
    }

    public void setLightingPower(double lightingPower) {
        this.lightingPower = lightingPower;
    }

    public void setWorkingDuration(double workingDuration) {
        this.workingDuration = workingDuration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
