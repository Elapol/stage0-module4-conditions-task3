package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        isEnglishSymbol('a');
    }
    public static void isEnglishSymbol(char symbol) {
        if (symbol == 'a' || symbol== 'b' || symbol=='q'|| symbol=='w'|| symbol=='e'|| symbol=='r'|| symbol=='t'|| symbol=='y'|| symbol=='u'|| symbol=='i'|| symbol=='o'|| symbol=='p'|| symbol=='s'|| symbol=='d'|| symbol=='f'|| symbol=='g'|| symbol=='h'|| symbol=='j'|| symbol=='k'|| symbol=='l'|| symbol=='z'|| symbol=='x'|| symbol=='c'|| symbol=='v'|| symbol=='n'|| symbol=='m') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}