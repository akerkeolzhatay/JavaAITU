import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person>T = new ArrayList<>();
        T.add(new Employee("John","Lennon","Manager",27045.78));
        T.add(new Employee("George", "Harrison", "Developer", 50000.00));
        T.add(new Student("Ringo", "Starr", 2.5));
        T.add(new Student("Paul", "McCartney", 3.0));
        Collections.sort(T);
        printData(T);

    }

    public static void printData(Iterable<Person> T) {
        T.forEach(person ->
                System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge ")
        );
    }
}
