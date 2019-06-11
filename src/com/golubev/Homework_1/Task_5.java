package com.golubev.Homework_1;

public class Task_5 {
    public static void main(String[] args){
        int Number1=-2;
        int Number2=-2;
        int Number3=-3;
        int Number;
        int NumberA=0;
        if (Number1>0) {
            Number1=1;

        }
        else {Number1=0; NumberA+=1;}
        if (Number2>0) {
            Number2=1;

        }
        else {Number2=0; NumberA+=1;}
        if (Number3>0) {
            Number3=1;
        }
        else {
            Number3=0; NumberA+=1;}
        Number=Number1+Number2+Number3;
        System.out.println("Количество положительных чисел "+Number);
        System.out.print("Количество отрицательных чисел " + NumberA);

    }
}

