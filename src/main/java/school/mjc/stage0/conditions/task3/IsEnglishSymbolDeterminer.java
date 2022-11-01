package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        isEnglishSymbol('a');
    }
    public static void isEnglishSymbol(char symbol) {
        if (symbol == 'a' || symbol== 'b' || symbol=='q'|| symbol=='w'|| symbol=='e'|| symbol=='r'|| symbol=='t'|| symbol=='y'|| symbol=='u'|| symbol=='i'|| symbol=='o'|| symbol=='p'|| symbol=='s'|| symbol=='d'|| symbol=='f'|| symbol=='g'|| symbol=='h'|| symbol=='j'|| symbol=='k'|| symbol=='l'|| symbol=='z'|| symbol=='x'|| symbol=='c'|| symbol=='v'|| symbol=='n'|| symbol=='m'|| symbol=='Q'|| symbol=='W'|| symbol=='E'|| symbol=='R'|| symbol=='T'|| symbol=='Y'|| symbol=='U'|| symbol=='I'|| symbol=='O'|| symbol=='P'|| symbol=='A'|| symbol=='S'|| symbol=='D'|| symbol=='F'|| symbol=='G'|| symbol=='H'|| symbol=='J'|| symbol=='K'|| symbol=='L'|| symbol=='Z'|| symbol=='X'|| symbol=='C'|| symbol=='V'|| symbol=='B'|| symbol=='N'|| symbol=='M') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}