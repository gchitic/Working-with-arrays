package com.company;

import java.util.Scanner;

public class Practica {
    public int sum() {
        int[] array;
        array = new int[4];
        int suma=0;
        for(int i=0;i<4;i++) {
            array[i] = new Scanner(System.in).nextInt();
            suma += array[i];
        }
        return suma;
    }

    public void reverse() {
        int[] array;
        array = new int[4];
        for(int i=0;i<4;i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        //Afisarea
        for(int i=3;i>=0;i--) {
            System.out.println( array[i] );
            //System.out.println( i );
        }
    }

    public int maxim() {
        int[] array;
        array = new int[5];
        for(int i=0;i<4;i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        int max;
        max=array[0];
        for(int i=0;i<4;i++) {
            if(array[i]>max) max=array[i];
        }
        return max;
    }

    public void FindLetter() {
        char[] array;
        array = new char[6];
        for(int i=0;i<6;i++) {
            array[i] = new Scanner(System.in).next().charAt(0);
        }
        for(int i=0;i<6;i++) {
            System.out.print(array[i]+"-");
            switch (array[i]) {
                case 'a':
                case 'o':
                case 'i':
                case 'u':
                case 'e':
                case 'y':
                case 'A':
                case 'O':
                case 'I':
                case 'U':
                case 'E':
                case 'Y': System.out.println("par"); break;
                default: System.out.println("impar"); break;
            }
        }
    }
}
