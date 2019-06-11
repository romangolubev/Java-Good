package com.golubev.Homework_1;

/*
Сделай три раздельных if. Будет гораздо читабельнее 
Ты в каждом ифе выводишь на экран. Зачем? Можно один раз в конце (закоментированный код)
*/
public class Task_3 {
    public static void main(String[] args) {
        // имена переменных с маленькой буквы
        int Number1 = 0;
        if (Number1 > 0) {
            Number1++;
            System.out.print(Number1);
        }
        else {
            if (Number1 < 0) {
                Number1 -= 2;
                System.out.print(Number1);
            }
            else {
                // не выводи просто 10. Присвой значение переменной и выводи переменную
                System.out.print(10);
            }


        }
        // System.out.print(Number1); <- одного раза достаточно.
    }
}
