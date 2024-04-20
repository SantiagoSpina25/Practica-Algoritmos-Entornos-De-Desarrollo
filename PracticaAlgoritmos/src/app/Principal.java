package app;

import java.util.Iterator;
import algoritmos.Algoritmos;

public class Principal {
	
	public static void main(String[] args) {
		
		//1 Array de enteros con 5 numeros aleatorios del 1 al 10
		
		int [] numeros = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*10) + 1;
		}
		
		//2 Calcular Fibonacci de los números y almacenar resultados
        int[] resultadoFibonacci = new int[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }
        
        //3 Calcular factorial de los números y almacenar resultados
        int[] resultadoFactorial = new int[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }
        
        //4 Verificar si los números son primos y almacenar resultados
        boolean[] resultadoPrimos = new boolean[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }
        
        
        
        
        
        
        
        
	}
}