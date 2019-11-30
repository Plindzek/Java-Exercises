package arraysListCreateSortComparators;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.net.httpserver.Filter;

import arraysListCreateSortComparators.BoardGame;

public class BoardGameFilter {

    public static void main(String[] args) {

	new BoardGameFilter().filterB();
	System.out.println(".......................");
	new BoardGameFilter().strumien();
    }

    void filterB() {
	for (BoardGame game : games) {

	    if (game.getMaxPlayers() > 0) {
		if (game.getRating() > 7) {
		    if (new BigDecimal(150).compareTo(game.getPrice()) > 0) {
			System.out.println(game.getName().toUpperCase());
		    }
		}
	    }
	}

    }

    void strumien() {
	games.stream().filter(g -> g.getMaxPlayers() > 4).filter(g -> g.getRating() > 8)
		.filter(g -> new BigDecimal(150).compareTo(g.getPrice()) > 0).map(g -> g.getName().toUpperCase())
		.forEach(System.out::println);

    }

    List<BoardGame> games = Arrays.asList(new BoardGame("Terraforming Mars", 9.38, new BigDecimal("123.49"), 1, 5),
	    new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
	    new BoardGame("Puerto Rico", 4.07, new BigDecimal("149.99"), 2, 5),
	    new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
	    new BoardGame("Scythe", 6.3, new BigDecimal("314.95"), 1, 5),
	    new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
	    new BoardGame("7 Wonders Duel", 4.15, new BigDecimal("109.95"), 2, 2),
	    new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
	    new BoardGame("Patchwork", 2.77, new BigDecimal("75"), 2, 2),
	    new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4));

}
