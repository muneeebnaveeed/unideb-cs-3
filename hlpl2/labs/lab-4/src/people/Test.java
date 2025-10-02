package people;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    private static final int MAX_RECORDS = 125;
    private static final String DELIMITER = ";";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ComparablePerson[] persons = new ComparablePerson[MAX_RECORDS]; // scenario 1 (with comparable)
        // PersonWithComparator[] persons = new PersonWithComparator[MAX_RECORDS]; // scenario 2 (with comparator)

        int personCount = 0;

        while (true) {
            String line = scanner.nextLine();

            if (Objects.equals(line, "END"))
                break;

            String[] tokens = line.split(DELIMITER);

            if (tokens.length == 3) {
                String id = tokens[0];
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                persons[personCount++] = new ComparablePerson(id, name, age);
                // persons[personCount++] = new PersonWithComparator(id, name, age);
            } else {
                String id = tokens[0];
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String neptune = tokens[3];
                String program = tokens[4];
                persons[personCount++] = new Student(id, name, age, neptune, program);
            }
        }

        Arrays.sort(persons, 0, personCount);
        // Arrays.sort(persons, 0, personCount, new PersonComparator());

        for (int i = 0; i < personCount; i++) {
            System.out.println(persons[i]);
        }
    }
}
