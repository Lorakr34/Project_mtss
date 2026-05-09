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
    void testConvertCinque() {
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

        @Test
    void testConvertVentuno() {
        int input = 21;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXI", result);
    }

    @Test
    void testConvertVentidue() {
        int input = 22;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXII", result);
    }

    @Test
    void testConvertVentitre() {
        int input = 23;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXIII", result);
    }

    @Test
    void testConvertVentiquattro() {
        int input = 24;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXIV", result);
    }

    @Test
    void testConvertVenticinque() {
        int input = 25;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXV", result);
    }

    @Test
    void testConvertVentisei() {
        int input = 26;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXVI", result);
    }

    @Test
    void testConvertVentisette() {
        int input = 27;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXVII", result);
    }

    @Test
    void testConvertVentotto() {
        int input = 28;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXVIII", result);
    }

    @Test
    void testConvertVentinove() {
        int input = 29;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXIX", result);
    }

    @Test
    void testConvertTrenta() {
        int input = 30;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXX", result);
    }

    @Test
    void testConvertTrentuno() {
        int input = 31;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXI", result);
    }

    @Test
    void testConvertTrentadue() {
        int input = 32;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXII", result);
    }

    @Test
    void testConvertTrentatre() {
        int input = 33;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXIII", result);
    }

    @Test
    void testConvertTrentaquattro() {
        int input = 34;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXIV", result);
    }

    @Test
    void testConvertTrentacinque() {
        int input = 35;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXV", result);
    }

    @Test
    void testConvertTrentasei() {
        int input = 36;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXVI", result);
    }

    @Test
    void testConvertTrentasette() {
        int input = 37;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXVII", result);
    }

    @Test
    void testConvertTrentotto() {
        int input = 38;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXVIII", result);
    }

    @Test
    void testConvertTrentanove() {
        int input = 39;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXIX", result);
    }

    @Test
    void testConvertQuaranta() {
        int input = 40;
        String result = IntegerToRoman.convert(input);
        assertEquals("XL", result);
    }

    @Test
    void testConvertQuarantuno() {
        int input = 41;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLI", result);
    }

    @Test
    void testConvertQuarantadue() {
        int input = 42;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLII", result);
    }

    @Test
    void testConvertQuarantatre() {
        int input = 43;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIII", result);
    }

    @Test
    void testConvertQuarantaquattro() {
        int input = 44;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIV", result);
    }

    @Test
    void testConvertQuarantacinque() {
        int input = 45;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLV", result);
    }

    @Test
    void testConvertQuarantasei() {
        int input = 46;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLVI", result);
    }

    @Test
    void testConvertQuarantasette() {
        int input = 47;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLVII", result);
    }

    @Test
    void testConvertQuarantotto() {
        int input = 48;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLVIII", result);
    }

    @Test
    void testConvertQuarantanove() {
        int input = 49;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIX", result);
    }

    @Test
    void testConvertCinquanta() {
        int input = 50;
        String result = IntegerToRoman.convert(input);
        assertEquals("L", result);
    }
}
