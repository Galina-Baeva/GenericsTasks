package secondTask;

public class DemoGeneric {
    public static void main(String[] args) {
        GenericClass<String> firstString = new GenericClass<>("hello");
        GenericClass<String> secondString = new GenericClass<>("world");
        GenericClass<Integer> firstInt = new GenericClass<>(23);
        GenericClass<Integer> secondInt = new GenericClass<>(23);
        System.out.println(GenericClass.isEqual(firstString.getT(), secondString.getT()));
        System.out.println(GenericClass.isEqual(firstInt.getT(), secondInt.getT()));
    }
}
