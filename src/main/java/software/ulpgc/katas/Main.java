package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() {
        String a = "¡Viva España!";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(Arrays.toString(a.getBytes(StandardCharsets.ISO_8859_1)));
        System.out.println(a.getBytes(StandardCharsets.ISO_8859_1).length);
    }
}
