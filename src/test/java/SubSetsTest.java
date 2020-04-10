import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class SubSetsTest {

    List<String> strings = asList("Cat", "Dog", "Pig", "Mouse");

    SubSets subSets = new SubSets();

    @Test
    public void test1SizeOf1() {
        Set<Set<String>> result = subSets.subSetsOfSize(singletonList("Dog"), 1);

        Set<Set<String>> expected = new LinkedHashSet<>();
        expected.add(new HashSet<>(asList("Dog")));
        assertEquals(expected, result);
    }

    @Test
    public void test1Size() {
        Set<Set<String>> result = subSets.subSetsOfSize(strings, 1);

        Set<Set<String>> expected = new LinkedHashSet<>();
        expected.add(new HashSet<>(asList("Cat")));
        expected.add(new HashSet<>(asList("Dog")));
        expected.add(new HashSet<>(asList("Pig")));
        expected.add(new HashSet<>(asList("Mouse")));
        assertEquals(expected, result);
    }

    @Test
    public void test2Size() {
        Set<Set<String>> result = subSets.subSetsOfSize(strings, 2);

        Set<Set<String>> expected = new LinkedHashSet<>();
        expected.add(new HashSet<>(asList("Cat", "Dog")));
        expected.add(new HashSet<>(asList("Cat", "Pig")));
        expected.add(new HashSet<>(asList("Cat", "Mouse")));
        expected.add(new HashSet<>(asList("Dog", "Pig")));
        expected.add(new HashSet<>(asList("Dog", "Mouse")));
        expected.add(new HashSet<>(asList("Pig", "Mouse")));
        assertEquals(expected, result);
    }

    @Test
    public void test3Size() {
        Set<Set<String>> result = subSets.subSetsOfSize(strings, 3);

        Set<Set<String>> expected = new LinkedHashSet<>();
        expected.add(new HashSet<>(asList("Cat", "Dog", "Pig")));
        expected.add(new HashSet<>(asList("Cat", "Dog", "Mouse")));
        expected.add(new HashSet<>(asList("Cat", "Mouse", "Pig")));
        expected.add(new HashSet<>(asList("Pig", "Mouse", "Dog")));
        assertEquals(expected, result);
    }

}