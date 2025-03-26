package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaSpringApplication {

    /**
     * Metodo Prueba de unitaria de suma de numeros y prueba de integracion
     * verificación de interacción entre un controlador REST y el servicio de la
     * aplicación. public int sumar(int a,int b) { return a + b; }
     */
    /**
     * Metodo Prueba de unitaria de calculo si es par. public boolean
     * esPar(intnumero) { return numero % 2 == 0; }
     */
    /**
     * Metodo Prueba de integracion de internacionalizacion.
     */
    public static void
            main(String[] args) {
        SpringApplication.run(HolaSpringApplication.class, args);
    }

}
