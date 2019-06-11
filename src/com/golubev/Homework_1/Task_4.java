package com.golubev.Homework_1;

public class Task_4 {
    public static void main(String[] args){
        int Number1=-2;
        int Number2=2;
        int Number3=3;
        int k;
if (Number1>0) {
    Number1=1;
}
else {Number1=0;}
if (Number2>0) {
            Number2=1;
        }
        else {Number2=0;}
        if (Number3>0) {
            Number3=1;
        }
        else {
            Number3=0;}
        k=Number1+Number2+Number3;
        System.out.print("Количество положительных чисел "+k);

    }
}
