/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testunitario;

import java.util.Random;

/**
 *
 * @author m_gut
 */
public class Operations {
    
    public static int siguienteNumero(int numUsuario){
        return numUsuario+1;
    }
    
    public static double calcularVolumenCilindro(double radio, double altura) {
        if (radio > 0 && altura > 0) {
            return Math.PI * Math.pow(radio, 2) * altura;
        } else {
            return -1; 
        }
    }
    
    public static int generarNumeroAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) + 1; 
        return numeroAleatorio;
    }
    
    public static String verificarDivisibilidad(int primerNumero, int segundoNumero) {
        if (segundoNumero % primerNumero == 0) {
            return "es divisible";
        } else {
            return "no es divisible";
        }
    }
    
    public static String verificarNumero(int numero) {
        if (numero % 5 == 0 && numero >= 1 && numero <= 25) {
            return "Correcto";
        } else {
            return "Incorrecto";
        }
    }
}
