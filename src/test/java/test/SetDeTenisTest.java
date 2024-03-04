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
    public void testAunNoTermina() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(4, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
}
