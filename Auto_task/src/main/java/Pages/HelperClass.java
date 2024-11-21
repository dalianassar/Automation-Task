package Pages;

import java.util.Random;

public class HelperClass {
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(99999) + 1;
    }
}
