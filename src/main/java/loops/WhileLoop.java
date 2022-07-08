package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 11;
        while (i < 10) {
            System.out.println(i);
            if (i == 5)
                break;
            i++;
        }

        do {
            System.out.println(i);
            if (i == 5)
                break;
            i++;
        } while (i < 10);
    }
}
