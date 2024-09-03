package test;

import ejercicios.LetraONumero;
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
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('3');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testLetraMayuscula() {
        String valorEsperado = "Es letra mayúscula";
        String valorActual = LetraONumero.evaluar('Z');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testLetraMinuscula() {
        String valorEsperado = "Es letra minúscula";
        String valorActual = LetraONumero.evaluar('l');
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testNoEsLetraNiNumero() {
        String valorEsperado = "No es letra ni número";
        String valorActual = LetraONumero.evaluar('*');
        assertEquals(valorEsperado, valorActual);
    }
    
}
