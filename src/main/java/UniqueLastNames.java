import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String quit = "quit";
            if(scanner.hasNextLine()){quit = scanner.nextLine();}

            if (quit.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstName = "";
            if(scanner.hasNextLine()){firstName = scanner.nextLine();}
            System.out.print("Input last name: ");
            String lastName = "";
            if(scanner.hasNextLine()){lastName = scanner.nextLine();}
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if(scanner.hasNextLine()){birthYear = Integer.valueOf(scanner.nextLine());}

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

        System.out.println("Last names in alphabetical order: ");
        persons.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}