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

        @Test
    void testConvertQuattro() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    void testConverCinque() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    void testConvertSei() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    void testConvertSette() {
        int input = 7;
        String result = IntegerToRoman.convert(input);
        assertEquals("VII", result);
    }

    @Test
    void testConvertOtto() {
        int input = 8;
        String result = IntegerToRoman.convert(input);
        assertEquals("VIII", result);
    }

    @Test
    void testConvertNove() {
        int input = 9;
        String result = IntegerToRoman.convert(input);
        assertEquals("IX", result);
    }

    @Test
    void testConvertDieci() {
        int input = 10;
        String result = IntegerToRoman.convert(input);
        assertEquals("X", result);
    }

        @Test
    void testConvertUndici() {
        int input = 11;
        String result = IntegerToRoman.convert(input);
        assertEquals("XI", result);
    }

    @Test
    void testConvertDodici() {
        int input = 12;
        String result = IntegerToRoman.convert(input);
        assertEquals("XII", result);
    }

    @Test
    void testConvertTredici() {
        int input = 13;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIII", result);
    }

    @Test
    void testConvertQuattordici() {
        int input = 14;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIV", result);
    }

    @Test
    void testConvertQuindici() {
        int input = 15;
        String result = IntegerToRoman.convert(input);
        assertEquals("XV", result);
    }

    @Test
    void testConvertSedici() {
        int input = 16;
        String result = IntegerToRoman.convert(input);
        assertEquals("XVI", result);
    }

    @Test
    void testConvertDiciassette() {
        int input = 17;
        String result = IntegerToRoman.convert(input);
        assertEquals("XVII", result);
    }

    @Test
    void testConvertDiciotto() {
        int input = 18;
        String result = IntegerToRoman.convert(input);
        assertEquals("XVIII", result);
    }

    @Test
    void testConvertDiciannove() {
        int input = 19;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIX", result);
    }

    @Test
    void testConvertVenti() {
        int input = 20;
        String result = IntegerToRoman.convert(input);
        assertEquals("XX", result);
    }
}
