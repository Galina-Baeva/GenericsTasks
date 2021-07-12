package secondTask;

public class GenericClass<T> {
    protected T one;

    public GenericClass(T one) {
        this.one = one;
    }

    public T getOne() {
        return one;
    }

    public static <T extends Comparable<T>> boolean isEqual(T one, T two) {
        return one.compareTo(two) == 0;
    }

}
