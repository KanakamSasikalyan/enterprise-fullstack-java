import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {

        //Stream<Integer> st1 = Stream.iterate(0, n->n+1);
        //Stream<Double> st2 = Stream.generate(Math::random);
        //st2.forEach(n -> System.out.println(n + "-->"));

        IntStream is = IntStream.rangeClosed(1, 5);
        is.forEach(n -> System.out.print(n+" "));

    }
}
