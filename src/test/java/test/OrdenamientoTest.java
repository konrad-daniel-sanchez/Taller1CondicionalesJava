package test;

import ejercicios.Ordenamiento;
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
public class OrdenamientoTest {
    @Test
    public void test1() {
        String valorEsperado = "1 2 3 4";
        String valorActual = Ordenamiento.evaluar(1, 2, 3, 4);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2() {
        String valorEsperado = "-11 3 30 1000";
        String valorActual = Ordenamiento.evaluar(3, -11, 30, 1000);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void test3() {
        String valorEsperado = "37 452 724 1200";
        String valorActual = Ordenamiento.evaluar(724, 37, 452, 1200);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void test4() {
        String valorEsperado = "-131 27 111 324";
        String valorActual = Ordenamiento.evaluar(324, 27, -131, 111);
        assertEquals(valorEsperado, valorActual);
    }
    
}
