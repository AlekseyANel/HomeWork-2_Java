
package com.alevel;
public class Main {

    public static <Char> void main(String[] args) {
        int num = 347693485;


//        Task1
        int j;
        for (int i = 1; i < num; i = i * 10) {
            j = (num / i) % 10;
            if ((j % 2 == 0) && (j % 3 == 0)) {
                System.out.println(j + " fizzbuzz");
            } else {
                if (j % 2 == 0) {
                    System.out.println(j + " fizz");
                } else {
                    if (j % 3 == 0) {
                        System.out.println(j + " buzz");
                    } else {
                        System.out.println("сама цифра = " + j);
                    }
                }
            }
        }
//        Task1.1
//        String numS=String.valueOf(num);
//        System.out.println(numS+" - уже строка");
        //    for (int k=0; k<= s.length(numS); k++) {
        //      char charNum = numS.charAt(k);
        //    if charNum
        //   }


//     Task2
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
