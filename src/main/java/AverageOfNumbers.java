import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers{
    public static void main (String[] args){
        // We initialise the scanner and the list into which the input is read
        Scanner scanner = new Scanner(System.in);
        List<String> listArr = new ArrayList<>();

        // reading inputs
        while (true) {
            System.out.println("Enter an number:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            listArr.add(input);
        }


        // working out the average
        double average = listArr.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("Average of the numbers: " + average);

    }


}