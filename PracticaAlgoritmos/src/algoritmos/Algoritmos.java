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
	
	/**
     * Metodo que calcula el factorial de un número dado.
     *
     * @param numero  El número para el cual se desea calcular el factorial.
     * @return El factorial del número dado.
     * 
     */
    public static int factorial(int numero) {
        if (numero < 0)
            System.out.print("El factorial no está definido para números negativos");
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }
    
    /**
     * Metodo que verifica si un número dado es primo.
     *
     * @param numero  El número que se desea verificar.
     * @return true si el número es primo, false de lo contrario.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
	
	
}
