package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {
    public static void main(String[] args) {
        System.out.println("Create Stream ");
        Stream<Integer> ans = createStream();
        //printEvenNum(ans);
        //suqareNumber(ans);
        //printSquareEvenNum(ans);
        //printFirstNumberGreaterthan10(ans);
//        printCountGreaterthan10(ans);
        printSum(ans);
    }
    //Create Stream
    private static Stream<Integer> createStream(){
        //Arrays to stream
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,16,12,14,13,15,11};
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

    //Filter stream
    private static void printEvenNum(Stream<Integer> val){
        System.out.println("Print Even Number ");
        List<Integer> ans = val.filter(x -> x%2==0).collect(Collectors.toList());
        for(Integer a : ans){
            System.out.print(a+" ");
        }
    }
    //Square stream
    private static void suqareNumber(Stream<Integer> val){

        System.out.println("Square Number");
        List<Integer> ans = val.map( x-> x*x).collect(Collectors.toList());
        for(Integer a : ans){
            System.out.print(a+" ");
        }
    }
    //Square Even Number
    private static void printSquareEvenNum(Stream<Integer> val){
        System.out.println("Square Even Number");
        List<Integer> ans = val.filter(x->x%2==0).map(x->x*x).toList();
        for(Integer a : ans){
            System.out.print(a+" ");
        }
    }
    private static void printFirstNumberGreaterthan10(Stream<Integer> val){
        System.out.println("First Number Greaterthan 10");
        Optional<Integer> ans = val.filter(x->x>10).sorted().findFirst();
        System.out.println("Ans "+ans.get());
    }

    private static void printCountGreaterthan10(Stream<Integer> val){
        System.out.println("Count Number Greaterthan 10");
        Long ans = val.filter(x->x>10).count();
        System.out.println("Ans "+ans);
    }

    private static void printSum(Stream<Integer> val){
        System.out.println("Sum of Number");
        Integer ans = val.reduce(0,(a,b) -> a+b);
        System.out.println("Ans "+ans);
    }

}
