package generics;

class Data{
    private Object x;

    public Data(Object x) {
        this.x = x;
    }

    public Object getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Data{" +
                "x=" + x +
                '}';
    }
}

class Tata<T>{
    private T x;

    public Tata(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Tata{" +
                "x=" + x +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
//        Data data = new Data(7);
//        int var =(int) data.getX();

        Tata<Integer> tata = new Tata<>(6);
        System.out.println(tata.getX());
    }
}
