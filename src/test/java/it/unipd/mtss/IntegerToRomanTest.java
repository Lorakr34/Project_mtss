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

        @Test
    void testConvertCinquantuno() {
        int input = 51;
        String result = IntegerToRoman.convert(input);
        assertEquals("LI", result);
    }

    @Test
    void testConvertCinquantadue() {
        int input = 52;
        String result = IntegerToRoman.convert(input);
        assertEquals("LII", result);
    }

    @Test
    void testConvertCinquantatre() {
        int input = 53;
        String result = IntegerToRoman.convert(input);
        assertEquals("LIII", result);
    }

    @Test
    void testConvertCinquantaquattro() {
        int input = 54;
        String result = IntegerToRoman.convert(input);
        assertEquals("LIV", result);
    }

    @Test
    void testConvertCinquantacinque() {
        int input = 55;
        String result = IntegerToRoman.convert(input);
        assertEquals("LV", result);
    }

    @Test
    void testConvertCinquantasei() {
        int input = 56;
        String result = IntegerToRoman.convert(input);
        assertEquals("LVI", result);
    }

    @Test
    void testConvertCinquantasette() {
        int input = 57;
        String result = IntegerToRoman.convert(input);
        assertEquals("LVII", result);
    }

    @Test
    void testConvertCinquantotto() {
        int input = 58;
        String result = IntegerToRoman.convert(input);
        assertEquals("LVIII", result);
    }

    @Test
    void testConvertCinquantanove() {
        int input = 59;
        String result = IntegerToRoman.convert(input);
        assertEquals("LIX", result);
    }

    @Test
    void testConvertSessanta() {
        int input = 60;
        String result = IntegerToRoman.convert(input);
        assertEquals("LX", result);
    }

    @Test
    void testConvertSessantuno() {
        int input = 61;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXI", result);
    }

    @Test
    void testConvertSessantadue() {
        int input = 62;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXII", result);
    }

    @Test
    void testConvertSessantatre() {
        int input = 63;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXIII", result);
    }

    @Test
    void testConvertSessantaquattro() {
        int input = 64;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXIV", result);
    }

    @Test
    void testConvertSessantacinque() {
        int input = 65;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXV", result);
    }

    @Test
    void testConvertSessantasei() {
        int input = 66;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXVI", result);
    }

    @Test
    void testConvertSessantasette() {
        int input = 67;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXVII", result);
    }

    @Test
    void testConvertSessantotto() {
        int input = 68;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXVIII", result);
    }

    @Test
    void testConvertSessantanove() {
        int input = 69;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXIX", result);
    }

    @Test
    void testConvertSettanta() {
        int input = 70;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXX", result);
    }

    @Test
    void testConvertSettantuno() {
        int input = 71;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXI", result);
    }

    @Test
    void testConvertSettantadue() {
        int input = 72;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXII", result);
    }

    @Test
    void testConvertSettantatre() {
        int input = 73;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXIII", result);
    }

    @Test
    void testConvertSettantaquattro() {
        int input = 74;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXIV", result);
    }

    @Test
    void testConvertSettantacinque() {
        int input = 75;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXV", result);
    }

    @Test
    void testConvertSettantasei() {
        int input = 76;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXVI", result);
    }

    @Test
    void testConvertSettantasette() {
        int input = 77;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXVII", result);
    }

    @Test
    void testConvertSettantotto() {
        int input = 78;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXVIII", result);
    }

    @Test
    void testConvertSettantanove() {
        int input = 79;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXIX", result);
    }

    @Test
    void testConvertOttanta() {
        int input = 80;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXX", result);
    }

    @Test
    void testConvertOttantuno() {
        int input = 81;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXI", result);
    }

    @Test
    void testConvertOttantadue() {
        int input = 82;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXII", result);
    }

    @Test
    void testConvertOttantatre() {
        int input = 83;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXIII", result);
    }

    @Test
    void testConvertOttantaquattro() {
        int input = 84;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXIV", result);
    }

    @Test
    void testConvertOttantacinque() {
        int input = 85;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXV", result);
    }

    @Test
    void testConvertOttantasei() {
        int input = 86;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXVI", result);
    }

    @Test
    void testConvertOttantasette() {
        int input = 87;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXVII", result);
    }

    @Test
    void testConvertOttantotto() {
        int input = 88;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXVIII", result);
    }

    @Test
    void testConvertOttantanove() {
        int input = 89;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXXIX", result);
    }

    @Test
    void testConvertNovanta() {
        int input = 90;
        String result = IntegerToRoman.convert(input);
        assertEquals("XC", result);
    }

    @Test
    void testConvertNovantuno() {
        int input = 91;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCI", result);
    }

    @Test
    void testConvertNovantadue() {
        int input = 92;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCII", result);
    }

    @Test
    void testConvertNovantatre() {
        int input = 93;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCIII", result);
    }

    @Test
    void testConvertNovantaquattro() {
        int input = 94;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCIV", result);
    }

    @Test
    void testConvertNovantacinque() {
        int input = 95;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCV", result);
    }

    @Test
    void testConvertNovantasei() {
        int input = 96;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCVI", result);
    }

    @Test
    void testConvertNovantasette() {
        int input = 97;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCVII", result);
    }

    @Test
    void testConvertNovantotto() {
        int input = 98;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCVIII", result);
    }

    @Test
    void testConvertNovantanove() {
        int input = 99;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCIX", result);
    }

    @Test
    void testConvertCento() {
        int input = 100;
        String result = IntegerToRoman.convert(input);
        assertEquals("C", result);
    }
}
