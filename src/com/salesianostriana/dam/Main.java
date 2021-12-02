package com.salesianostriana.dam;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Adiós Eclipse");

        Alumno a = new Alumno("Manuel", "Tejado Morilla", "lolet@gmail", LocalDate.of(1991
        , 6, 25));

        System.out.println(a);

        System.out.println("Hello World");

        System.out.println("Hola mundo");

        int[] array = new int[3];
        array[0] = 123;
        array[1] = 456;
        array[2] = 789;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);



        int[] arr = new int[] {123, 456, 789};

        for(int b: arr) {
            System.out.println(b);
        }

    }
}
