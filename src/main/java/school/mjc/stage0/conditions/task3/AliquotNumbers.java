package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void main(String[] args) {
        isFirstAliquot(5,12);
    }
    public static void isFirstAliquot(int first, int second) {
        if (first >= 0 && first<second && first!= second) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
