import com.google.common.base.Joiner;
import java.util.Arrays;

public class HelloOtus {
    public static void main(String[] args) {
        String[] words = {"Hello", "world!"};
        // Класс Joiner из Guava
        String result = Joiner.on(" ").join(Arrays.asList(words));

        System.out.println(result);
    }
}
