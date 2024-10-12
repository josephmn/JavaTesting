package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar() {
        // Given - Teniendo
        int numberA = 3;
        int numberB = 3;

        // When - Cuando
        int result = this.example.sumar(numberA, numberB);

        // Then - Entonces
        assertEquals(6, result);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);

    }

    @Test
    public void testCheckPositivo() {
        // Given
        int number = 4;

        // When
        boolean result = this.example.checkPositivo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        // Given
        int number = -4;

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.checkPositivo(number);
        });
    }

    @Test
    public void testContarLetrasA() {
        // Given
        String cadena = "un programado esta aqui y vamos con todo";
        // When
        int result = this.example.contarLetrasA(cadena);
        // Then
        assertEquals(5, result);
        assertNotNull(result);
    }

    @Test
    public void TestContieneElemento() {
        // Given
        List<String> countries = List.of("Colombia", "México", "Perú");
        String country = "Colombia";
        // When
        boolean result = this.example.contieneElemento(countries, country);
        // Then
        assertTrue(result);
    }

    @Test
    public void TestRevertirCadena() {
        // Given
        String cadena = "carro";
        // When
        String result = this.example.revertirCadena(cadena);
        // Then
        assertEquals("orrac", result);
    }

    @Test
    public void TestFactorial() {
        // Given
        int number = 6;
        // When
        long result = this.example.factorial(number);
        // Then
        assertEquals(720, result);
    }

    @Test
    public void TestFactorialError() {
        // Given
        int number = -6;
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

    @Test
    public void TestEsPrimo() {
        // Given
        int number = 3;
        // When
        boolean result = this.example.esPrimo(number);
        // Then
        assertTrue(result);
    }

    @Test
    public void TestEsPrimoMayorACuatro() {
        // Given
        int number = 7;
        // When
        boolean result = this.example.esPrimo(number);
        // Then
        assertTrue(result);
    }

    @Test
    public void TestEsPrimoMenorQueUno() {
        // Given
        int number = 1;
        // When
        boolean result = this.example.esPrimo(number);
        // Then
        assertFalse(result);
    }

    @Test
    public void TestNoEsPrimo() {
        // Given
        int number = 9;
        // When
        boolean result = this.example.esPrimo(number);
        // Then
        assertFalse(result);
    }

    @Test
    public void TestMensajeConRetraso() throws InterruptedException {
        // Given

        // When
        String result = this.example.mensajeConRetraso();
        // Then
        assertEquals("Listo después de retraso", result);

    }

    @Test
    public void TestConvertirAString () {
        // Given
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        // When
        List<String> result = this.example.convertirAString(numbers);
        // Then
        assertEquals(List.of("1","2","3","4","5","6","7","8","9","10"), result);
    }

    @Test
    public void TestCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1,2,3);
        // When
        double result = this.example.calcularMedia(numbers);
        // Then
        assertEquals(2,result);
    }

    @Test
    public void TestCalcularMediaNula() {
        // Given
        List<Integer> numbers = null;
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void TestCalcularMediaVacio() {
        // Given
        List<Integer> numbers = Collections.emptyList();
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void TestConvertirListaAString() {
        // Given
        List<String> list = List.of("1","2","3","4","5");
        // When
        String result = this.example.convertirListaAString(list);
        // Then
        assertEquals("1,2,3,4,5", result);
    }
}
