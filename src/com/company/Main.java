package com.company;
import com.company.Practica;

public class Main {

    public static void main(String[] args) {
        //sarcina 1
        Practica suma = new Practica();
        System.out.println("suma="+suma.sum());

        //sarcina 2
        Practica rev = new Practica();
        rev.reverse();

        //sarcina 3
        Practica Max = new Practica();
        System.out.println("max="+Max.maxim());

        //sarcina 4
        Practica letter = new Practica();
        letter.FindLetter();
    }
}
