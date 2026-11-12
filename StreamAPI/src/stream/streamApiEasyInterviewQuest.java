package stream;

import java.util.*;
import java.util.stream.Collectors;

public class streamApiEasyInterviewQuest {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,2,8,2,3,5,9,3);
//        uniqueNum(num);
//        averageNumber(num);
//        sortNumberDesc(num);
//        specificLetter();
//        sepratedString();
//        positiveNum(num);
//        divisibleByThree(num);
//        flatterList();
//        nonEmpty();
        secondHighestNumber(num);
    }


    //Find all distinct elements from a list
    private static final void uniqueNum(List<Integer> val){
        //Approach : 1
        Set<Integer> set = new HashSet<>(val);
        System.out.println(set);
        //Approach : 2
        List<Integer> ans = val.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
    }

//Find the average of all numbers in a list
    private static final void averageNumber(List<Integer> val){
        System.out.println("Average Number");
        OptionalDouble ans = val.stream().mapToInt(Integer::intValue)
                .average();
        System.out.println(ans.getAsDouble());
    }
//Sort a list of integer in ascending and descending order using streams.
private static final void sortNumberDesc(List<Integer> val){
        List<Integer> ans = val.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println(ans);
    //Unique Number
    List<Integer> uniqu = ans.stream().distinct().toList();
    System.out.println(uniqu);
}
//Count how many strings start with a specific letter like("A")
private static final void specificLetter(){
    List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
    List<String> ans = fruits.stream().filter( x-> x.startsWith("A")).toList();
    System.out.println(ans);
}

//Join all strings in a list into a single comma-separated string
    private static final void sepratedString(){
        List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
        String fr = fruits.stream().filter( x-> x.endsWith("o")|| x.startsWith("B"))
                .collect(Collectors.joining(","));
        System.out.println(fr);
    }
//Check if all elements are positive numbers
    private static final void positiveNum(List<Integer> val){
           boolean ans = val.stream().allMatch(n -> n>0);
        System.out.println(ans);
    }
//Check if any number is divisible by 3
    private static final void divisibleByThree(List<Integer> val){
       boolean ans = val.stream().anyMatch( x->x%3==0);
        System.out.println(ans);
    }
//Flatten the list of list
    private static final void flatterList(){
        System.out.println("Flatter List");
        List<List<Integer>> listList = Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(5,6,7));

        List<Integer>ls = listList.stream().flatMap(List::stream).toList();
        System.out.println(ls);
    }
//Find the first non-empty string in a list
    private static final void nonEmpty()
    {
        List<String> fruits = Arrays.asList("","","","Apple","Banana","Avocado","Mango","Apricot");
        Optional<String> ans= fruits.stream()
                .filter(x->!x.isEmpty()).findFirst();
        System.out.println(ans.get());
    }
    //Find the second-highest number in a list using streams
    private static final void secondHighestNumber(List<Integer> val){

       Optional<Integer> ans = val.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(ans.get());

    }
}

