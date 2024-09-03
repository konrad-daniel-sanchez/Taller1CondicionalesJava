package test;

import ejercicios.Division;
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
public class DivisionTest {
    @Test
    public void testDivision1() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testDivision2() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 16\n"
                + "Residuo: 1";
        String valorActual = Division.evaluar(17, 4);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testDivision3() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 234\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(2340, 10);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testDivision4() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 2386\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(238600, 100);
        assertEquals(valorEsperado, valorActual);
    }
}
