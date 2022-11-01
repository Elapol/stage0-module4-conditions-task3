package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void main(String[] args) {
        vowelDeterminer('A');
    }
    public static void vowelDeterminer(char character) {
        if (character == 'e' || character == 'y' ||character == 'u' ||character == 'i' ||character == 'o' ||character == 'a' ) {
            System.out.println("Vowel");
        } else if (character == 'q' ||character == 'w' ||character == 'r' ||character == 't' ||character == 'p' ||character == 's' ||character == 'd' ||character == 'f' ||character == 'g' ||character == 'h' ||character == 'j' ||character == 'k' ||character == 'l' ||character == 'z' ||character == 'x' ||character == 'c' ||character == 'v' ||character == 'b' ||character == 'n' ||character == 'm') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
