/**
 * 
 */
package algoritmos;

/**
 * 
 */
public abstract class Algoritmos {

	/**
	 * Metodo que calcula el numero de Fibonacci para un numero dado
	 * 
	 *@param numero  El numero para el cual se desea calcula el numero Fibonacci
	 *@return El numero de Fibonacci corerespondiente al numero dado 
	 * 
	 */
	public static int fibonacci(int numero) {
		if(numero <= 1) {
			return numero;
		}
		else {
			return fibonacci(numero-1) + fibonacci(numero - 2 );
		}
	}
	
	
	
}
