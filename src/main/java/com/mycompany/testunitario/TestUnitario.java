/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testunitario;

import java.util.Scanner;
import com.mycompany.testunitario.Operations;
/**
 *
 * @author m_gut
 */
public class TestUnitario {

    public static void main(String[] args) {
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1.Agregar el siguiente numero");
        System.out.println("9.Calcular el volumen de un cilindro");
        System.out.println("10.");
        System.out.println("17.Verificador de Números Aleatorios Múltiplos de 5 entre los 25 Primeros");
        Scanner leer = new Scanner(System.in);
        
        String resultadoUsuario = leer.next();
        
        switch (resultadoUsuario) {
            case "1":
                System.out.println("Digite un numero entero");
                String numUsuario = leer.next();
                int intNumeUsuario = Integer.parseInt(numUsuario);
                int siguienteNum = Operations.siguienteNumero(intNumeUsuario);
                System.out.println(siguienteNum);
                break;
            case "9":
                System.out.println("Digite el radio del cilindro:");
                String radioStr = leer.next();
                double radio = Double.parseDouble(radioStr);
    
                System.out.println("Digite la altura del cilindro:");
                String alturaStr = leer.next();
                double altura = Double.parseDouble(alturaStr);
    
                double volumen = Operations.calcularVolumenCilindro(radio, altura);
    
                if (volumen >= 0) {
                System.out.println("El volumen del cilindro es: " + volumen);
                } else {
                System.out.println("El radio y la altura deben ser valores positivos.");
                    }
                break;
                
                case "10":
                System.out.println("Digite el primer número:");
                String primerNumeroStr = leer.next();
                int primerNumero = Integer.parseInt(primerNumeroStr);
    
                System.out.println("Digite el segundo número:");
                String segundoNumeroStr = leer.next();
                int segundoNumero = Integer.parseInt(segundoNumeroStr);
    
                String resultadoDiv = Operations.verificarDivisibilidad(primerNumero, segundoNumero);
    
                System.out.println("El segundo número " + resultadoDiv + " al primer número.");
                break;
                
            case "17":
                int numeroAleatorio = Operations.generarNumeroAleatorio();
                System.out.println("Número aleatorio generado: " + numeroAleatorio);

                String resultado = Operations.verificarNumero(numeroAleatorio);

                System.out.println("Resultado: " + resultado);
                break;
            default:
                throw new AssertionError();
        }
    }
}
