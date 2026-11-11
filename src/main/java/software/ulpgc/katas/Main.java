package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() {
        String s = "¡Viva España!";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println();
        System.out.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
        System.out.println(s.getBytes().length);
    }
}
