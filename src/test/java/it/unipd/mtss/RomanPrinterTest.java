////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    void testPrintUno() {
        String result = RomanPrinter.print(1);
        assertTrue(result.contains("|_   _|"));
    }
}