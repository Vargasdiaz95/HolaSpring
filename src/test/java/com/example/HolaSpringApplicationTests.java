package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.context.i18n.LocaleContextHolder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class HolaSpringApplicationTests {
    
    /**
    @Autowired
    private MessageSource messageSource;

    @Test
    void testGreetingInEnglish() {
        LocaleContextHolder.setLocale(Locale.ENGLISH);
        String message
                = messageSource.getMessage("greeting", null, Locale.ENGLISH);
        assertEquals("Hello, World!", message);
    }

    @Test
    void testGreetingInSpanish() {
        LocaleContextHolder.setLocale(new Locale("es"));
        String message = messageSource.getMessage("greeting",
                null, new Locale("es"));
        assertEquals("¡Hola, Mundo!", message);
    }

    @Test
    void testGreetingInFrench() {
        LocaleContextHolder.setLocale(Locale.FRENCH);
        String message
                = messageSource.getMessage("greeting", null, Locale.FRENCH);
        assertEquals("Bonjour, le monde!", message);
    }
    /**

    /**
     * @Test void testEsPar() { HolaSpringApplication app = new
     * HolaSpringApplication(); // Verificar que el número 4 es par
     * assertTrue(app.esPar(4), "El número 4 debería ser par");
     *
     * // Verificar que el número 5 no es par assertFalse(app.esPar(5), "El
     * número 5 no debería ser par"); }
     */
    /**
     * @Test void contextLoads() { System.out.println("El contexto de la
     * aplicación se ha cargado correctamente."); }
     */
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSumarEndpoint() throws Exception {
        mockMvc.perform(get("/sumar").param("a", "2").param("b", "3"))
                .andExpect(status().isOk()).andExpect(content().string("5"));
    }

    /**
     * Creacion de prueba unitaria el método sumar dos numeros. void testSumar()
     * { HolaSpringApplication app=new HolaSpringApplication(); int resultado
     * =app.sumar(2,3); assertEquals(5,resultado, "La suma de 2 y 3 deberia ser
     * 5" ); System.out.println("El contexto de la aplicación se ha cargado
     * correctamente."); }
     */
}
