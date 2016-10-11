package variables;

/**
 * Created by micha on 10.10.2016.
 */

public class Variables {
    static int z = 5;
    static int h;

    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        final byte fb = 127;
        final short fs = 32767;
        final int fi = 2147483647;
        long l = 9223372036854775807L;
        float f = 234.5F;
        double d = 123.4;
        boolean bool = true;
        char c = 'A';
        final char e = 'E';
        String str = "Hello";
        Object ob = 1;
        int in = 1;
        String n = "1";

        System.out.println(b+z);
        System.out.println(i+z);
        System.out.println(h);
        i+=s;
        System.out.println(i);
        for(int y = 0; y<10; y++) {
            System.out.print(c++ + " ");
            // System.out.print(e++ + " ");
            // System.out.print(ob++ + " ");
        }
        System.out.println();
        if(ob.equals(in)) {
            System.out.println(bool);
        }
    }
}
