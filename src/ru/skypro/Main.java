package ru.skypro;

public class Main {

    public static void main(String[] args) {


        // Задание 4
        for (int i = 1; i<=30; i++){
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0){
                System.out.println(i + ": pong");
            } else if (i % 3 == 0){
                System.out.println(i + ": ping");
            } else {
                System.out.println(i + ":");
            }
        }


        // Задание 5
        // сделал строго используя две переменные, и так как вывести надо 8 чисел, то цикл уменьшил до 4
        // выводил по 2 числа




        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

//        for (int i = 1; i<= 4; i++){
//            a += b;
//            b += a;
//            System.out.print(a + " " + b + " ");
//        }

        //если выводить в консоль по 1 числу, то добавляем еще 1 переменную:
        int c;

        for (int i = 1; i<= 8; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
