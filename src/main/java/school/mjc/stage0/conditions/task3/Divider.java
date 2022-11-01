package school.mjc.stage0.conditions.task3;

public class Divider {
    public static void main(String[] args) {
        isDividableBy5And11(0);
    }
    public static void isDividableBy5And11(int number) {
        if (( number !=0 && number == (number/5) * 5) || (number!=0 && number == (number/11)*11)) {
            System.out.println("Dividable");
        } else if (number != (number/5) * 5 || number != (number/11) *11) {
            System.out.println("Non-dividable" );
        } else {
            System.out.println( "cannot divide by zero" );
        }
    }
}
