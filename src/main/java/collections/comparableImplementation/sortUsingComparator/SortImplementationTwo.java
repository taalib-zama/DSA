package collections.comparableImplementation.sortUsingComparator;

import java.util.Comparator;

public class SortImplementationTwo implements Comparator<String> {
    //compare method overridden
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
