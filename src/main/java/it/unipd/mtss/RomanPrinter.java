////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }
        String[] rows = {"", "", "", "", "", ""};
        for (char c : romanNumber.toCharArray()) {
            String[] asciiChar = getCharAscii(c);
            for (int i = 0; i < 6; i++) {
                rows[i] += asciiChar[i];
            }
        }
        return String.join("\n", rows);
    }

    private static String[] getCharAscii(char c) {
        switch (c) {
            case 'I': return new String[]{" _____ ", "|_   _|", "  | |  ", "  | |  ", " _| |_ ", "|_____|"};
            case 'V': return new String[]{"__      __", "\\ \\    / /", " \\ \\  / / ", "  \\ \\/ /  ", "   \\  /   ", "    \\/    "};
            case 'X': return new String[]{"__   __", "\\ \\ / /", " \\ V / ", "  > <  ", " / . \\ ", "/_/ \\_\\"};
            case 'L': return new String[]{" _      ", "| |     ", "| |     ", "| |     ", "| |____ ", "|______|"};
            case 'C': return new String[]{"  _____ ", " / ____|", "| |     ", "| |     ", "| |____ ", " \\_____|"};
            case 'D': return new String[]{" _____  ", "|  __ \\ ", "| |  | |", "| |  | |", "| |__| |", "|_____/ "};
            case 'M': return new String[]{" __  __ ", "|  \\/  |", "| \\  / |", "| |\\/| |", "| |  | |", "|_|  |_|"};
            default: return new String[]{"", "", "", "", "", ""};
        }
    }
}