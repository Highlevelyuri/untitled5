package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println(" Введите четное число и нажмите <Enter>");
        number = scanner.nextInt();
        if( number%2 == 0)
            System.out.println(number + "число четное");
        else
            System.out.println(number + " число нечетное");


    }
}
