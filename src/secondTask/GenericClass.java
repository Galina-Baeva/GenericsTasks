package secondTask;

public class GenericClass<T> {
    protected T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static <T extends Comparable<T>> boolean isEqual(T t1, T t2) {
        return t1.compareTo(t2) == 0;
    }

}
