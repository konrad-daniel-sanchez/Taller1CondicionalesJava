package test;

import ejercicios.Edad;
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
public class EdadTest {
    @Test
    public void test1() {
        String valorEsperado = "Usted tiene 23 años";
        String valorActual = Edad.evaluar(31, 12, 2000);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2() {
        String valorEsperado = "Usted tiene 19 años";
        String valorActual = Edad.evaluar(27, 8, 2005);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void test3() {
        String valorEsperado = "Usted tiene 21 años";
        String valorActual = Edad.evaluar(31, 8, 2003);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void test4() {
        String valorEsperado = "Usted tiene 60 años";
        String valorActual = Edad.evaluar(2, 9, 1964);
        assertEquals(valorEsperado, valorActual);
    }
    
}
