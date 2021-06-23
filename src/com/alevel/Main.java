
package com.alevel;
public class Main {

    public static <Char> void main(String[] args) {

//        Task1
        System.out.println("Task1");
        int num = 347693485;
        int j; //промежуточная переменная
        for (int i = 1; i < num; i = i * 10) //счётчик выхода из цикла
        {   j = (num / i) % 10; // захватывает цифры числа  по очереди  справа-налево
            if ((j % 2 == 0) && (j % 3 == 0)) {
                System.out.println(j + " fizzbuzz");
            } else {
                if (j % 2 == 0) {
                    System.out.println(j + " fizz");
                } else {
                    if (j % 3 == 0) {
                        System.out.println(j + " buzz");
                    } else {
                        System.out.println(j + "=сама цифра");
                    }
                }
            }
        }
        //     Task1.1
       System.out.println("Task1.1 со звездочкой");
        int j1;
        int i1=1;
        for (int m=10; num%m!=num; m=m*10) {i1=m;}//Выяснили i1: кол-во десяток в переменной m равно кол-ву цифр в числе num
        for (; i1 >= 1; i1 = i1 / 10) {
            j1 = (num / i1) % 10; // захватывает по очереди цифры числа слева-направо
            if ((j1 % 2 == 0) && (j1 % 3 == 0)) {
                System.out.println(j1 + " fizzbuzz");
            } else {
                if (j1 % 2 == 0) {
                    System.out.println(j1 + " fizz");
                } else {
                    if (j1 % 3 == 0) {
                        System.out.println(j1 + " buzz");
                    } else {
                        System.out.println(j1 + "=сама цифра");
                    }
                }
            }
        }



//     Task2
        System.out.println("Task2");
        long numN = 22122;
//        System.out.println(Long.toBinaryString(numN)+" - это бинари представление от числа " + numN);
        String numSB = Long.toBinaryString(numN);
        System.out.println(numSB + " - это уже строка из бинари");
        int count1 = 0;
       for (int l = 0; l <= numSB.length()-1; l++) {
            char charNum = numSB.charAt(l);
            if (charNum == '1') {
               count1++;
            }
        }
       System.out.println("Кол-во единичек= "+ count1);
    }
}
