package arraysListCreateSortComparators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetExample {
    static Set<String> set = new HashSet<>();
    @Override
    public boolean equals(Object obj) {
        return (this==obj);
    }

    public static void main(String[] args) {
String dupa = new String("dupa");
        String dupa1 = new String("dupa");
        set.add(dupa);
        set.add(dupa1);
        set.add(new String("dupa"));
        set.add("dupa");
        set.add("duspa");
        System.out.println(set.toString());

        Iterator<String>iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    set.forEach(System.out::println);
    }
}
