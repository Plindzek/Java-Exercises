package arraysListCreateSortComparators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetExample {
    static Set<String> set = new HashSet<>();

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    public static void main(String[] args) {
        String dupa = "dupa";
        String dupa1 = "dupa";
        set.add(dupa);
        set.add(dupa1);
        set.add("dupa");
        set.add("dupa");
        set.add("duspa");

        //will have only two object because Set dont keep duplicates

        System.out.println(set.toString());
        System.out.println("...........");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("...........");
        set.forEach(System.out::println);
    }
}
