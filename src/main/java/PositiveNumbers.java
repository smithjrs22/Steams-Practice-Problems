import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersArr = new ArrayList<>();
        for (int i = -5; i < 11; i++) {
            numbersArr.add(i);
        }
        System.out.println(PositiveNumbers.positive(numbersArr));
    }
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNum = numbers.stream()
                .filter(value -> (value>0))
                .collect(Collectors.toList());
        return positiveNum;
    }
}