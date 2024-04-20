package tests;

import static org.junit.jupiter.api.Assertions.*;
import algoritmos.Algoritmos;

import org.junit.jupiter.api.Test;

class AlgoritmosTest {

	@Test
	public void testFibonacci() {
        assertEquals(0, Algoritmos.fibonacci(0));
        assertEquals(1, Algoritmos.fibonacci(1));
        assertEquals(1, Algoritmos.fibonacci(2));
        assertEquals(2, Algoritmos.fibonacci(3));
        assertEquals(3, Algoritmos.fibonacci(4));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Algoritmos.factorial(0));
        assertEquals(1, Algoritmos.factorial(1));
        assertEquals(2, Algoritmos.factorial(2));
        assertEquals(6, Algoritmos.factorial(3));
        assertEquals(24, Algoritmos.factorial(4));

    }

    @Test
    public void testEsPrimo() {
        assertFalse(Algoritmos.esPrimo(0));
        assertFalse(Algoritmos.esPrimo(1));
        assertTrue(Algoritmos.esPrimo(2));
        assertTrue(Algoritmos.esPrimo(3));
        assertFalse(Algoritmos.esPrimo(4));

    }

}