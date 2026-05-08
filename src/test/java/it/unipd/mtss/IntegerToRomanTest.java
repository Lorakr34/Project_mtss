////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    void testConvertUno() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    void testConvertDue() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    void testConvertTre() {
        assertEquals("III", IntegerToRoman.convert(3));
    }
}