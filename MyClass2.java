import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyClass2 {
    public static void main(String[] args) {
        Predicate<Integer> pr = x -> x>100000;
        System.out.println(pr.test(100000000));


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 ==0).mapToInt(n -> n).sum();
        System.out.println(sum);          // addition of all even numbers in the Arrays.asList


        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        for(Integer i : numbers1){
            if(isEven.test(i)){
                System.out.print(i+" ");
            }
        }


        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(startsWithLetterV.test("Vipul"));


        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';
        System.out.println(endsWithLetterL.test("Vipul"));


        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("Vipul"));


        Predicate<String> or = startsWithLetterV.or(endsWithLetterL);
        System.out.println(or.test("Vivek"));


        System.out.println(startsWithLetterV.negate().test("Vipul"));


        Predicate<Object> predicate = Predicate.isEqual("Vipul");
        System.out.println(predicate.test("Vipul"));
    }
}
