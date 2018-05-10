package bubblesort;

public class Main {

	public static void main(String[] args) {

		int[] toSort = new int[] { 6, 2, 3, 5, 2, 0, 5, 1 };

		BubbleSort.sortTable(toSort);
		
			for (int item : toSort) 
				System.out.print(item + " ");

	}
}
