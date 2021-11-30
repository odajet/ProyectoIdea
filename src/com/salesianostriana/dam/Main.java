package com.salesianostriana.dam;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Adiós Eclipse");

        Alumno a = new Alumno("Manuel", "Tejado Morilla", "lolet@gmail", LocalDate.of(1991
        , 6, 25));

        System.out.println(a);
    }
}
