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

    @Test
    void testConvertCentoUno() {
        int input = 101;
        String result = IntegerToRoman.convert(input);
        assertEquals("CI", result);
    }
    
    @Test
    void testConvertCentodue() {
        int input = 102;
        String result = IntegerToRoman.convert(input);
        assertEquals("CII", result);
    }
    
    @Test
    void testConvertCentotre() {
        int input = 103;
        String result = IntegerToRoman.convert(input);
        assertEquals("CIII", result);
    }
    
    @Test
    void testConvertCentiquattro() {
        int input = 104;
        String result = IntegerToRoman.convert(input);
        assertEquals("CIV", result);
    }
    
    @Test
    void testConvertCentocinque() {
        int input = 105;
        String result = IntegerToRoman.convert(input);
        assertEquals("CV", result);
    }
    
    @Test
    void testConvertCentosei() {
        int input = 106;
        String result = IntegerToRoman.convert(input);
        assertEquals("CVI", result);
    }
    
    @Test
    void testConvertCentosette() {
        int input = 107;
        String result = IntegerToRoman.convert(input);
        assertEquals("CVII", result);
    }
    
    @Test
    void testConvertCentootto() {
        int input = 108;
        String result = IntegerToRoman.convert(input);
        assertEquals("CVIII", result);
    }
    
    @Test
    void testConvertCentonove() {
        int input = 109;
        String result = IntegerToRoman.convert(input);
        assertEquals("CIX", result);
    }
    
    @Test
    void testConvertCentodieci() {
        int input = 110;
        String result = IntegerToRoman.convert(input);
        assertEquals("CX", result);
    }
    
    @Test
    void testConvertCentoundici() {
        int input = 111;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXI", result);
    }
    
    @Test
    void testConvertCentododici() {
        int input = 112;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXII", result);
    }
    
    @Test
    void testConvertCentotredici() {
        int input = 113;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXIII", result);
    }
    
    @Test
    void testConvertCentoquattordici() {
        int input = 114;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXIV", result);
    }
    
    @Test
    void testConvertCentocquindici() {
        int input = 115;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXV", result);
    }
    
    @Test
    void testConvertCentosedici() {
        int input = 116;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXVI", result);
    }
    
    @Test
    void testConvertCentodiciassette() {
        int input = 117;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXVII", result);
    }
    
    @Test
    void testConvertCentodiciotto() {
        int input = 118;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXVIII", result);
    }
    
    @Test
    void testConvertCentodiciannove() {
        int input = 119;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXIX", result);
    }
    
    @Test
    void testConvertCentoventi() {
        int input = 120;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXX", result);
    }
    
    @Test
    void testConvertCentoventuno() {
        int input = 121;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXI", result);
    }
    
    @Test
    void testConvertCentoventidue() {
        int input = 122;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXII", result);
    }
    
    @Test
    void testConvertCentoventitre() {
        int input = 123;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXIII", result);
    }
    
    @Test
    void testConvertCentoventiquattro() {
        int input = 124;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXIV", result);
    }
    
    @Test
    void testConvertCentoventicinque() {
        int input = 125;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXV", result);
    }
    
    @Test
    void testConvertCentoventisei() {
        int input = 126;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXVI", result);
    }
    
    @Test
    void testConvertCentoventisette() {
        int input = 127;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXVII", result);
    }
    
    @Test
    void testConvertCentoventotto() {
        int input = 128;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXVIII", result);
    }
    
    @Test
    void testConvertCentoventinove() {
        int input = 129;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXIX", result);
    }
    
    @Test
    void testConvertCentotrenta() {
        int input = 130;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXX", result);
    }
    
    @Test
    void testConvertCentotrentuno() {
        int input = 131;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXI", result);
    }
    
    @Test
    void testConvertCentotrentadue() {
        int input = 132;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXII", result);
    }
    
    @Test
    void testConvertCentotrentatre() {
        int input = 133;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXIII", result);
    }
    
    @Test
    void testConvertCentotrentaquattro() {
        int input = 134;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXIV", result);
    }
    
    @Test
    void testConvertCentotrentacinque() {
        int input = 135;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXV", result);
    }
    
    @Test
    void testConvertCentotrentasei() {
        int input = 136;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXVI", result);
    }
    
    @Test
    void testConvertCentotrentasette() {
        int input = 137;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXVII", result);
    }
    
    @Test
    void testConvertCentotrentotto() {
        int input = 138;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXVIII", result);
    }
    
    @Test
    void testConvertCentotrentanove() {
        int input = 139;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXXXIX", result);
    }
    
    @Test
    void testConvertCentoquaranta() {
        int input = 140;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXL", result);
    }
    
    @Test
    void testConvertCentoquarantuno() {
        int input = 141;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLI", result);
    }
    
    @Test
    void testConvertCentoquarantadue() {
        int input = 142;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLII", result);
    }
    
    @Test
    void testConvertCentoquarantatre() {
        int input = 143;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLIII", result);
    }
    
    @Test
    void testConvertCentoquarantaquattro() {
        int input = 144;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLIV", result);
    }
    
    @Test
    void testConvertCentoquarantacinque() {
        int input = 145;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLV", result);
    }
    
    @Test
    void testConvertCentoquarantasei() {
        int input = 146;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLVI", result);
    }
    
    @Test
    void testConvertCentoquarantasette() {
        int input = 147;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLVII", result);
    }
    
    @Test
    void testConvertCentoquarantotto() {
        int input = 148;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLVIII", result);
    }
    
    @Test
    void testConvertCentoquarantanove() {
        int input = 149;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXLIX", result);
    }
    
    @Test
    void testConvertCentoCinquanta() {
        int input = 150;
        String result = IntegerToRoman.convert(input);
        assertEquals("CL", result);
    }

    @Test
    void testConvertCentocinquantuno() {
        int input = 151;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLI", result);
    }
    
    @Test
    void testConvertCentocinquantadue() {
        int input = 152;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLII", result);
    }
    
    @Test
    void testConvertCentocinquantatre() {
        int input = 153;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLIII", result);
    }
    
    @Test
    void testConvertCentocinquantaquattro() {
        int input = 154;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLIV", result);
    }
    
    @Test
    void testConvertCentocinquantacinque() {
        int input = 155;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLV", result);
    }
    
    @Test
    void testConvertCentocinquantasei() {
        int input = 156;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLVI", result);
    }
    
    @Test
    void testConvertCentocinquantasette() {
        int input = 157;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLVII", result);
    }
    
    @Test
    void testConvertCentocinquantotto() {
        int input = 158;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLVIII", result);
    }
    
    @Test
    void testConvertCentocinquantanove() {
        int input = 159;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLIX", result);
    }
    
    @Test
    void testConvertCentosessanta() {
        int input = 160;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLX", result);
    }
    
    @Test
    void testConvertCentosessantuno() {
        int input = 161;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXI", result);
    }
    
    @Test
    void testConvertCentosessantadue() {
        int input = 162;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXII", result);
    }
    
    @Test
    void testConvertCentosessantatre() {
        int input = 163;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXIII", result);
    }
    
    @Test
    void testConvertCentosessantaquattro() {
        int input = 164;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXIV", result);
    }
    
    @Test
    void testConvertCentosessantacinque() {
        int input = 165;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXV", result);
    }
    
    @Test
    void testConvertCentosessantasei() {
        int input = 166;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXVI", result);
    }
    
    @Test
    void testConvertCentosessantasette() {
        int input = 167;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXVII", result);
    }
    
    @Test
    void testConvertCentosessantotto() {
        int input = 168;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXVIII", result);
    }
    
    @Test
    void testConvertCentosessantanove() {
        int input = 169;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXIX", result);
    }
    
    @Test
    void testConvertCentosettanta() {
        int input = 170;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXX", result);
    }
    
    @Test
    void testConvertCentosettantuno() {
        int input = 171;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXI", result);
    }
    
    @Test
    void testConvertCentosettantadue() {
        int input = 172;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXII", result);
    }
    
    @Test
    void testConvertCentosettantatre() {
        int input = 173;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXIII", result);
    }
    
    @Test
    void testConvertCentosettantaquattro() {
        int input = 174;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXIV", result);
    }
    
    @Test
    void testConvertCentosettantacinque() {
        int input = 175;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXV", result);
    }
    
    @Test
    void testConvertCentosettantasei() {
        int input = 176;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXVI", result);
    }
    
    @Test
    void testConvertCentosettantasette() {
        int input = 177;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXVII", result);
    }
    
    @Test
    void testConvertCentosettantotto() {
        int input = 178;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXVIII", result);
    }
    
    @Test
    void testConvertCentosettantanove() {
        int input = 179;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXIX", result);
    }
    
    @Test
    void testConvertCentoottanta() {
        int input = 180;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXX", result);
    }
    
    @Test
    void testConvertCentoottantuno() {
        int input = 181;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXI", result);
    }
    
    @Test
    void testConvertCentoottantadue() {
        int input = 182;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXII", result);
    }
    
    @Test
    void testConvertCentoottantatre() {
        int input = 183;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXIII", result);
    }
    
    @Test
    void testConvertCentoottantaquattro() {
        int input = 184;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXIV", result);
    }
    
    @Test
    void testConvertCentoottantacinque() {
        int input = 185;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXV", result);
    }
    
    @Test
    void testConvertCentoottantasei() {
        int input = 186;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXVI", result);
    }
    
    @Test
    void testConvertCentoottantasette() {
        int input = 187;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXVII", result);
    }
    
    @Test
    void testConvertCentoottantotto() {
        int input = 188;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXVIII", result);
    }
    
    @Test
    void testConvertCentoottantanove() {
        int input = 189;
        String result = IntegerToRoman.convert(input);
        assertEquals("CLXXXIX", result);
    }
    
    @Test
    void testConvertCentoNovanta() {
        int input = 190;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXC", result);
    }
    
    @Test
    void testConvertCentoNovantuno() {
        int input = 191;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCI", result);
    }
    
    @Test
    void testConvertCentoNovantadue() {
        int input = 192;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCII", result);
    }
    
    @Test
    void testConvertCentoNovantatre() {
        int input = 193;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCIII", result);
    }
    
    @Test
    void testConvertCentoNovantaquattro() {
        int input = 194;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCIV", result);
    }
    
    @Test
    void testConvertCentoNovantacinque() {
        int input = 195;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCV", result);
    }
    
    @Test
    void testConvertCentoNovantasei() {
        int input = 196;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCVI", result);
    }
    
    @Test
    void testConvertCentoNovantasette() {
        int input = 197;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCVII", result);
    }
    
    @Test
    void testConvertCentoNovantotto() {
        int input = 198;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCVIII", result);
    }
    
    @Test
    void testConvertCentoNovantanove() {
        int input = 199;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCIX", result);
    }
    
    @Test
    void testConvertDuecento() {
        int input = 200;
        String result = IntegerToRoman.convert(input);
        assertEquals("CC", result);
    }

    @Test
    void testConvertDuecentouno() {
        int input = 201;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCI", result);
    }
    
    @Test
    void testConvertDuecentodue() {
        int input = 202;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCII", result);
    }
    
    @Test
    void testConvertDuecentotre() {
        int input = 203;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCIII", result);
    }
    
    @Test
    void testConvertDuecentoquattro() {
        int input = 204;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCIV", result);
    }
    
    @Test
    void testConvertDuecentocinque() {
        int input = 205;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCV", result);
    }
    
    @Test
    void testConvertDuecentosei() {
        int input = 206;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCVI", result);
    }
    
    @Test
    void testConvertDuecentosette() {
        int input = 207;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCVII", result);
    }
    
    @Test
    void testConvertDuecentootto() {
        int input = 208;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCVIII", result);
    }
    
    @Test
    void testConvertDuecentonove() {
        int input = 209;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCIX", result);
    }
    
    @Test
    void testConvertDuecentodieci() {
        int input = 210;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCX", result);
    }
    
    @Test
    void testConvertDuecentoundici() {
        int input = 211;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXI", result);
    }
    
    @Test
    void testConvertDuecentododici() {
        int input = 212;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXII", result);
    }
    
    @Test
    void testConvertDuecentotredici() {
        int input = 213;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXIII", result);
    }
    
    @Test
    void testConvertDuecentoquattordici() {
        int input = 214;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXIV", result);
    }
    
    @Test
    void testConvertDuecentoquindici() {
        int input = 215;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXV", result);
    }
    
    @Test
    void testConvertDuecentosedici() {
        int input = 216;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXVI", result);
    }
    
    @Test
    void testConvertDuecentodiciassette() {
        int input = 217;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXVII", result);
    }
    
    @Test
    void testConvertDuecentodiciotto() {
        int input = 218;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXVIII", result);
    }
    
    @Test
    void testConvertDuecentodiciannove() {
        int input = 219;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXIX", result);
    }
    
    @Test
    void testConvertDuecentoventi() {
        int input = 220;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXX", result);
    }
    
    @Test
    void testConvertDuecentoventuno() {
        int input = 221;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXI", result);
    }
    
    @Test
    void testConvertDuecentoventidue() {
        int input = 222;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXII", result);
    }
    
    @Test
    void testConvertDuecentoventitre() {
        int input = 223;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXIII", result);
    }
    
    @Test
    void testConvertDuecentoventiquattro() {
        int input = 224;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXIV", result);
    }
    
    @Test
    void testConvertDuecentoventicinque() {
        int input = 225;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXV", result);
    }
    
    @Test
    void testConvertDuecentoventisei() {
        int input = 226;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXVI", result);
    }
    
    @Test
    void testConvertDuecentoventisette() {
        int input = 227;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXVII", result);
    }
    
    @Test
    void testConvertDuecentoventotto() {
        int input = 228;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXVIII", result);
    }
    
    @Test
    void testConvertDuecentoventinove() {
        int input = 229;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXIX", result);
    }
    
    @Test
    void testConvertDuecentotrenta() {
        int input = 230;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXX", result);
    }
    
    @Test
    void testConvertDuecentotrentuno() {
        int input = 231;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXI", result);
    }
    
    @Test
    void testConvertDuecentotrentadue() {
        int input = 232;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXII", result);
    }
    
    @Test
    void testConvertDuecentotrentatre() {
        int input = 233;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXIII", result);
    }
    
    @Test
    void testConvertDuecentotrentaquattro() {
        int input = 234;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXIV", result);
    }
    
    @Test
    void testConvertDuecentotrentacinque() {
        int input = 235;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXV", result);
    }
    
    @Test
    void testConvertDuecentotrentasei() {
        int input = 236;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXVI", result);
    }
    
    @Test
    void testConvertDuecentotrentasette() {
        int input = 237;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXVII", result);
    }
    
    @Test
    void testConvertDuecentotrentotto() {
        int input = 238;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXVIII", result);
    }
    
    @Test
    void testConvertDuecentotrentanove() {
        int input = 239;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXXXIX", result);
    }
    
    @Test
    void testConvertDuecentoquaranta() {
        int input = 240;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXL", result);
    }
    
    @Test
    void testConvertDuecentoquarantuno() {
        int input = 241;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLI", result);
    }
    
    @Test
    void testConvertDuecentoquarantadue() {
        int input = 242;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLII", result);
    }
    
    @Test
    void testConvertDuecentoquarantatre() {
        int input = 243;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLIII", result);
    }
    
    @Test
    void testConvertDuecentoquarantaquattro() {
        int input = 244;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLIV", result);
    }
    
    @Test
    void testConvertDuecentoquarantacinque() {
        int input = 245;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLV", result);
    }
    
    @Test
    void testConvertDuecentoquarantasei() {
        int input = 246;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLVI", result);
    }
    
    @Test
    void testConvertDuecentoquarantasette() {
        int input = 247;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLVII", result);
    }
    
    @Test
    void testConvertDuecentoquarantotto() {
        int input = 248;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLVIII", result);
    }
    
    @Test
    void testConvertDuecentoquarantanove() {
        int input = 249;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXLIX", result);
    }
    
    @Test
    void testConvertDuecentocinquanta() {
        int input = 250;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCL", result);
    }

    @Test
    void testConvertDuecentocinquantuno() {
        int input = 251;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLI", result);
    }
    
    @Test
    void testConvertDuecentocinquantadue() {
        int input = 252;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLII", result);
    }
    
    @Test
    void testConvertDuecentocinquantatre() {
        int input = 253;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLIII", result);
    }
    
    @Test
    void testConvertDuecentocinquantaquattro() {
        int input = 254;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLIV", result);
    }
    
    @Test
    void testConvertDuecentocinquantacinque() {
        int input = 255;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLV", result);
    }
    
    @Test
    void testConvertDuecentocinquantasei() {
        int input = 256;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLVI", result);
    }
    
    @Test
    void testConvertDuecentocinquantasette() {
        int input = 257;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLVII", result);
    }
    
    @Test
    void testConvertDuecentocinquantotto() {
        int input = 258;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLVIII", result);
    }
    
    @Test
    void testConvertDuecentocinquantanove() {
        int input = 259;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLIX", result);
    }
    
    @Test
    void testConvertDuecentosessanta() {
        int input = 260;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLX", result);
    }
    
    @Test
    void testConvertDuecentosessantuno() {
        int input = 261;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXI", result);
    }
    
    @Test
    void testConvertDuecentosessantadue() {
        int input = 262;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXII", result);
    }
    
    @Test
    void testConvertDuecentosessantatre() {
        int input = 263;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXIII", result);
    }
    
    @Test
    void testConvertDuecentosessantaquattro() {
        int input = 264;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXIV", result);
    }
    
    @Test
    void testConvertDuecentosessantacinque() {
        int input = 265;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXV", result);
    }
    
    @Test
    void testConvertDuecentosessantasei() {
        int input = 266;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXVI", result);
    }
    
    @Test
    void testConvertDuecentosessantasette() {
        int input = 267;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXVII", result);
    }
    
    @Test
    void testConvertDuecentosessantotto() {
        int input = 268;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXVIII", result);
    }
    
    @Test
    void testConvertDuecentosessantanove() {
        int input = 269;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXIX", result);
    }
    
    @Test
    void testConvertDuecentosettanta() {
        int input = 270;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXX", result);
    }
    
    @Test
    void testConvertDuecentosettantuno() {
        int input = 271;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXI", result);
    }
    
    @Test
    void testConvertDuecentosettantadue() {
        int input = 272;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXII", result);
    }
    
    @Test
    void testConvertDuecentosettantatre() {
        int input = 273;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXIII", result);
    }
    
    @Test
    void testConvertDuecentosettantaquattro() {
        int input = 274;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXIV", result);
    }
    
    @Test
    void testConvertDuecentosettantacinque() {
        int input = 275;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXV", result);
    }
    
    @Test
    void testConvertDuecentosettantasei() {
        int input = 276;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXVI", result);
    }
    
    @Test
    void testConvertDuecentosettantasette() {
        int input = 277;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXVII", result);
    }
    
    @Test
    void testConvertDuecentosettantotto() {
        int input = 278;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXVIII", result);
    }
    
    @Test
    void testConvertDuecentosettantanove() {
        int input = 279;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXIX", result);
    }
    
    @Test
    void testConvertDuecentoottanta() {
        int input = 280;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXX", result);
    }
    
    @Test
    void testConvertDuecentoottantuno() {
        int input = 281;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXI", result);
    }
    
    @Test
    void testConvertDuecentoottantadue() {
        int input = 282;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXII", result);
    }
    
    @Test
    void testConvertDuecentoottantatre() {
        int input = 283;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXIII", result);
    }
    
    @Test
    void testConvertDuecentoottantaquattro() {
        int input = 284;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXIV", result);
    }
    
    @Test
    void testConvertDuecentoottantacinque() {
        int input = 285;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXV", result);
    }
    
    @Test
    void testConvertDuecentoottantasei() {
        int input = 286;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXVI", result);
    }
    
    @Test
    void testConvertDuecentoottantasette() {
        int input = 287;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXVII", result);
    }
    
    @Test
    void testConvertDuecentoottantotto() {
        int input = 288;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXVIII", result);
    }
    
    @Test
    void testConvertDuecentoottantanove() {
        int input = 289;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCLXXXIX", result);
    }
    
    @Test
    void testConvertDuecentonovanta() {
        int input = 290;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXC", result);
    }
    
    @Test
    void testConvertDuecentonovantuno() {
        int input = 291;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCI", result);
    }
    
    @Test
    void testConvertDuecentonovantadue() {
        int input = 292;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCII", result);
    }
    
    @Test
    void testConvertDuecentonovantatre() {
        int input = 293;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCIII", result);
    }
    
    @Test
    void testConvertDuecentonovantaquattro() {
        int input = 294;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCIV", result);
    }
    
    @Test
    void testConvertDuecentonovantacinque() {
        int input = 295;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCV", result);
    }
    
    @Test
    void testConvertDuecentonovantasei() {
        int input = 296;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCVI", result);
    }
    
    @Test
    void testConvertDuecentonovantasette() {
        int input = 297;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCVII", result);
    }
    
    @Test
    void testConvertDuecentonovantotto() {
        int input = 298;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCVIII", result);
    }
    
    @Test
    void testConvertDuecentonovantanove() {
        int input = 299;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCXCIX", result);
    }
    
    @Test
    void testConvertTrecento() {
        int input = 300;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCC", result);
    }

    @Test
    void testConvertTrecentouno() {
        int input = 301;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCI", result);
    }
    
    @Test
    void testConvertTrecentodue() {
        int input = 302;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCII", result);
    }
    
    @Test
    void testConvertTrecentotre() {
        int input = 303;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCIII", result);
    }
    
    @Test
    void testConvertTrecentoquattro() {
        int input = 304;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCIV", result);
    }
    
    @Test
    void testConvertTrecentocinque() {
        int input = 305;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCV", result);
    }
    
    @Test
    void testConvertTrecentosei() {
        int input = 306;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCVI", result);
    }
    
    @Test
    void testConvertTrecentosette() {
        int input = 307;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCVII", result);
    }
    
    @Test
    void testConvertTrecentootto() {
        int input = 308;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCVIII", result);
    }
    
    @Test
    void testConvertTrecentonove() {
        int input = 309;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCIX", result);
    }
    
    @Test
    void testConvertTrecentodieci() {
        int input = 310;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCX", result);
    }
    
    @Test
    void testConvertTrecentoundici() {
        int input = 311;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXI", result);
    }
    
    @Test
    void testConvertTrecentododici() {
        int input = 312;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXII", result);
    }
    
    @Test
    void testConvertTrecentotredici() {
        int input = 313;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXIII", result);
    }
    
    @Test
    void testConvertTrecentoquattordici() {
        int input = 314;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXIV", result);
    }
    
    @Test
    void testConvertTrecentoquindici() {
        int input = 315;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXV", result);
    }
    
    @Test
    void testConvertTrecentosedici() {
        int input = 316;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXVI", result);
    }
    
    @Test
    void testConvertTrecentodiciassette() {
        int input = 317;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXVII", result);
    }
    
    @Test
    void testConvertTrecentodiciotto() {
        int input = 318;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXVIII", result);
    }
    
    @Test
    void testConvertTrecentodiciannove() {
        int input = 319;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXIX", result);
    }
    
    @Test
    void testConvertTrecentoventi() {
        int input = 320;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXX", result);
    }
    
    @Test
    void testConvertTrecentoventuno() {
        int input = 321;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXI", result);
    }
    
    @Test
    void testConvertTrecentoventidue() {
        int input = 322;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXII", result);
    }
    
    @Test
    void testConvertTrecentoventitre() {
        int input = 323;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXIII", result);
    }
    
    @Test
    void testConvertTrecentoventiquattro() {
        int input = 324;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXIV", result);
    }
    
    @Test
    void testConvertTrecentoventicinque() {
        int input = 325;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXV", result);
    }
    
    @Test
    void testConvertTrecentoventisei() {
        int input = 326;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXVI", result);
    }
    
    @Test
    void testConvertTrecentoventisette() {
        int input = 327;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXVII", result);
    }
    
    @Test
    void testConvertTrecentoventotto() {
        int input = 328;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXVIII", result);
    }
    
    @Test
    void testConvertTrecentoventinove() {
        int input = 329;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXIX", result);
    }
    
    @Test
    void testConvertTrecentotrenta() {
        int input = 330;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXX", result);
    }
    
    @Test
    void testConvertTrecentotrentuno() {
        int input = 331;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXI", result);
    }
    
    @Test
    void testConvertTrecentotrentadue() {
        int input = 332;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXII", result);
    }
    
    @Test
    void testConvertTrecentotrentatre() {
        int input = 333;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXIII", result);
    }
    
    @Test
    void testConvertTrecentotrentaquattro() {
        int input = 334;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXIV", result);
    }
    
    @Test
    void testConvertTrecentotrentacinque() {
        int input = 335;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXV", result);
    }
    
    @Test
    void testConvertTrecentotrentasei() {
        int input = 336;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXVI", result);
    }
    
    @Test
    void testConvertTrecentotrentasette() {
        int input = 337;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXVII", result);
    }
    
    @Test
    void testConvertTrecentotrentotto() {
        int input = 338;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXVIII", result);
    }
    
    @Test
    void testConvertTrecentotrentanove() {
        int input = 339;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXIX", result);
    }
    
    @Test
    void testConvertTrecentoquaranta() {
        int input = 340;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXL", result);
    }
    
    @Test
    void testConvertTrecentoquarantuno() {
        int input = 341;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLI", result);
    }
    
    @Test
    void testConvertTrecentoquarantadue() {
        int input = 342;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLII", result);
    }
    
    @Test
    void testConvertTrecentoquarantatre() {
        int input = 343;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLIII", result);
    }
    
    @Test
    void testConvertTrecentoquarantaquattro() {
        int input = 344;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLIV", result);
    }
    
    @Test
    void testConvertTrecentoquarantacinque() {
        int input = 345;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLV", result);
    }
    
    @Test
    void testConvertTrecentoquarantasei() {
        int input = 346;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLVI", result);
    }
    
    @Test
    void testConvertTrecentoquarantasette() {
        int input = 347;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLVII", result);
    }
    
    @Test
    void testConvertTrecentoquarantotto() {
        int input = 348;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLVIII", result);
    }
    
    @Test
    void testConvertTrecentoquarantanove() {
        int input = 349;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXLIX", result);
    }
    
    @Test
    void testConvertTrecentocinquanta() {
        int input = 350;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCL", result);
    }

    @Test
    void testConvertTrecentocinquantuno() {
        int input = 351;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLI", result);
    }
    
    @Test
    void testConvertTrecentocinquantadue() {
        int input = 352;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLII", result);
    }
    
    @Test
    void testConvertTrecentocinquantatre() {
        int input = 353;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLIII", result);
    }
    
    @Test
    void testConvertTrecentocinquantaquattro() {
        int input = 354;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLIV", result);
    }
    
    @Test
    void testConvertTrecentocinquantacinque() {
        int input = 355;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLV", result);
    }
    
    @Test
    void testConvertTrecentocinquantasei() {
        int input = 356;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLVI", result);
    }
    
    @Test
    void testConvertTrecentocinquantasette() {
        int input = 357;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLVII", result);
    }
    
    @Test
    void testConvertTrecentocinquantotto() {
        int input = 358;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLVIII", result);
    }
    
    @Test
    void testConvertTrecentocinquantanove() {
        int input = 359;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLIX", result);
    }
    
    @Test
    void testConvertTrecentosessanta() {
        int input = 360;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLX", result);
    }
    
    @Test
    void testConvertTrecentosessantuno() {
        int input = 361;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXI", result);
    }
    
    @Test
    void testConvertTrecentosessantadue() {
        int input = 362;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXII", result);
    }
    
    @Test
    void testConvertTrecentosessantatre() {
        int input = 363;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXIII", result);
    }
    
    @Test
    void testConvertTrecentosessantaquattro() {
        int input = 364;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXIV", result);
    }
    
    @Test
    void testConvertTrecentosessantacinque() {
        int input = 365;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXV", result);
    }
    
    @Test
    void testConvertTrecentosessantasei() {
        int input = 366;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXVI", result);
    }
    
    @Test
    void testConvertTrecentosessantasette() {
        int input = 367;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXVII", result);
    }
    
    @Test
    void testConvertTrecentosessantotto() {
        int input = 368;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXVIII", result);
    }
    
    @Test
    void testConvertTrecentosessantanove() {
        int input = 369;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXIX", result);
    }
    
    @Test
    void testConvertTrecentosettanta() {
        int input = 370;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXX", result);
    }
    
    @Test
    void testConvertTrecentosettantuno() {
        int input = 371;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXI", result);
    }
    
    @Test
    void testConvertTrecentosettantadue() {
        int input = 372;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXII", result);
    }
    
    @Test
    void testConvertTrecentosettantatre() {
        int input = 373;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXIII", result);
    }
    
    @Test
    void testConvertTrecentosettantaquattro() {
        int input = 374;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXIV", result);
    }
    
    @Test
    void testConvertTrecentosettantacinque() {
        int input = 375;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXV", result);
    }
    
    @Test
    void testConvertTrecentosettantasei() {
        int input = 376;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXVI", result);
    }
    
    @Test
    void testConvertTrecentosettantasette() {
        int input = 377;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXVII", result);
    }
    
    @Test
    void testConvertTrecentosettantotto() {
        int input = 378;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXVIII", result);
    }
    
    @Test
    void testConvertTrecentosettantanove() {
        int input = 379;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXIX", result);
    }
    
    @Test
    void testConvertTrecentottanta() {
        int input = 380;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXX", result);
    }
    
    @Test
    void testConvertTrecentottantuno() {
        int input = 381;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXI", result);
    }
    
    @Test
    void testConvertTrecentottantadue() {
        int input = 382;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXII", result);
    }
    
    @Test
    void testConvertTrecentottantatre() {
        int input = 383;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXIII", result);
    }
    
    @Test
    void testConvertTrecentottantaquattro() {
        int input = 384;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXIV", result);
    }
    
    @Test
    void testConvertTrecentottantacinque() {
        int input = 385;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXV", result);
    }
    
    @Test
    void testConvertTrecentottantasei() {
        int input = 386;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXVI", result);
    }
    
    @Test
    void testConvertTrecentottantasette() {
        int input = 387;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXVII", result);
    }
    
    @Test
    void testConvertTrecentottantotto() {
        int input = 388;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXVIII", result);
    }
    
    @Test
    void testConvertTrecentottantanove() {
        int input = 389;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLXXXIX", result);
    }
    
    @Test
    void testConvertTrecentonovanta() {
        int input = 390;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXC", result);
    }
    
    @Test
    void testConvertTrecentonovantuno() {
        int input = 391;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCI", result);
    }
    
    @Test
    void testConvertTrecentonovantadue() {
        int input = 392;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCII", result);
    }
    
    @Test
    void testConvertTrecentonovantatre() {
        int input = 393;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCIII", result);
    }
    
    @Test
    void testConvertTrecentonovantaquattro() {
        int input = 394;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCIV", result);
    }
    
    @Test
    void testConvertTrecentonovantacinque() {
        int input = 395;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCV", result);
    }
    
    @Test
    void testConvertTrecentonovantasei() {
        int input = 396;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCVI", result);
    }
    
    @Test
    void testConvertTrecentonovantasette() {
        int input = 397;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCVII", result);
    }
    
    @Test
    void testConvertTrecentonovantotto() {
        int input = 398;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCVIII", result);
    }
    
    @Test
    void testConvertTrecentonovantanove() {
        int input = 399;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCIX", result);
    }
    
    @Test
    void testConvertQuattrocento() {
        int input = 400;
        String result = IntegerToRoman.convert(input);
        assertEquals("CD", result);
    }

    @Test
    void testConvertQuattrocentouno() {
        int input = 401;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDI", result);
    }
    
    @Test
    void testConvertQuattrocentodue() {
        int input = 402;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDII", result);
    }
    
    @Test
    void testConvertQuattrocentotre() {
        int input = 403;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDIII", result);
    }
    
    @Test
    void testConvertQuattrocentoquattro() {
        int input = 404;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDIV", result);
    }
    
    @Test
    void testConvertQuattrocentocinque() {
        int input = 405;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDV", result);
    }
    
    @Test
    void testConvertQuattrocentosei() {
        int input = 406;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDVI", result);
    }
    
    @Test
    void testConvertQuattrocentosette() {
        int input = 407;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDVII", result);
    }
    
    @Test
    void testConvertQuattrocentootto() {
        int input = 408;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDVIII", result);
    }
    
    @Test
    void testConvertQuattrocentonove() {
        int input = 409;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDIX", result);
    }
    
    @Test
    void testConvertQuattrocentodieci() {
        int input = 410;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDX", result);
    }
    
    @Test
    void testConvertQuattrocentoundici() {
        int input = 411;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXI", result);
    }
    
    @Test
    void testConvertQuattrocentododici() {
        int input = 412;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXII", result);
    }
    
    @Test
    void testConvertQuattrocentotredici() {
        int input = 413;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXIII", result);
    }
    
    @Test
    void testConvertQuattrocentoquattordici() {
        int input = 414;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXIV", result);
    }
    
    @Test
    void testConvertQuattrocentoquindici() {
        int input = 415;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXV", result);
    }
    
    @Test
    void testConvertQuattrocentosedici() {
        int input = 416;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXVI", result);
    }
    
    @Test
    void testConvertQuattrocentodiciassette() {
        int input = 417;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXVII", result);
    }
    
    @Test
    void testConvertQuattrocentodiciotto() {
        int input = 418;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXVIII", result);
    }
    
    @Test
    void testConvertQuattrocentodiciannove() {
        int input = 419;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXIX", result);
    }
    
    @Test
    void testConvertQuattrocentoventi() {
        int input = 420;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXX", result);
    }
    
    @Test
    void testConvertQuattrocentoventuno() {
        int input = 421;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXI", result);
    }
    
    @Test
    void testConvertQuattrocentoventidue() {
        int input = 422;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXII", result);
    }
    
    @Test
    void testConvertQuattrocentoventitre() {
        int input = 423;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXIII", result);
    }
    
    @Test
    void testConvertQuattrocentoventiquattro() {
        int input = 424;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXIV", result);
    }
    
    @Test
    void testConvertQuattrocentoventicinque() {
        int input = 425;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXV", result);
    }
    
    @Test
    void testConvertQuattrocentoventisei() {
        int input = 426;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXVI", result);
    }
    
    @Test
    void testConvertQuattrocentoventisette() {
        int input = 427;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXVII", result);
    }
    
    @Test
    void testConvertQuattrocentoventotto() {
        int input = 428;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXVIII", result);
    }
    
    @Test
    void testConvertQuattrocentoventinove() {
        int input = 429;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXIX", result);
    }
    
    @Test
    void testConvertQuattrocentotrenta() {
        int input = 430;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXX", result);
    }
    
    @Test
    void testConvertQuattrocentotrentuno() {
        int input = 431;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXI", result);
    }
    
    @Test
    void testConvertQuattrocentotrentadue() {
        int input = 432;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXII", result);
    }
    
    @Test
    void testConvertQuattrocentotrentatre() {
        int input = 433;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXIII", result);
    }
    
    @Test
    void testConvertQuattrocentotrentaquattro() {
        int input = 434;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXIV", result);
    }
    
    @Test
    void testConvertQuattrocentotrentacinque() {
        int input = 435;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXV", result);
    }
    
    @Test
    void testConvertQuattrocentotrentasei() {
        int input = 436;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXVI", result);
    }
    
    @Test
    void testConvertQuattrocentotrentasette() {
        int input = 437;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXVII", result);
    }
    
    @Test
    void testConvertQuattrocentotrentotto() {
        int input = 438;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXVIII", result);
    }
    
    @Test
    void testConvertQuattrocentotrentanove() {
        int input = 439;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXXXIX", result);
    }
    
    @Test
    void testConvertQuattrocentoquaranta() {
        int input = 440;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXL", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantuno() {
        int input = 441;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLI", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantadue() {
        int input = 442;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLII", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantatre() {
        int input = 443;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLIII", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantaquattro() {
        int input = 444;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLIV", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantacinque() {
        int input = 445;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLV", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantasei() {
        int input = 446;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLVI", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantasette() {
        int input = 447;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLVII", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantotto() {
        int input = 448;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLVIII", result);
    }
    
    @Test
    void testConvertQuattrocentoquarantanove() {
        int input = 449;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLIX", result);
    }
    
    @Test
    void testConvertQuattrocentocinquanta() {
        int input = 450;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDL", result);
    }

    @Test
    void testConvertQuattrocentocinquantuno() {
        int input = 451;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLI", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantadue() {
        int input = 452;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLII", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantatre() {
        int input = 453;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLIII", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantaquattro() {
        int input = 454;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLIV", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantacinque() {
        int input = 455;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLV", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantasei() {
        int input = 456;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLVI", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantasette() {
        int input = 457;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLVII", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantotto() {
        int input = 458;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLVIII", result);
    }
    
    @Test
    void testConvertQuattrocentocinquantanove() {
        int input = 459;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLIX", result);
    }
    
    @Test
    void testConvertQuattrocentosessanta() {
        int input = 460;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLX", result);
    }
    
    @Test
    void testConvertQuattrocentosessantuno() {
        int input = 461;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXI", result);
    }
    
    @Test
    void testConvertQuattrocentosessantadue() {
        int input = 462;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXII", result);
    }
    
    @Test
    void testConvertQuattrocentosessantatre() {
        int input = 463;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXIII", result);
    }
    
    @Test
    void testConvertQuattrocentosessantaquattro() {
        int input = 464;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXIV", result);
    }
    
    @Test
    void testConvertQuattrocentosessantacinque() {
        int input = 465;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXV", result);
    }
    
    @Test
    void testConvertQuattrocentosessantasei() {
        int input = 466;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXVI", result);
    }
    
    @Test
    void testConvertQuattrocentosessantasette() {
        int input = 467;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXVII", result);
    }
    
    @Test
    void testConvertQuattrocentosessantotto() {
        int input = 468;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXVIII", result);
    }
    
    @Test
    void testConvertQuattrocentosessantanove() {
        int input = 469;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXIX", result);
    }
    
    @Test
    void testConvertQuattrocentosettanta() {
        int input = 470;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXX", result);
    }
    
    @Test
    void testConvertQuattrocentosettantuno() {
        int input = 471;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXI", result);
    }
    
    @Test
    void testConvertQuattrocentosettantadue() {
        int input = 472;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXII", result);
    }
    
    @Test
    void testConvertQuattrocentosettantatre() {
        int input = 473;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXIII", result);
    }
    
    @Test
    void testConvertQuattrocentosettantaquattro() {
        int input = 474;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXIV", result);
    }
    
    @Test
    void testConvertQuattrocentosettantacinque() {
        int input = 475;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXV", result);
    }
    
    @Test
    void testConvertQuattrocentosettantasei() {
        int input = 476;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXVI", result);
    }
    
    @Test
    void testConvertQuattrocentosettantasette() {
        int input = 477;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXVII", result);
    }
    
    @Test
    void testConvertQuattrocentosettantotto() {
        int input = 478;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXVIII", result);
    }
    
    @Test
    void testConvertQuattrocentosettantanove() {
        int input = 479;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXIX", result);
    }
    
    @Test
    void testConvertQuattrocentottanta() {
        int input = 480;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXX", result);
    }
    
    @Test
    void testConvertQuattrocentottantuno() {
        int input = 481;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXI", result);
    }
    
    @Test
    void testConvertQuattrocentottantadue() {
        int input = 482;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXII", result);
    }
    
    @Test
    void testConvertQuattrocentottantatre() {
        int input = 483;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXIII", result);
    }
    
    @Test
    void testConvertQuattrocentottantaquattro() {
        int input = 484;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXIV", result);
    }
    
    @Test
    void testConvertQuattrocentottantacinque() {
        int input = 485;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXV", result);
    }
    
    @Test
    void testConvertQuattrocentottantasei() {
        int input = 486;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXVI", result);
    }
    
    @Test
    void testConvertQuattrocentottantasette() {
        int input = 487;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXVII", result);
    }
    
    @Test
    void testConvertQuattrocentottantotto() {
        int input = 488;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXVIII", result);
    }
    
    @Test
    void testConvertQuattrocentottantanove() {
        int input = 489;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDLXXXIX", result);
    }
    
    @Test
    void testConvertQuattrocentonovanta() {
        int input = 490;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXC", result);
    }
    
    @Test
    void testConvertQuattrocentonovantuno() {
        int input = 491;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCI", result);
    }
    
    @Test
    void testConvertQuattrocentonovantadue() {
        int input = 492;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCII", result);
    }
    
    @Test
    void testConvertQuattrocentonovantatre() {
        int input = 493;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCIII", result);
    }
    
    @Test
    void testConvertQuattrocentonovantaquattro() {
        int input = 494;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCIV", result);
    }
    
    @Test
    void testConvertQuattrocentonovantacinque() {
        int input = 495;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCV", result);
    }
    
    @Test
    void testConvertQuattrocentonovantasei() {
        int input = 496;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCVI", result);
    }
    
    @Test
    void testConvertQuattrocentonovantasette() {
        int input = 497;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCVII", result);
    }
    
    @Test
    void testConvertQuattrocentonovantotto() {
        int input = 498;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCVIII", result);
    }
    
    @Test
    void testConvertQuattrocentonovantanove() {
        int input = 499;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCIX", result);
    }
    
    @Test
    void testConvertCinquecento() {
        int input = 500;
        String result = IntegerToRoman.convert(input);
        assertEquals("D", result);
    }

    @Test
    void testConvertCinquecentouno() {
        int input = 501;
        String result = IntegerToRoman.convert(input);
        assertEquals("DI", result);
    }
    
    @Test
    void testConvertCinquecentodue() {
        int input = 502;
        String result = IntegerToRoman.convert(input);
        assertEquals("DII", result);
    }
    
    @Test
    void testConvertCinquecentotre() {
        int input = 503;
        String result = IntegerToRoman.convert(input);
        assertEquals("DIII", result);
    }
    
    @Test
    void testConvertCinquecentoquattro() {
        int input = 504;
        String result = IntegerToRoman.convert(input);
        assertEquals("DIV", result);
    }
    
    @Test
    void testConvertCinquecentocinque() {
        int input = 505;
        String result = IntegerToRoman.convert(input);
        assertEquals("DV", result);
    }
    
    @Test
    void testConvertCinquecentosei() {
        int input = 506;
        String result = IntegerToRoman.convert(input);
        assertEquals("DVI", result);
    }
    
    @Test
    void testConvertCinquecentosette() {
        int input = 507;
        String result = IntegerToRoman.convert(input);
        assertEquals("DVII", result);
    }
    
    @Test
    void testConvertCinquecentootto() {
        int input = 508;
        String result = IntegerToRoman.convert(input);
        assertEquals("DVIII", result);
    }
    
    @Test
    void testConvertCinquecentonove() {
        int input = 509;
        String result = IntegerToRoman.convert(input);
        assertEquals("DIX", result);
    }
    
    @Test
    void testConvertCinquecentodieci() {
        int input = 510;
        String result = IntegerToRoman.convert(input);
        assertEquals("DX", result);
    }
    
    @Test
    void testConvertCinquecentoundici() {
        int input = 511;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXI", result);
    }
    
    @Test
    void testConvertCinquecentododici() {
        int input = 512;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXII", result);
    }
    
    @Test
    void testConvertCinquecentotredici() {
        int input = 513;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXIII", result);
    }
    
    @Test
    void testConvertCinquecentoquattordici() {
        int input = 514;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXIV", result);
    }
    
    @Test
    void testConvertCinquecentoquindici() {
        int input = 515;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXV", result);
    }
    
    @Test
    void testConvertCinquecentosedici() {
        int input = 516;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXVI", result);
    }
    
    @Test
    void testConvertCinquecentodiciassette() {
        int input = 517;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXVII", result);
    }
    
    @Test
    void testConvertCinquecentodiciotto() {
        int input = 518;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXVIII", result);
    }
    
    @Test
    void testConvertCinquecentodiciannove() {
        int input = 519;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXIX", result);
    }
    
    @Test
    void testConvertCinquecentoventi() {
        int input = 520;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXX", result);
    }
    
    @Test
    void testConvertCinquecentoventuno() {
        int input = 521;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXI", result);
    }
    
    @Test
    void testConvertCinquecentoventidue() {
        int input = 522;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXII", result);
    }
    
    @Test
    void testConvertCinquecentoventitre() {
        int input = 523;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXIII", result);
    }
    
    @Test
    void testConvertCinquecentoventiquattro() {
        int input = 524;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXIV", result);
    }
    
    @Test
    void testConvertCinquecentoventicinque() {
        int input = 525;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXV", result);
    }
    
    @Test
    void testConvertCinquecentoventisei() {
        int input = 526;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXVI", result);
    }
    
    @Test
    void testConvertCinquecentoventisette() {
        int input = 527;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXVII", result);
    }
    
    @Test
    void testConvertCinquecentoventotto() {
        int input = 528;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXVIII", result);
    }
    
    @Test
    void testConvertCinquecentoventinove() {
        int input = 529;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXIX", result);
    }
    
    @Test
    void testConvertCinquecentotrenta() {
        int input = 530;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXX", result);
    }
    
    @Test
    void testConvertCinquecentotrentuno() {
        int input = 531;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXI", result);
    }
    
    @Test
    void testConvertCinquecentotrentadue() {
        int input = 532;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXII", result);
    }
    
    @Test
    void testConvertCinquecentotrentatre() {
        int input = 533;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXIII", result);
    }
    
    @Test
    void testConvertCinquecentotrentaquattro() {
        int input = 534;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXIV", result);
    }
    
    @Test
    void testConvertCinquecentotrentacinque() {
        int input = 535;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXV", result);
    }
    
    @Test
    void testConvertCinquecentotrentasei() {
        int input = 536;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXVI", result);
    }
    
    @Test
    void testConvertCinquecentotrentasette() {
        int input = 537;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXVII", result);
    }
    
    @Test
    void testConvertCinquecentotrentotto() {
        int input = 538;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXVIII", result);
    }
    
    @Test
    void testConvertCinquecentotrentanove() {
        int input = 539;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXXXIX", result);
    }
    
    @Test
    void testConvertCinquecentoquaranta() {
        int input = 540;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXL", result);
    }
    
    @Test
    void testConvertCinquecentoquarantuno() {
        int input = 541;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLI", result);
    }
    
    @Test
    void testConvertCinquecentoquarantadue() {
        int input = 542;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLII", result);
    }
    
    @Test
    void testConvertCinquecentoquarantatre() {
        int input = 543;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLIII", result);
    }
    
    @Test
    void testConvertCinquecentoquarantaquattro() {
        int input = 544;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLIV", result);
    }
    
    @Test
    void testConvertCinquecentoquarantacinque() {
        int input = 545;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLV", result);
    }
    
    @Test
    void testConvertCinquecentoquarantasei() {
        int input = 546;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLVI", result);
    }
    
    @Test
    void testConvertCinquecentoquarantasette() {
        int input = 547;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLVII", result);
    }
    
    @Test
    void testConvertCinquecentoquarantotto() {
        int input = 548;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLVIII", result);
    }
    
    @Test
    void testConvertCinquecentoquarantanove() {
        int input = 549;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXLIX", result);
    }
    
    @Test
    void testConvertCinquecentocinquanta() {
        int input = 550;
        String result = IntegerToRoman.convert(input);
        assertEquals("DL", result);
    }

    @Test
    void testConvertCinquecentocinquantuno() {
        int input = 551;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLI", result);
    }
    
    @Test
    void testConvertCinquecentocinquantadue() {
        int input = 552;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLII", result);
    }
    
    @Test
    void testConvertCinquecentocinquantatre() {
        int input = 553;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLIII", result);
    }
    
    @Test
    void testConvertCinquecentocinquantaquattro() {
        int input = 554;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLIV", result);
    }
    
    @Test
    void testConvertCinquecentocinquantacinque() {
        int input = 555;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLV", result);
    }
    
    @Test
    void testConvertCinquecentocinquantasei() {
        int input = 556;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLVI", result);
    }
    
    @Test
    void testConvertCinquecentocinquantasette() {
        int input = 557;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLVII", result);
    }
    
    @Test
    void testConvertCinquecentocinquantotto() {
        int input = 558;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLVIII", result);
    }
    
    @Test
    void testConvertCinquecentocinquantanove() {
        int input = 559;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLIX", result);
    }
    
    @Test
    void testConvertCinquecentosessanta() {
        int input = 560;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLX", result);
    }
    
    @Test
    void testConvertCinquecentosessantuno() {
        int input = 561;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXI", result);
    }
    
    @Test
    void testConvertCinquecentosessantadue() {
        int input = 562;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXII", result);
    }
    
    @Test
    void testConvertCinquecentosessantatre() {
        int input = 563;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXIII", result);
    }
    
    @Test
    void testConvertCinquecentosessantaquattro() {
        int input = 564;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXIV", result);
    }
    
    @Test
    void testConvertCinquecentosessantacinque() {
        int input = 565;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXV", result);
    }
    
    @Test
    void testConvertCinquecentosessantasei() {
        int input = 566;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXVI", result);
    }
    
    @Test
    void testConvertCinquecentosessantasette() {
        int input = 567;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXVII", result);
    }
    
    @Test
    void testConvertCinquecentosessantotto() {
        int input = 568;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXVIII", result);
    }
    
    @Test
    void testConvertCinquecentosessantanove() {
        int input = 569;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXIX", result);
    }
    
    @Test
    void testConvertCinquecentosettanta() {
        int input = 570;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXX", result);
    }
    
    @Test
    void testConvertCinquecentosettantuno() {
        int input = 571;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXI", result);
    }
    
    @Test
    void testConvertCinquecentosettantadue() {
        int input = 572;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXII", result);
    }
    
    @Test
    void testConvertCinquecentosettantatre() {
        int input = 573;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXIII", result);
    }
    
    @Test
    void testConvertCinquecentosettantaquattro() {
        int input = 574;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXIV", result);
    }
    
    @Test
    void testConvertCinquecentosettantacinque() {
        int input = 575;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXV", result);
    }
    
    @Test
    void testConvertCinquecentosettantasei() {
        int input = 576;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXVI", result);
    }
    
    @Test
    void testConvertCinquecentosettantasette() {
        int input = 577;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXVII", result);
    }
    
    @Test
    void testConvertCinquecentosettantotto() {
        int input = 578;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXVIII", result);
    }
    
    @Test
    void testConvertCinquecentosettantanove() {
        int input = 579;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXIX", result);
    }
    
    @Test
    void testConvertCinquecentottanta() {
        int input = 580;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXX", result);
    }
    
    @Test
    void testConvertCinquecentottantuno() {
        int input = 581;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXI", result);
    }
    
    @Test
    void testConvertCinquecentottantadue() {
        int input = 582;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXII", result);
    }
    
    @Test
    void testConvertCinquecentottantatre() {
        int input = 583;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXIII", result);
    }
    
    @Test
    void testConvertCinquecentottantaquattro() {
        int input = 584;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXIV", result);
    }
    
    @Test
    void testConvertCinquecentottantacinque() {
        int input = 585;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXV", result);
    }
    
    @Test
    void testConvertCinquecentottantasei() {
        int input = 586;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXVI", result);
    }
    
    @Test
    void testConvertCinquecentottantasette() {
        int input = 587;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXVII", result);
    }
    
    @Test
    void testConvertCinquecentottantotto() {
        int input = 588;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXVIII", result);
    }
    
    @Test
    void testConvertCinquecentottantanove() {
        int input = 589;
        String result = IntegerToRoman.convert(input);
        assertEquals("DLXXXIX", result);
    }
    
    @Test
    void testConvertCinquecentonovanta() {
        int input = 590;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXC", result);
    }
    
    @Test
    void testConvertCinquecentonovantuno() {
        int input = 591;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCI", result);
    }
    
    @Test
    void testConvertCinquecentonovantadue() {
        int input = 592;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCII", result);
    }
    
    @Test
    void testConvertCinquecentonovantatre() {
        int input = 593;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCIII", result);
    }
    
    @Test
    void testConvertCinquecentonovantaquattro() {
        int input = 594;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCIV", result);
    }
    
    @Test
    void testConvertCinquecentonovantacinque() {
        int input = 595;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCV", result);
    }
    
    @Test
    void testConvertCinquecentonovantasei() {
        int input = 596;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCVI", result);
    }
    
    @Test
    void testConvertCinquecentonovantasette() {
        int input = 597;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCVII", result);
    }
    
    @Test
    void testConvertCinquecentonovantotto() {
        int input = 598;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCVIII", result);
    }
    
    @Test
    void testConvertCinquecentonovantanove() {
        int input = 599;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCIX", result);
    }
    
    @Test
    void testConvertSeicento() {
        int input = 600;
        String result = IntegerToRoman.convert(input);
        assertEquals("DC", result);
    }

    @Test
    void testConvertSeicentouno() {
        int input = 601;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCI", result);
    }
    
    @Test
    void testConvertSeicentodue() {
        int input = 602;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCII", result);
    }
    
    @Test
    void testConvertSeicentotre() {
        int input = 603;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCIII", result);
    }
    
    @Test
    void testConvertSeicentoquattro() {
        int input = 604;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCIV", result);
    }
    
    @Test
    void testConvertSeicentocinque() {
        int input = 605;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCV", result);
    }
    
    @Test
    void testConvertSeicentosei() {
        int input = 606;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCVI", result);
    }
    
    @Test
    void testConvertSeicentosette() {
        int input = 607;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCVII", result);
    }
    
    @Test
    void testConvertSeicentootto() {
        int input = 608;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCVIII", result);
    }
    
    @Test
    void testConvertSeicentonove() {
        int input = 609;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCIX", result);
    }
    
    @Test
    void testConvertSeicentodieci() {
        int input = 610;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCX", result);
    }
    
    @Test
    void testConvertSeicentoundici() {
        int input = 611;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXI", result);
    }
    
    @Test
    void testConvertSeicentododici() {
        int input = 612;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXII", result);
    }
    
    @Test
    void testConvertSeicentotredici() {
        int input = 613;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXIII", result);
    }
    
    @Test
    void testConvertSeicentoquattordici() {
        int input = 614;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXIV", result);
    }
    
    @Test
    void testConvertSeicentoquindici() {
        int input = 615;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXV", result);
    }
    
    @Test
    void testConvertSeicentosedici() {
        int input = 616;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXVI", result);
    }
    
    @Test
    void testConvertSeicentodiciassette() {
        int input = 617;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXVII", result);
    }
    
    @Test
    void testConvertSeicentodiciotto() {
        int input = 618;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXVIII", result);
    }
    
    @Test
    void testConvertSeicentodiciannove() {
        int input = 619;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXIX", result);
    }
    
    @Test
    void testConvertSeicentoventi() {
        int input = 620;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXX", result);
    }
    
    @Test
    void testConvertSeicentoventuno() {
        int input = 621;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXI", result);
    }
    
    @Test
    void testConvertSeicentoventidue() {
        int input = 622;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXII", result);
    }
    
    @Test
    void testConvertSeicentoventitre() {
        int input = 623;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXIII", result);
    }
    
    @Test
    void testConvertSeicentoventiquattro() {
        int input = 624;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXIV", result);
    }
    
    @Test
    void testConvertSeicentoventicinque() {
        int input = 625;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXV", result);
    }
    
    @Test
    void testConvertSeicentoventisei() {
        int input = 626;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXVI", result);
    }
    
    @Test
    void testConvertSeicentoventisette() {
        int input = 627;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXVII", result);
    }
    
    @Test
    void testConvertSeicentoventotto() {
        int input = 628;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXVIII", result);
    }
    
    @Test
    void testConvertSeicentoventinove() {
        int input = 629;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXIX", result);
    }
    
    @Test
    void testConvertSeicentotrenta() {
        int input = 630;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXX", result);
    }
    
    @Test
    void testConvertSeicentotrentuno() {
        int input = 631;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXI", result);
    }
    
    @Test
    void testConvertSeicentotrentadue() {
        int input = 632;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXII", result);
    }
    
    @Test
    void testConvertSeicentotrentatre() {
        int input = 633;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXIII", result);
    }
    
    @Test
    void testConvertSeicentotrentaquattro() {
        int input = 634;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXIV", result);
    }
    
    @Test
    void testConvertSeicentotrentacinque() {
        int input = 635;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXV", result);
    }
    
    @Test
    void testConvertSeicentotrentasei() {
        int input = 636;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXVI", result);
    }
    
    @Test
    void testConvertSeicentotrentasette() {
        int input = 637;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXVII", result);
    }
    
    @Test
    void testConvertSeicentotrentotto() {
        int input = 638;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXVIII", result);
    }
    
    @Test
    void testConvertSeicentotrentanove() {
        int input = 639;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXXXIX", result);
    }
    
    @Test
    void testConvertSeicentoquaranta() {
        int input = 640;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXL", result);
    }
    
    @Test
    void testConvertSeicentoquarantuno() {
        int input = 641;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLI", result);
    }
    
    @Test
    void testConvertSeicentoquarantadue() {
        int input = 642;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLII", result);
    }
    
    @Test
    void testConvertSeicentoquarantatre() {
        int input = 643;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLIII", result);
    }
    
    @Test
    void testConvertSeicentoquarantaquattro() {
        int input = 644;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLIV", result);
    }
    
    @Test
    void testConvertSeicentoquarantacinque() {
        int input = 645;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLV", result);
    }
    
    @Test
    void testConvertSeicentoquarantasei() {
        int input = 646;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLVI", result);
    }
    
    @Test
    void testConvertSeicentoquarantasette() {
        int input = 647;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLVII", result);
    }
    
    @Test
    void testConvertSeicentoquarantotto() {
        int input = 648;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLVIII", result);
    }
    
    @Test
    void testConvertSeicentoquarantanove() {
        int input = 649;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXLIX", result);
    }
    
    @Test
    void testConvertSeicentocinquanta() {
        int input = 650;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCL", result);
    }

    @Test
    void testConvertSeicentocinquantuno() {
        int input = 651;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLI", result);
    }
    
    @Test
    void testConvertSeicentocinquantadue() {
        int input = 652;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLII", result);
    }
    
    @Test
    void testConvertSeicentocinquantatre() {
        int input = 653;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLIII", result);
    }
    
    @Test
    void testConvertSeicentocinquantaquattro() {
        int input = 654;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLIV", result);
    }
    
    @Test
    void testConvertSeicentocinquantacinque() {
        int input = 655;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLV", result);
    }
    
    @Test
    void testConvertSeicentocinquantasei() {
        int input = 656;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLVI", result);
    }
    
    @Test
    void testConvertSeicentocinquantasette() {
        int input = 657;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLVII", result);
    }
    
    @Test
    void testConvertSeicentocinquantotto() {
        int input = 658;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLVIII", result);
    }
    
    @Test
    void testConvertSeicentocinquantanove() {
        int input = 659;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLIX", result);
    }
    
    @Test
    void testConvertSeicentosessanta() {
        int input = 660;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLX", result);
    }
    
    @Test
    void testConvertSeicentosessantuno() {
        int input = 661;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXI", result);
    }
    
    @Test
    void testConvertSeicentosessantadue() {
        int input = 662;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXII", result);
    }
    
    @Test
    void testConvertSeicentosessantatre() {
        int input = 663;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXIII", result);
    }
    
    @Test
    void testConvertSeicentosessantaquattro() {
        int input = 664;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXIV", result);
    }
    
    @Test
    void testConvertSeicentosessantacinque() {
        int input = 665;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXV", result);
    }
    
    @Test
    void testConvertSeicentosessantasei() {
        int input = 666;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXVI", result);
    }
    
    @Test
    void testConvertSeicentosessantasette() {
        int input = 667;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXVII", result);
    }
    
    @Test
    void testConvertSeicentosessantotto() {
        int input = 668;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXVIII", result);
    }
    
    @Test
    void testConvertSeicentosessantanove() {
        int input = 669;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXIX", result);
    }
    
    @Test
    void testConvertSeicentosettanta() {
        int input = 670;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXX", result);
    }
    
    @Test
    void testConvertSeicentosettantuno() {
        int input = 671;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXI", result);
    }
    
    @Test
    void testConvertSeicentosettantadue() {
        int input = 672;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXII", result);
    }
    
    @Test
    void testConvertSeicentosettantatre() {
        int input = 673;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXIII", result);
    }
    
    @Test
    void testConvertSeicentosettantaquattro() {
        int input = 674;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXIV", result);
    }
    
    @Test
    void testConvertSeicentosettantacinque() {
        int input = 675;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXV", result);
    }
    
    @Test
    void testConvertSeicentosettantasei() {
        int input = 676;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXVI", result);
    }
    
    @Test
    void testConvertSeicentosettantasette() {
        int input = 677;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXVII", result);
    }
    
    @Test
    void testConvertSeicentosettantotto() {
        int input = 678;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXVIII", result);
    }
    
    @Test
    void testConvertSeicentosettantanove() {
        int input = 679;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXIX", result);
    }
    
    @Test
    void testConvertSeicentottanta() {
        int input = 680;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXX", result);
    }
    
    @Test
    void testConvertSeicentottantuno() {
        int input = 681;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXI", result);
    }
    
    @Test
    void testConvertSeicentottantadue() {
        int input = 682;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXII", result);
    }
    
    @Test
    void testConvertSeicentottantatre() {
        int input = 683;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXIII", result);
    }
    
    @Test
    void testConvertSeicentottantaquattro() {
        int input = 684;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXIV", result);
    }
    
    @Test
    void testConvertSeicentottantacinque() {
        int input = 685;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXV", result);
    }
    
    @Test
    void testConvertSeicentottantasei() {
        int input = 686;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXVI", result);
    }
    
    @Test
    void testConvertSeicentottantasette() {
        int input = 687;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXVII", result);
    }
    
    @Test
    void testConvertSeicentottantotto() {
        int input = 688;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXVIII", result);
    }
    
    @Test
    void testConvertSeicentottantanove() {
        int input = 689;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCLXXXIX", result);
    }
    
    @Test
    void testConvertSeicentonovanta() {
        int input = 690;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXC", result);
    }
    
    @Test
    void testConvertSeicentonovantuno() {
        int input = 691;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCI", result);
    }
    
    @Test
    void testConvertSeicentonovantadue() {
        int input = 692;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCII", result);
    }
    
    @Test
    void testConvertSeicentonovantatre() {
        int input = 693;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCIII", result);
    }
    
    @Test
    void testConvertSeicentonovantaquattro() {
        int input = 694;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCIV", result);
    }
    
    @Test
    void testConvertSeicentonovantacinque() {
        int input = 695;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCV", result);
    }
    
    @Test
    void testConvertSeicentonovantasei() {
        int input = 696;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCVI", result);
    }
    
    @Test
    void testConvertSeicentonovantasette() {
        int input = 697;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCVII", result);
    }
    
    @Test
    void testConvertSeicentonovantotto() {
        int input = 698;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCVIII", result);
    }
    
    @Test
    void testConvertSeicentonovantanove() {
        int input = 699;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCXCIX", result);
    }
    
    @Test
    void testConvertSettecento() {
        int input = 700;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCC", result);
    }

    @Test
    void testConvertSettecentouno() {
        int input = 701;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCI", result);
    }
    
    @Test
    void testConvertSettecentodue() {
        int input = 702;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCII", result);
    }
    
    @Test
    void testConvertSettecentotre() {
        int input = 703;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCIII", result);
    }
    
    @Test
    void testConvertSettecentoquattro() {
        int input = 704;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCIV", result);
    }
    
    @Test
    void testConvertSettecentocinque() {
        int input = 705;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCV", result);
    }
    
    @Test
    void testConvertSettecentosei() {
        int input = 706;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCVI", result);
    }
    
    @Test
    void testConvertSettecentosette() {
        int input = 707;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCVII", result);
    }
    
    @Test
    void testConvertSettecentootto() {
        int input = 708;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCVIII", result);
    }
    
    @Test
    void testConvertSettecentonove() {
        int input = 709;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCIX", result);
    }
    
    @Test
    void testConvertSettecentodieci() {
        int input = 710;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCX", result);
    }
    
    @Test
    void testConvertSettecentoundici() {
        int input = 711;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXI", result);
    }
    
    @Test
    void testConvertSettecentododici() {
        int input = 712;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXII", result);
    }
    
    @Test
    void testConvertSettecentotredici() {
        int input = 713;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXIII", result);
    }
    
    @Test
    void testConvertSettecentoquattordici() {
        int input = 714;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXIV", result);
    }
    
    @Test
    void testConvertSettecentoquindici() {
        int input = 715;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXV", result);
    }
    
    @Test
    void testConvertSettecentosedici() {
        int input = 716;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXVI", result);
    }
    
    @Test
    void testConvertSettecentodiciassette() {
        int input = 717;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXVII", result);
    }
    
    @Test
    void testConvertSettecentodiciotto() {
        int input = 718;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXVIII", result);
    }
    
    @Test
    void testConvertSettecentodiciannove() {
        int input = 719;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXIX", result);
    }
    
    @Test
    void testConvertSettecentoventi() {
        int input = 720;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXX", result);
    }
    
    @Test
    void testConvertSettecentoventuno() {
        int input = 721;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXI", result);
    }
    
    @Test
    void testConvertSettecentoventidue() {
        int input = 722;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXII", result);
    }
    
    @Test
    void testConvertSettecentoventitre() {
        int input = 723;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXIII", result);
    }
    
    @Test
    void testConvertSettecentoventiquattro() {
        int input = 724;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXIV", result);
    }
    
    @Test
    void testConvertSettecentoventicinque() {
        int input = 725;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXV", result);
    }
    
    @Test
    void testConvertSettecentoventisei() {
        int input = 726;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXVI", result);
    }
    
    @Test
    void testConvertSettecentoventisette() {
        int input = 727;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXVII", result);
    }
    
    @Test
    void testConvertSettecentoventotto() {
        int input = 728;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXVIII", result);
    }
    
    @Test
    void testConvertSettecentoventinove() {
        int input = 729;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXIX", result);
    }
    
    @Test
    void testConvertSettecentotrenta() {
        int input = 730;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXX", result);
    }
    
    @Test
    void testConvertSettecentotrentuno() {
        int input = 731;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXI", result);
    }
    
    @Test
    void testConvertSettecentotrentadue() {
        int input = 732;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXII", result);
    }
    
    @Test
    void testConvertSettecentotrentatre() {
        int input = 733;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXIII", result);
    }
    
    @Test
    void testConvertSettecentotrentaquattro() {
        int input = 734;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXIV", result);
    }
    
    @Test
    void testConvertSettecentotrentacinque() {
        int input = 735;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXV", result);
    }
    
    @Test
    void testConvertSettecentotrentasei() {
        int input = 736;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXVI", result);
    }
    
    @Test
    void testConvertSettecentotrentasette() {
        int input = 737;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXVII", result);
    }
    
    @Test
    void testConvertSettecentotrentotto() {
        int input = 738;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXVIII", result);
    }
    
    @Test
    void testConvertSettecentotrentanove() {
        int input = 739;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXXXIX", result);
    }
    
    @Test
    void testConvertSettecentoquaranta() {
        int input = 740;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXL", result);
    }
    
    @Test
    void testConvertSettecentoquarantuno() {
        int input = 741;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLI", result);
    }
    
    @Test
    void testConvertSettecentoquarantadue() {
        int input = 742;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLII", result);
    }
    
    @Test
    void testConvertSettecentoquarantatre() {
        int input = 743;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLIII", result);
    }
    
    @Test
    void testConvertSettecentoquarantaquattro() {
        int input = 744;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLIV", result);
    }
    
    @Test
    void testConvertSettecentoquarantacinque() {
        int input = 745;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLV", result);
    }
    
    @Test
    void testConvertSettecentoquarantasei() {
        int input = 746;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLVI", result);
    }
    
    @Test
    void testConvertSettecentoquarantasette() {
        int input = 747;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLVII", result);
    }
    
    @Test
    void testConvertSettecentoquarantotto() {
        int input = 748;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLVIII", result);
    }
    
    @Test
    void testConvertSettecentoquarantanove() {
        int input = 749;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXLIX", result);
    }
    
    @Test
    void testConvertSettecentocinquanta() {
        int input = 750;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCL", result);
    }

    @Test
    void testConvertSettecentocinquantuno() {
        int input = 751;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLI", result);
    }
    
    @Test
    void testConvertSettecentocinquantadue() {
        int input = 752;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLII", result);
    }
    
    @Test
    void testConvertSettecentocinquantatre() {
        int input = 753;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLIII", result);
    }
    
    @Test
    void testConvertSettecentocinquantaquattro() {
        int input = 754;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLIV", result);
    }
    
    @Test
    void testConvertSettecentocinquantacinque() {
        int input = 755;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLV", result);
    }
    
    @Test
    void testConvertSettecentocinquantasei() {
        int input = 756;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLVI", result);
    }
    
    @Test
    void testConvertSettecentocinquantasette() {
        int input = 757;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLVII", result);
    }
    
    @Test
    void testConvertSettecentocinquantotto() {
        int input = 758;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLVIII", result);
    }
    
    @Test
    void testConvertSettecentocinquantanove() {
        int input = 759;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLIX", result);
    }
    
    @Test
    void testConvertSettecentosessanta() {
        int input = 760;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLX", result);
    }
    
    @Test
    void testConvertSettecentosessantuno() {
        int input = 761;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXI", result);
    }
    
    @Test
    void testConvertSettecentosessantadue() {
        int input = 762;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXII", result);
    }
    
    @Test
    void testConvertSettecentosessantatre() {
        int input = 763;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXIII", result);
    }
    
    @Test
    void testConvertSettecentosessantaquattro() {
        int input = 764;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXIV", result);
    }
    
    @Test
    void testConvertSettecentosessantacinque() {
        int input = 765;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXV", result);
    }
    
    @Test
    void testConvertSettecentosessantasei() {
        int input = 766;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXVI", result);
    }
    
    @Test
    void testConvertSettecentosessantasette() {
        int input = 767;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXVII", result);
    }
    
    @Test
    void testConvertSettecentosessantotto() {
        int input = 768;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXVIII", result);
    }
    
    @Test
    void testConvertSettecentosessantanove() {
        int input = 769;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXIX", result);
    }
    
    @Test
    void testConvertSettecentosettanta() {
        int input = 770;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXX", result);
    }
    
    @Test
    void testConvertSettecentosettantuno() {
        int input = 771;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXI", result);
    }
    
    @Test
    void testConvertSettecentosettantadue() {
        int input = 772;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXII", result);
    }
    
    @Test
    void testConvertSettecentosettantatre() {
        int input = 773;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXIII", result);
    }
    
    @Test
    void testConvertSettecentosettantaquattro() {
        int input = 774;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXIV", result);
    }
    
    @Test
    void testConvertSettecentosettantacinque() {
        int input = 775;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXV", result);
    }
    
    @Test
    void testConvertSettecentosettantasei() {
        int input = 776;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXVI", result);
    }
    
    @Test
    void testConvertSettecentosettantasette() {
        int input = 777;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXVII", result);
    }
    
    @Test
    void testConvertSettecentosettantotto() {
        int input = 778;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXVIII", result);
    }
    
    @Test
    void testConvertSettecentosettantanove() {
        int input = 779;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXIX", result);
    }
    
    @Test
    void testConvertSettecentottanta() {
        int input = 780;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXX", result);
    }
    
    @Test
    void testConvertSettecentottantuno() {
        int input = 781;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXI", result);
    }
    
    @Test
    void testConvertSettecentottantadue() {
        int input = 782;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXII", result);
    }
    
    @Test
    void testConvertSettecentottantatre() {
        int input = 783;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXIII", result);
    }
    
    @Test
    void testConvertSettecentottantaquattro() {
        int input = 784;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXIV", result);
    }
    
    @Test
    void testConvertSettecentottantacinque() {
        int input = 785;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXV", result);
    }
    
    @Test
    void testConvertSettecentottantasei() {
        int input = 786;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXVI", result);
    }
    
    @Test
    void testConvertSettecentottantasette() {
        int input = 787;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXVII", result);
    }
    
    @Test
    void testConvertSettecentottantotto() {
        int input = 788;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXVIII", result);
    }
    
    @Test
    void testConvertSettecentottantanove() {
        int input = 789;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLXXXIX", result);
    }
    
    @Test
    void testConvertSettecentonovanta() {
        int input = 790;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXC", result);
    }
    
    @Test
    void testConvertSettecentonovantuno() {
        int input = 791;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCI", result);
    }
    
    @Test
    void testConvertSettecentonovantadue() {
        int input = 792;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCII", result);
    }
    
    @Test
    void testConvertSettecentonovantatre() {
        int input = 793;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCIII", result);
    }
    
    @Test
    void testConvertSettecentonovantaquattro() {
        int input = 794;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCIV", result);
    }
    
    @Test
    void testConvertSettecentonovantacinque() {
        int input = 795;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCV", result);
    }
    
    @Test
    void testConvertSettecentonovantasei() {
        int input = 796;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCVI", result);
    }
    
    @Test
    void testConvertSettecentonovantasette() {
        int input = 797;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCVII", result);
    }
    
    @Test
    void testConvertSettecentonovantotto() {
        int input = 798;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCVIII", result);
    }
    
    @Test
    void testConvertSettecentonovantanove() {
        int input = 799;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCXCIX", result);
    }
    
    @Test
    void testConvertOttocento() {
        int input = 800;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCC", result);
    }

    @Test
    void testConvertOttocentouno() {
        int input = 801;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCI", result);
    }
    
    @Test
    void testConvertOttocentodue() {
        int input = 802;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCII", result);
    }
    
    @Test
    void testConvertOttocentotre() {
        int input = 803;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCIII", result);
    }
    
    @Test
    void testConvertOttocentoquattro() {
        int input = 804;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCIV", result);
    }
    
    @Test
    void testConvertOttocentocinque() {
        int input = 805;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCV", result);
    }
    
    @Test
    void testConvertOttocentosei() {
        int input = 806;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCVI", result);
    }
    
    @Test
    void testConvertOttocentosette() {
        int input = 807;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCVII", result);
    }
    
    @Test
    void testConvertOttocentootto() {
        int input = 808;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCVIII", result);
    }
    
    @Test
    void testConvertOttocentonove() {
        int input = 809;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCIX", result);
    }
    
    @Test
    void testConvertOttocentodieci() {
        int input = 810;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCX", result);
    }
    
    @Test
    void testConvertOttocentoundici() {
        int input = 811;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXI", result);
    }
    
    @Test
    void testConvertOttocentododici() {
        int input = 812;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXII", result);
    }
    
    @Test
    void testConvertOttocentotredici() {
        int input = 813;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXIII", result);
    }
    
    @Test
    void testConvertOttocentoquattordici() {
        int input = 814;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXIV", result);
    }
    
    @Test
    void testConvertOttocentoquindici() {
        int input = 815;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXV", result);
    }
    
    @Test
    void testConvertOttocentosedici() {
        int input = 816;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXVI", result);
    }
    
    @Test
    void testConvertOttocentodiciassette() {
        int input = 817;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXVII", result);
    }
    
    @Test
    void testConvertOttocentodiciotto() {
        int input = 818;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXVIII", result);
    }
    
    @Test
    void testConvertOttocentodiciannove() {
        int input = 819;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXIX", result);
    }
    
    @Test
    void testConvertOttocentoventi() {
        int input = 820;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXX", result);
    }
    
    @Test
    void testConvertOttocentoventuno() {
        int input = 821;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXI", result);
    }
    
    @Test
    void testConvertOttocentoventidue() {
        int input = 822;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXII", result);
    }
    
    @Test
    void testConvertOttocentoventitre() {
        int input = 823;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXIII", result);
    }
    
    @Test
    void testConvertOttocentoventiquattro() {
        int input = 824;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXIV", result);
    }
    
    @Test
    void testConvertOttocentoventicinque() {
        int input = 825;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXV", result);
    }
    
    @Test
    void testConvertOttocentoventisei() {
        int input = 826;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXVI", result);
    }
    
    @Test
    void testConvertOttocentoventisette() {
        int input = 827;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXVII", result);
    }
    
    @Test
    void testConvertOttocentoventotto() {
        int input = 828;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXVIII", result);
    }
    
    @Test
    void testConvertOttocentoventinove() {
        int input = 829;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXIX", result);
    }
    
    @Test
    void testConvertOttocentotrenta() {
        int input = 830;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXX", result);
    }
    
    @Test
    void testConvertOttocentotrentuno() {
        int input = 831;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXI", result);
    }
    
    @Test
    void testConvertOttocentotrentadue() {
        int input = 832;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXII", result);
    }
    
    @Test
    void testConvertOttocentotrentatre() {
        int input = 833;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXIII", result);
    }
    
    @Test
    void testConvertOttocentotrentaquattro() {
        int input = 834;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXIV", result);
    }
    
    @Test
    void testConvertOttocentotrentacinque() {
        int input = 835;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXV", result);
    }
    
    @Test
    void testConvertOttocentotrentasei() {
        int input = 836;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXVI", result);
    }
    
    @Test
    void testConvertOttocentotrentasette() {
        int input = 837;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXVII", result);
    }
    
    @Test
    void testConvertOttocentotrentotto() {
        int input = 838;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXVIII", result);
    }
    
    @Test
    void testConvertOttocentotrentanove() {
        int input = 839;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXXXIX", result);
    }
    
    @Test
    void testConvertOttocentoquaranta() {
        int input = 840;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXL", result);
    }
    
    @Test
    void testConvertOttocentoquarantuno() {
        int input = 841;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLI", result);
    }
    
    @Test
    void testConvertOttocentoquarantadue() {
        int input = 842;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLII", result);
    }
    
    @Test
    void testConvertOttocentoquarantatre() {
        int input = 843;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLIII", result);
    }
    
    @Test
    void testConvertOttocentoquarantaquattro() {
        int input = 844;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLIV", result);
    }
    
    @Test
    void testConvertOttocentoquarantacinque() {
        int input = 845;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLV", result);
    }
    
    @Test
    void testConvertOttocentoquarantasei() {
        int input = 846;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLVI", result);
    }
    
    @Test
    void testConvertOttocentoquarantasette() {
        int input = 847;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLVII", result);
    }
    
    @Test
    void testConvertOttocentoquarantotto() {
        int input = 848;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLVIII", result);
    }
    
    @Test
    void testConvertOttocentoquarantanove() {
        int input = 849;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXLIX", result);
    }
    
    @Test
    void testConvertOttocentocinquanta() {
        int input = 850;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCL", result);
    }
        @Test
    void testConvertOttocentocinquantuno() {
        int input = 851;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLI", result);
    }
    
    @Test
    void testConvertOttocentocinquantadue() {
        int input = 852;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLII", result);
    }
    
    @Test
    void testConvertOttocentocinquantatre() {
        int input = 853;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLIII", result);
    }
    
    @Test
    void testConvertOttocentocinquantaquattro() {
        int input = 854;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLIV", result);
    }
    
    @Test
    void testConvertOttocentocinquantacinque() {
        int input = 855;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLV", result);
    }
    
    @Test
    void testConvertOttocentocinquantasei() {
        int input = 856;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLVI", result);
    }
    
    @Test
    void testConvertOttocentocinquantasette() {
        int input = 857;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLVII", result);
    }
    
    @Test
    void testConvertOttocentocinquantotto() {
        int input = 858;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLVIII", result);
    }
    
    @Test
    void testConvertOttocentocinquantanove() {
        int input = 859;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLIX", result);
    }
    
    @Test
    void testConvertOttocentosessanta() {
        int input = 860;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLX", result);
    }
    
    @Test
    void testConvertOttocentosessantuno() {
        int input = 861;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXI", result);
    }
    
    @Test
    void testConvertOttocentosessantadue() {
        int input = 862;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXII", result);
    }
    
    @Test
    void testConvertOttocentosessantatre() {
        int input = 863;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXIII", result);
    }
    
    @Test
    void testConvertOttocentosessantaquattro() {
        int input = 864;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXIV", result);
    }
    
    @Test
    void testConvertOttocentosessantacinque() {
        int input = 865;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXV", result);
    }
    
    @Test
    void testConvertOttocentosessantasei() {
        int input = 866;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXVI", result);
    }
    
    @Test
    void testConvertOttocentosessantasette() {
        int input = 867;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXVII", result);
    }
    
    @Test
    void testConvertOttocentosessantotto() {
        int input = 868;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXVIII", result);
    }
    
    @Test
    void testConvertOttocentosessantanove() {
        int input = 869;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXIX", result);
    }
    
    @Test
    void testConvertOttocentosettanta() {
        int input = 870;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXX", result);
    }
    
    @Test
    void testConvertOttocentosettantuno() {
        int input = 871;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXI", result);
    }
    
    @Test
    void testConvertOttocentosettantadue() {
        int input = 872;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXII", result);
    }
    
    @Test
    void testConvertOttocentosettantatre() {
        int input = 873;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXIII", result);
    }
    
    @Test
    void testConvertOttocentosettantaquattro() {
        int input = 874;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXIV", result);
    }
    
    @Test
    void testConvertOttocentosettantacinque() {
        int input = 875;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXV", result);
    }
    
    @Test
    void testConvertOttocentosettantasei() {
        int input = 876;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXVI", result);
    }
    
    @Test
    void testConvertOttocentosettantasette() {
        int input = 877;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXVII", result);
    }
    
    @Test
    void testConvertOttocentosettantotto() {
        int input = 878;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXVIII", result);
    }
    
    @Test
    void testConvertOttocentosettantanove() {
        int input = 879;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXIX", result);
    }
    
    @Test
    void testConvertOttocentottanta() {
        int input = 880;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXX", result);
    }
    
    @Test
    void testConvertOttocentottantuno() {
        int input = 881;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXI", result);
    }
    
    @Test
    void testConvertOttocentottantadue() {
        int input = 882;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXII", result);
    }
    
    @Test
    void testConvertOttocentottantatre() {
        int input = 883;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXIII", result);
    }
    
    @Test
    void testConvertOttocentottantaquattro() {
        int input = 884;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXIV", result);
    }
    
    @Test
    void testConvertOttocentottantacinque() {
        int input = 885;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXV", result);
    }
    
    @Test
    void testConvertOttocentottantasei() {
        int input = 886;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXVI", result);
    }
    
    @Test
    void testConvertOttocentottantasette() {
        int input = 887;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXVII", result);
    }
    
    @Test
    void testConvertOttocentottantotto() {
        int input = 888;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXVIII", result);
    }
    
    @Test
    void testConvertOttocentottantanove() {
        int input = 889;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXIX", result);
    }
    
    @Test
    void testConvertOttocentonovanta() {
        int input = 890;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXC", result);
    }
    
    @Test
    void testConvertOttocentonovantuno() {
        int input = 891;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCI", result);
    }
    
    @Test
    void testConvertOttocentonovantadue() {
        int input = 892;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCII", result);
    }
    
    @Test
    void testConvertOttocentonovantatre() {
        int input = 893;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCIII", result);
    }
    
    @Test
    void testConvertOttocentonovantaquattro() {
        int input = 894;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCIV", result);
    }
    
    @Test
    void testConvertOttocentonovantacinque() {
        int input = 895;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCV", result);
    }
    
    @Test
    void testConvertOttocentonovantasei() {
        int input = 896;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCVI", result);
    }
    
    @Test
    void testConvertOttocentonovantasette() {
        int input = 897;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCVII", result);
    }
    
    @Test
    void testConvertOttocentonovantotto() {
        int input = 898;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCVIII", result);
    }
    
    @Test
    void testConvertOttocentonovantanove() {
        int input = 899;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCXCIX", result);
    }
    
    @Test
    void testConvertNovecento() {
        int input = 900;
        String result = IntegerToRoman.convert(input);
        assertEquals("CM", result);
    }
    
        @Test
    void testConvertNovecentouno() {
        int input = 901;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMI", result);
    }
    
    @Test
    void testConvertNovecentodue() {
        int input = 902;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMII", result);
    }
    
    @Test
    void testConvertNovecentotre() {
        int input = 903;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMIII", result);
    }
    
    @Test
    void testConvertNovecentoquattro() {
        int input = 904;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMIV", result);
    }
    
    @Test
    void testConvertNovecentocinque() {
        int input = 905;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMV", result);
    }
    
    @Test
    void testConvertNovecentosei() {
        int input = 906;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMVI", result);
    }
    
    @Test
    void testConvertNovecentosette() {
        int input = 907;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMVII", result);
    }
    
    @Test
    void testConvertNovecentootto() {
        int input = 908;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMVIII", result);
    }
    
    @Test
    void testConvertNovecentonove() {
        int input = 909;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMIX", result);
    }
    
    @Test
    void testConvertNovecentodieci() {
        int input = 910;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMX", result);
    }
    
    @Test
    void testConvertNovecentoundici() {
        int input = 911;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXI", result);
    }
    
    @Test
    void testConvertNovecentododici() {
        int input = 912;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXII", result);
    }
    
    @Test
    void testConvertNovecentotredici() {
        int input = 913;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXIII", result);
    }
    
    @Test
    void testConvertNovecentoquattordici() {
        int input = 914;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXIV", result);
    }
    
    @Test
    void testConvertNovecentoquindici() {
        int input = 915;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXV", result);
    }
    
    @Test
    void testConvertNovecentosedici() {
        int input = 916;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXVI", result);
    }
    
    @Test
    void testConvertNovecentodiciassette() {
        int input = 917;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXVII", result);
    }
    
    @Test
    void testConvertNovecentodiciotto() {
        int input = 918;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXVIII", result);
    }
    
    @Test
    void testConvertNovecentodiciannove() {
        int input = 919;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXIX", result);
    }
    
    @Test
    void testConvertNovecentoventi() {
        int input = 920;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXX", result);
    }
    
    @Test
    void testConvertNovecentoventuno() {
        int input = 921;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXI", result);
    }
    
    @Test
    void testConvertNovecentoventidue() {
        int input = 922;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXII", result);
    }
    
    @Test
    void testConvertNovecentoventitre() {
        int input = 923;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXIII", result);
    }
    
    @Test
    void testConvertNovecentoventiquattro() {
        int input = 924;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXIV", result);
    }
    
    @Test
    void testConvertNovecentoventicinque() {
        int input = 925;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXV", result);
    }
    
    @Test
    void testConvertNovecentoventisei() {
        int input = 926;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXVI", result);
    }
    
    @Test
    void testConvertNovecentoventisette() {
        int input = 927;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXVII", result);
    }
    
    @Test
    void testConvertNovecentoventotto() {
        int input = 928;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXVIII", result);
    }
    
    @Test
    void testConvertNovecentoventinove() {
        int input = 929;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXIX", result);
    }
    
    @Test
    void testConvertNovecentotrenta() {
        int input = 930;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXX", result);
    }
    
    @Test
    void testConvertNovecentotrentuno() {
        int input = 931;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXI", result);
    }
    
    @Test
    void testConvertNovecentotrentadue() {
        int input = 932;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXII", result);
    }
    
    @Test
    void testConvertNovecentotrentatre() {
        int input = 933;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXIII", result);
    }
    
    @Test
    void testConvertNovecentotrentaquattro() {
        int input = 934;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXIV", result);
    }
    
    @Test
    void testConvertNovecentotrentacinque() {
        int input = 935;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXV", result);
    }
    
    @Test
    void testConvertNovecentotrentasei() {
        int input = 936;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXVI", result);
    }
    
    @Test
    void testConvertNovecentotrentasette() {
        int input = 937;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXVII", result);
    }
    
    @Test
    void testConvertNovecentotrentotto() {
        int input = 938;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXVIII", result);
    }
    
    @Test
    void testConvertNovecentotrentanove() {
        int input = 939;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXXXIX", result);
    }
    
    @Test
    void testConvertNovecentoquaranta() {
        int input = 940;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXL", result);
    }
    
    @Test
    void testConvertNovecentoquarantuno() {
        int input = 941;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLI", result);
    }
    
    @Test
    void testConvertNovecentoquarantadue() {
        int input = 942;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLII", result);
    }
    
    @Test
    void testConvertNovecentoquarantatre() {
        int input = 943;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLIII", result);
    }
    
    @Test
    void testConvertNovecentoquarantaquattro() {
        int input = 944;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLIV", result);
    }
    
    @Test
    void testConvertNovecentoquarantacinque() {
        int input = 945;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLV", result);
    }
    
    @Test
    void testConvertNovecentoquarantasei() {
        int input = 946;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLVI", result);
    }
    
    @Test
    void testConvertNovecentoquarantasette() {
        int input = 947;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLVII", result);
    }
    
    @Test
    void testConvertNovecentoquarantotto() {
        int input = 948;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLVIII", result);
    }
    
    @Test
    void testConvertNovecentoquarantanove() {
        int input = 949;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXLIX", result);
    }
    
    @Test
    void testConvertNovecentocinquanta() {
        int input = 950;
        String result = IntegerToRoman.convert(input);
        assertEquals("CML", result);
    }
    
        @Test
    void testConvertNovecentocinquantuno() {
        int input = 951;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLI", result);
    }
    
    @Test
    void testConvertNovecentocinquantadue() {
        int input = 952;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLII", result);
    }
    
    @Test
    void testConvertNovecentocinquantatre() {
        int input = 953;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLIII", result);
    }
    
    @Test
    void testConvertNovecentocinquantaquattro() {
        int input = 954;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLIV", result);
    }
    
    @Test
    void testConvertNovecentocinquantacinque() {
        int input = 955;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLV", result);
    }
    
    @Test
    void testConvertNovecentocinquantasei() {
        int input = 956;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLVI", result);
    }
    
    @Test
    void testConvertNovecentocinquantasette() {
        int input = 957;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLVII", result);
    }
    
    @Test
    void testConvertNovecentocinquantotto() {
        int input = 958;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLVIII", result);
    }
    
    @Test
    void testConvertNovecentocinquantanove() {
        int input = 959;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLIX", result);
    }
    
    @Test
    void testConvertNovecentosessanta() {
        int input = 960;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLX", result);
    }
    
    @Test
    void testConvertNovecentosessantuno() {
        int input = 961;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXI", result);
    }
    
    @Test
    void testConvertNovecentosessantadue() {
        int input = 962;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXII", result);
    }
    
    @Test
    void testConvertNovecentosessantatre() {
        int input = 963;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXIII", result);
    }
    
    @Test
    void testConvertNovecentosessantaquattro() {
        int input = 964;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXIV", result);
    }
    
    @Test
    void testConvertNovecentosessantacinque() {
        int input = 965;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXV", result);
    }
    
    @Test
    void testConvertNovecentosessantasei() {
        int input = 966;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXVI", result);
    }
    
    @Test
    void testConvertNovecentosessantasette() {
        int input = 967;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXVII", result);
    }
    
    @Test
    void testConvertNovecentosessantotto() {
        int input = 968;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXVIII", result);
    }
    
    @Test
    void testConvertNovecentosessantanove() {
        int input = 969;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXIX", result);
    }
    
    @Test
    void testConvertNovecentosettanta() {
        int input = 970;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXX", result);
    }
    
    @Test
    void testConvertNovecentosettantuno() {
        int input = 971;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXI", result);
    }
    
    @Test
    void testConvertNovecentosettantadue() {
        int input = 972;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXII", result);
    }
    
    @Test
    void testConvertNovecentosettantatre() {
        int input = 973;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXIII", result);
    }
    
    @Test
    void testConvertNovecentosettantaquattro() {
        int input = 974;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXIV", result);
    }
    
    @Test
    void testConvertNovecentosettantacinque() {
        int input = 975;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXV", result);
    }
    
    @Test
    void testConvertNovecentosettantasei() {
        int input = 976;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXVI", result);
    }
    
    @Test
    void testConvertNovecentosettantasette() {
        int input = 977;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXVII", result);
    }
    
    @Test
    void testConvertNovecentosettantotto() {
        int input = 978;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXVIII", result);
    }
    
    @Test
    void testConvertNovecentosettantanove() {
        int input = 979;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXIX", result);
    }
    
    @Test
    void testConvertNovecentottanta() {
        int input = 980;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXX", result);
    }
    
    @Test
    void testConvertNovecentottantuno() {
        int input = 981;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXI", result);
    }
    
    @Test
    void testConvertNovecentottantadue() {
        int input = 982;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXII", result);
    }
    
    @Test
    void testConvertNovecentottantatre() {
        int input = 983;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXIII", result);
    }
    
    @Test
    void testConvertNovecentottantaquattro() {
        int input = 984;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXIV", result);
    }
    
    @Test
    void testConvertNovecentottantacinque() {
        int input = 985;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXV", result);
    }
    
    @Test
    void testConvertNovecentottantasei() {
        int input = 986;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXVI", result);
    }
    
    @Test
    void testConvertNovecentottantasette() {
        int input = 987;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXVII", result);
    }
    
    @Test
    void testConvertNovecentottantotto() {
        int input = 988;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXVIII", result);
    }
    
    @Test
    void testConvertNovecentottantanove() {
        int input = 989;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMLXXXIX", result);
    }
    
    @Test
    void testConvertNovecentonovanta() {
        int input = 990;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXC", result);
    }
    
    @Test
    void testConvertNovecentonovantuno() {
        int input = 991;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCI", result);
    }
    
    @Test
    void testConvertNovecentonovantadue() {
        int input = 992;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCII", result);
    }
    
    @Test
    void testConvertNovecentonovantatre() {
        int input = 993;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCIII", result);
    }
    
    @Test
    void testConvertNovecentonovantaquattro() {
        int input = 994;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCIV", result);
    }
    
    @Test
    void testConvertNovecentonovantacinque() {
        int input = 995;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCV", result);
    }
    
    @Test
    void testConvertNovecentonovantasei() {
        int input = 996;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCVI", result);
    }
    
    @Test
    void testConvertNovecentonovantasette() {
        int input = 997;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCVII", result);
    }
    
    @Test
    void testConvertNovecentonovantotto() {
        int input = 998;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCVIII", result);
    }
    
    @Test
    void testConvertNovecentonovantanove() {
        int input = 999;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCIX", result);
    }
    
    @Test
    void testConvertMille() {
        int input = 1000;
        String result = IntegerToRoman.convert(input);
        assertEquals("M", result);
    }
}
