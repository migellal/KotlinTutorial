package loops;

/**
 * Created by micha on 21.10.2016.
 */
public class Loops {
    private static String[] t = {"abc", "cde", "efg"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("for1 = " + i + ", ");
        }
        System.out.println();

        for (String s : t) {
            System.out.print("for2 = " + s + ", ");
        }
        System.out.println();

        int i = 0;
        while (i < 10) {
            System.out.print("while = " + i + ", ");
            i++;
        }
        System.out.println();
        do {
            System.out.println("do while");
        } while (1 > 10);
    }

}
