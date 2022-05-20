package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        System.out.print("Ingrese el primer número:");
        String strNumero1 = buffer.readLine();
        Integer numero1 = Integer.parseInt(strNumero1);

        System.out.print("Ingrese el segundo número:");
        String strNumero2 = buffer.readLine();
        Integer numero2 = Integer.parseInt(strNumero2);
 
        System.out.print("Ingrese el tercer número:");
        String strNumero3 = buffer.readLine();
        Integer numero3 = Integer.parseInt(strNumero3);

        
    } 

    private static void calcularNumeroMayor() {

        Integer numeroMayor = numero1;

        if (numero2 > numeroMayor){
            numeroMayor = numero2;
        }
        
        if (numero3 > numeroMayor){
            numeroMayor = numero3;
        }

        System.out.println("El numero mayor es: " + numeroMayor);

        
        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor){
            numeroMenor = numero2;
        }
        
        if (numero3 < numeroMenor){
            numeroMenor = numero3;
        }
        
        System.out.println("El numero menor es: " + numeroMenor);
    }
}
