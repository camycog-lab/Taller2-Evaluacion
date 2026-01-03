package cl.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testSuma() {
        // Prueba atómica 1
        assertEquals(10, 5 + 5, "La suma de 5+5 debe ser 10");
    }

    @Test
    public void testResta() {
        // Prueba atómica 2
        assertEquals(5, 10 - 5, "La resta de 10-5 debe ser 5");
    }
}
