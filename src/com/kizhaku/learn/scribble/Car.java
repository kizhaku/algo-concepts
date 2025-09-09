package com.learn.leetcode.scribble;

public class Car {

    String modelName;
    int modelYear;
    String constructor;

    public Car(String modelName, int modelYear, String constructor) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.constructor = constructor;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getConstructor() {
        return constructor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", constructor='" + constructor + '\'' +
                '}';
    }
}
