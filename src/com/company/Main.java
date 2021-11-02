package com.company;

import java.util.Scanner;

public class Main {

    public static void BMI(){

        double BMI;
        BMI = getDataFromUser();
        System.out.format("Your BMI is: %.2f ", BMI);
        if(BMI < 18.5) System.out.println("You are underweight");
        else if (BMI > 25) System.out.println("You are overweight");
        else System.out.println("Your weight is correct");
    }

    public static double getDataFromUser(){
        double weight = 0;
        double height = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your weight (in kg)");
        if(scanner.hasNextDouble()){
            weight = scanner.nextDouble();
        }
        else{
            System.out.println("You provided wrong number");
        }
        System.out.println("Please provide your height (in m)");
        if(scanner.hasNextDouble()){
            height = scanner.nextDouble();
        }
        else{
            System.out.println("You provided wrong number");
        }
        return BMIcount(weight, height);
    }

    public static double BMIcount(double weight, double height){
        return weight / (height * height);
    }
    public static void main(String[] args) {
	BMI();
    }
}
