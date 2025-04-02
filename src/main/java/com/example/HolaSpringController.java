/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author farivadi
 */
@RestController
@Slf4j
public class HolaSpringController {
    
    //Configuracion por default.
    /**@GetMapping("/")
    public String comienzo() {
        return "Hola Mundo en Spring";
    }
    */ 
    //Metodo Prueba de integracion de prueba verificación de interacción entre un controlador REST y el servicio de la aplicación.
    @Autowired
    private HolaSpringApplication holaSpringApplication;

    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return holaSpringApplication.sumar(a, b);
    }
        
}
