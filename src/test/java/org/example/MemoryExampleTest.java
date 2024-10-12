package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MemoryExampleTest {
    @Test
    public void testSumar() {
        Example example = new Example();

        int result = example.sumar(4,4);

        assertEquals(8,result); // Evaluar un valor esperado, con un valor actual
//        assertTrue(result > 1); // Evaluar un valor booleano, siempre espera un true
//        assertFalse(result > 10); // Evaluar un valor booleano, siempre espera un false
//        assertNotNull(result); // Validar que el objeto no sea null
//        assertInstanceOf(Integer.class, result); // Evaluar el tipo de objeto que tengo
//        assertThrows(); // Validar excepciones, captura el error que espero
    }
}
