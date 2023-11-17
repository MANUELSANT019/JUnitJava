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
 *
 * @author m_gut
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
      public void testSiguienteNumero() {
        int resultado = Operations.siguienteNumero(5);
        assertEquals(6, resultado);
    }
      
    @Test
    public void testCalcularVolumenCilindro() {
        double resultado1 = Operations.calcularVolumenCilindro(2.0, 4.0);
        assertEquals(50.26548, resultado1, 0.00001); 

        double resultado2 = Operations.calcularVolumenCilindro(0.0, 4.0);
        assertEquals(-1, resultado2);
    }
    
    @Test
    public void testVerificarDivisibilidad() {
        String resultado1 = Operations.verificarDivisibilidad(4, 16);
        assertEquals("es divisible", resultado1);

        String resultado2 = Operations.verificarDivisibilidad(5, 12);
        assertEquals("no es divisible", resultado2);
    }

    @Test
    public void testVerificarNumero() {
        String resultado1 = Operations.verificarNumero(10);
        assertEquals("Correcto", resultado1);

        String resultado2 = Operations.verificarNumero(30);
        assertEquals("Incorrecto", resultado2);
    }  
}
