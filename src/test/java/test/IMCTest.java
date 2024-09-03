package test;

import ejercicios.IMC;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class IMCTest {
    @Test
    public void testBajo1() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(50, 1.8,20);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testBajo2() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(56, 1.6,44);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testMedio1() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(70, 1.7, 25);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testMedio2() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(55, 1.75, 45);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testAlto1() {
        String valorEsperado = "alto";
        String valorActual = IMC.evaluar(90, 1.72, 50);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testAlto2() {
        String valorEsperado = "alto";
        String valorActual = IMC.evaluar(100, 2.0, 45);
        assertEquals(valorEsperado, valorActual);
    }
    
}
