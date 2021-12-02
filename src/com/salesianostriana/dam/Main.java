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

        int[] arr = new int[] {123, 456, 789};

        for(int b: arr) {
            System.out.println(b);
        }

    }
}
