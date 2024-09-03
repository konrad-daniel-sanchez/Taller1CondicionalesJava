package test;

import ejercicios.SetDeTenis;
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
public class SetDeTenisTest {
    @Test
    public void testAunNoTermina1() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(4, 5);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testAunNoTermina2() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(5, 6);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testAunNoTermina3() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(6, 6);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testGanoA1() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(6, 4);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testGanoA2() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(6, 0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testGanoA3() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(7, 6);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testGanoB1() {
        String valorEsperado = "Ganó B";
        String valorActual = SetDeTenis.evaluar(5, 7);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testGanoB2() {
        String valorEsperado = "Ganó B";
        String valorActual = SetDeTenis.evaluar(0, 6);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testGanoB3() {
        String valorEsperado = "Ganó B";
        String valorActual = SetDeTenis.evaluar(6, 7);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testInvalido1() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(3, 7);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testInvalido2() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(7, 0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testInvalido3() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(0, 7);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testInvalido4() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(8, 6);
        assertEquals(valorEsperado, valorActual);
    }

}
