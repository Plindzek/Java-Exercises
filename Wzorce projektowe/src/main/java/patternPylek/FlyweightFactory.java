package patternPylek;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * W metodzie createRelation sprawdzamy, czy obiekt o podanym opisie już istnieje. 
 * Jeśli nie, to tworzymy ten obiekt i wyświetlamy komunikat użytkownikowi. 
 * W przeciwnym wypadku pobieramy obiekt z tym parametrem (w naszym przypadku z HashMapy).
 */

public class FlyweightFactory {
    private Map<String, Relation> relations = Collections.synchronizedMap(new HashMap());

    public synchronized Relation createRelation(String description) {
	Relation relation = (Relation) relations.get(description);
	if (relation == null) {
	    relation = new Relation(description);
	    relations.put(description, relation);
	    System.out.println("Creating new relation: " + relation.getDescription());
	}
	return relation;
    }
}