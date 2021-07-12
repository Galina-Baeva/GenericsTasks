package firstTask;

public class DemoPair {
    public static void main(String[] args) {
        Pair<Integer, String> firstPair = new Pair<>(12, "july");
        System.out.println(firstPair.getFirst() + " " + firstPair.getSecond());
    }
}
