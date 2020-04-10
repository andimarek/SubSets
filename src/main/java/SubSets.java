import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SubSets {


    public void printSubSets(List<String> strings, int size) {
        Set<Set<String>> toPrint = subSetsOfSize(strings, size);
        toPrint.forEach(System.out::println);

    }

    Set<Set<String>> subSetsOfSize(List<String> strings, int size) {
        if (size == 1) {
            Set<Set<String>> result = new LinkedHashSet<>();
            for (String string : strings) {
                result.add(Collections.singleton(string));
            }
            return result;
        }
        Set<Set<String>> subSetsOfSize = subSetsOfSize(strings, size - 1);
        Set<Set<String>> result = new LinkedHashSet<>();

        for (Set<String> subSet : subSetsOfSize) {
            for (String string : strings) {
                if (!subSet.contains(string)) {
                    Set<String> newSubSet = new LinkedHashSet<>(subSet);
                    newSubSet.add(string);
                    result.add(newSubSet);
                }
            }
        }
        return result;
    }

}
