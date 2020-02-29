package IntegerUtils;

public class IntegerUtils {

    public static int getRandomNumberFromZero(int max) {
        return (int)(Math.random() * (max + 1));
    }

    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
