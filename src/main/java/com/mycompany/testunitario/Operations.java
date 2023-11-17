/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testunitario;

import java.util.Random;

/**
 * Clase Operations que contiene métodos para realizar diversas operaciones matemáticas.
 */
public class Operations {
    
    /**
     * Método que devuelve el número siguiente al proporcionado.
     * @param numUsuario El número proporcionado.
     * @return El número siguiente al proporcionado.
     */
    public static int siguienteNumero(int numUsuario){
        return numUsuario + 1;
    }
    
    /**
     * Calcula el volumen de un cilindro dado su radio y altura.
     * @param radio El radio del cilindro.
     * @param altura La altura del cilindro.
     * @return El volumen del cilindro, o -1 si el radio o altura son no positivos.
     */
    public static double calcularVolumenCilindro(double radio, double altura) {
        if (radio > 0 && altura > 0) {
            return Math.PI * Math.pow(radio, 2) * altura;
        } else {
            return -1; 
        }
    }
    
    /**
     * Genera un número aleatorio entre 1 y 1000.
     * @return El número aleatorio generado.
     */
    public static int generarNumeroAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) + 1; 
        return numeroAleatorio;
    }
    
    /**
     * Verifica si el segundo número es divisible por el primero.
     * @param primerNumero El primer número.
     * @param segundoNumero El segundo número.
     * @return Un mensaje indicando si el segundo número es divisible o no por el primero.
     */
    public static String verificarDivisibilidad(int primerNumero, int segundoNumero) {
        if (segundoNumero % primerNumero == 0) {
            return "es divisible";
        } else {
            return "no es divisible";
        }
    }
    
    /**
     * Verifica si un número está entre 1 y 25 y es múltiplo de 5.
     * @param numero El número a verificar.
     * @return Un mensaje indicando si el número es correcto o incorrecto.
     */
    public static String verificarNumero(int numero) {
        if (numero % 5 == 0 && numero >= 1 && numero <= 25) {
            return "Correcto";
        } else {
            return "Incorrecto";
        }
    }
}

