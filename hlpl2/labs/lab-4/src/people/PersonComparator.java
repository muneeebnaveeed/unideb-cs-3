package people;

import java.util.Comparator;
import java.util.Objects;

public class PersonComparator implements Comparator<PersonWithComparator> {
    @Override
    public int compare(PersonWithComparator o1, PersonWithComparator o2) {
        if (o1.age != o2.age)
            return Objects.compare(o1.age, o2.age, Comparator.reverseOrder());

        if (!Objects.equals(o1.name, o2.name))
            return Objects.compare(o1.name, o2.name, Comparator.naturalOrder());

        return Objects.compare(o1.id, o2.id, Comparator.naturalOrder());
    }
}