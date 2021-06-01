package exphand;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwns {
    public static void main(String[] args) throws Exception {
        method();
    }

    public static void method() throws Exception {
        throw new ArithmeticException();
    }
}
