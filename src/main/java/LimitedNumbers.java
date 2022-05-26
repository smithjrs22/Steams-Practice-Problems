import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main (String[] args){
        //make scanner
        Scanner scanner = new Scanner(System.in);
        //make array list
        ArrayList<Integer> numArr = new ArrayList<>();

        while (true){
            System.out.println("Enter a number");
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 0){
                break;
            }//end of if statement
            //add to the array
            numArr.add(num);
        }//end of while loop
        //print all input between 1 and 5
        numArr.stream()
                .filter(number -> (number >= 0) && (number <= 5))
                .forEach(number -> System.out.println(number));
    }
}
