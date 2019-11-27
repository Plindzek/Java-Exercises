package arraysListCreateSortComparators;

import java.util.Comparator;

public class BoardGameComparator implements Comparator<BoardGame>{ 

    @Override
    public int compare(BoardGame o1, BoardGame o2) {
	
		int result = o1.getName().compareTo(o2.getName());
		this.reversed();		
		return -1*result; 
		
		//zamiana kolejno�ci sortowania na malej�co za pomoc� -1
		//ale juz tak nie robimy, bo jest dost�pna metoda reversed
	    }
    
    }


