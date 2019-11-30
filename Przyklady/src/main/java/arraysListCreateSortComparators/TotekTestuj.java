package arraysListCreateSortComparators;
import java.util.Arrays;

public class TotekTestuj{
	public static void main(String[] args) {
		int[] wyniki; 
		wyniki = Totek.losuj(50,50);
		Arrays.sort(wyniki);
		System.out.println(Arrays.toString(wyniki));
		
	}}