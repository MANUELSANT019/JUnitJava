/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.testunitario.Operations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Operations.
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        // Configuración inicial de la clase de pruebas
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Tareas de limpieza después de ejecutar todas las pruebas
    }
    
    @BeforeEach
    public void setUp() {
        // Configuración inicial antes de cada prueba
    }
    
    @AfterEach
    public void tearDown() {
        // Tareas de limpieza después de cada prueba
    }

    /**
     * Prueba para verificar el método siguienteNumero de Operations.
     */
    @Test
    public void testSiguienteNumero() {
        int resultado = Operations.siguienteNumero(5);
        assertEquals(6, resultado); // Comprobación de que el método devuelve el número siguiente
    }
      
    /**
     * Prueba para verificar el método calcularVolumenCilindro de Operations.
     */
    @Test
    public void testCalcularVolumenCilindro() {
        // Verifica si el cálculo del volumen es correcto con valores válidos
        double resultado1 = Operations.calcularVolumenCilindro(2.0, 4.0);
        assertEquals(50.26548, resultado1, 0.00001); // Comprobación con un margen de error aceptable

        // Verifica la respuesta cuando se proporcionan valores no válidos
        double resultado2 = Operations.calcularVolumenCilindro(0.0, 4.0);
        assertEquals(-1, resultado2); // Comprobación cuando los valores no son positivos
    }
    
    /**
     * Prueba para verificar el método verificarDivisibilidad de Operations.
     */
    @Test
    public void testVerificarDivisibilidad() {
        // Verifica si el segundo número es divisible por el primero
        String resultado1 = Operations.verificarDivisibilidad(4, 16);
        assertEquals("es divisible", resultado1); // Comprobación de divisibilidad

        // Verifica la respuesta cuando el segundo número no es divisible por el primero
        String resultado2 = Operations.verificarDivisibilidad(5, 12);
        assertEquals("no es divisible", resultado2); // Comprobación de no divisibilidad
    }

    /**
     * Prueba para verificar el método verificarNumero de Operations.
     */
    @Test
    public void testVerificarNumero() {
        // Verifica si el número está en el rango y es múltiplo de 5
        String resultado1 = Operations.verificarNumero(10);
        assertEquals("Correcto", resultado1); // Comprobación de número correcto

        // Verifica la respuesta cuando el número está fuera del rango o no es múltiplo de 5
        String resultado2 = Operations.verificarNumero(30);
        assertEquals("Incorrecto", resultado2); // Comprobación de número incorrecto
    }  
}
