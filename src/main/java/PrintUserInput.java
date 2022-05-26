import java.util.ArrayList;
import java.util.Scanner;

public class PrintUserInput {
    public static void main (String[] args){
        //make scanner
        Scanner scanner = new Scanner(System.in);
        //make array list
        ArrayList<String> stringsArr = new ArrayList<>();

        while (true){
            System.out.println("Enter a word");
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            //add user input
            stringsArr.add(input);
        } //end of while loop
        //print all user input
        stringsArr.stream().forEach(line -> System.out.println(line));
    }

}
