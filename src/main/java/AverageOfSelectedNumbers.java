import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers{
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
        System.out.println("Should I print out the average of all positive numbers or the average of all the negative numbers? (n or p)");
        String input2 = scanner.nextLine();
            if (input2.equals("n")){
                double average = listArr.stream()
                        .mapToInt(value-> Integer.valueOf(value)).filter(number -> (number <0))
                        .average()
                        .getAsDouble();
                System.out.println("Average of the negative numbers: " + average);

            } else if (input2.equals("p")){
                double average = listArr.stream()
                        .mapToInt(value-> Integer.valueOf(value)).filter(number -> (number > 0))
                        .average()
                        .getAsDouble();
                System.out.println("Average of the positive numbers: " + average);
            }
        }


}