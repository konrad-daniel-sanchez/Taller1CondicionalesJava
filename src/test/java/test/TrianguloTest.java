package test;

import ejercicios.Triangulo;
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
public class TrianguloTest {
    @Test
    public void testNoEsUnTrianguloValido() {
        String valorEsperado = "No es un triángulo válido";
        String valorActual = Triangulo.evaluar(3.9, 6.0, 1.2);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    
}
