package arraysListCreateSortComparators;

import java.math.BigDecimal;

public class BoardGame  implements Comparable<BoardGame>{
    private String name;
    private double rating;
    private BigDecimal price;
    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) {
	super();
	this.name = name;
	this.rating = rating;
	this.price = price;
	this.minPlayers = minPlayers;
	this.maxPlayers = maxPlayers;
    }

    public String getName() {
	return name;
    }

    public double getRating() {
	return rating;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public int getMinPlayers() {
	return minPlayers;
    }

    public int getMaxPlayers() {
	return maxPlayers;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setRating(double rating) {
	this.rating = rating;
    }

    public void setPrice(BigDecimal price) {
	this.price = price;
    }

    public void setMinPlayers(int minPlayers) {
	this.minPlayers = minPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
	this.maxPlayers = maxPlayers;
    }

    /*
     * ponizej metoda z interfejsu. Dodana obs³uga sortowania po nazwie za pomoc¹
     * compareTo z klasy String/Bigdecimal i  zwraca int mniejszy od
     * zera(numerycznie/alfabetycznie this<o), równy 0(numerycznie/alfabetycznie
     * this=o) lub wiekszy(numerycznie/alfabetycznie this>o)
     */
    @Override
    public int compareTo(BoardGame o) {
	int result = this.name.compareTo(o.name);
	
	if (result == 0) {
	   result = this.price.compareTo(o.price);
	   if (result==0) {
	       return this.maxPlayers - o.maxPlayers;
	   }
	}
	return result;
    }

    @Override
    public String toString() {
	return "BoardGame [name=" + name + ", rating=" + rating + ", price=" + price + ", minPlayers=" + minPlayers
		+ ", maxPlayers=" + maxPlayers + "]";
    }

}
