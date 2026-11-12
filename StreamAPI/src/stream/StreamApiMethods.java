package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiMethods {
    public static void main(String[] args) {

    }
    //Create Stream
    private static Stream createStream(){
        //Arrays to stream
        Integer[] arr = {1,2,3,4,5};
        String[] stringArr = {"abs","abc","abd"};
        Stream<Integer> val = Stream.of(arr);
        //String to stream
        Stream<String> val1 = Arrays.stream(stringArr);
        //List to stream
        List<Integer> arrList = Arrays.asList(2,3,4,5,6,7);
        Stream<Integer> val2 = arrList.stream();
        //stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(6);
        return val;
    }
}
