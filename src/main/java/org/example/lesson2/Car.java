package org.example.lesson2;

//package org.example;
//
//public class org.example.lesson2.Car extends Object {
//    private String color;
//    private String model;
//    private int price;
//    private String country;
//    public String getColor() { // геттер (Code -> Generate...)
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//    public void setCountry(String country) {
//        this.country = country;
//    }
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public org.example.lesson2.Car(String color, String model, int price, String country) { // конструктор, можно менять ид доступа
//        // в скобочках - аргументы, которые обязательно должны будут быть переданы
//        // важно! имя конструктора == имя класса
//        // тут переменная model сущ-вует только в рамках этого метода, отлична от той,
//        // что записана в начале  " private String model; "
//        this.model = model;
//        this.color = color;
//        this.price = price;
//        this.country = country;
//    }
//
//    @Override
//    public String toString() {
//        return  "org.example.lesson2.Car{" +
//                "color = ";
//
//    }
//
//// private - обращение к элементу только внутри класса
//// default - только внутри папки
//// public - везде
//// наследование по умолчанию - от класса Object, т е
//// " public class org.example.lesson2.Car extends Object " = " public class org.example.lesson2.Car "
//
//}
public class Car {
    private double maxFuelAmount;
    private double fuelConsumption;
    private double currentFuelAmount;
    // тип топлива в отдельном файле-классе типа enum (FuelType.java) -
    // тип данных для перечисления
    private String fuelType;

    public Car(double maxFuelAmount, double fuelConsumption, double currentFuelAmount) {
        this.maxFuelAmount = maxFuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.currentFuelAmount = currentFuelAmount;
    }

    public double distanceFuelEnough() {
        return currentFuelAmount / fuelConsumption * 100;
    }

    public void goTo(double km){
        currentFuelAmount -= fuelConsumption / 100 * km;
    }

    public double getCurrentFuelAmount() {
        return currentFuelAmount;
    }
}
