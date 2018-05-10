package bubblesort;

public class BubbleSort {

	public static void sortTable(int[] t) {
		int length = t.length - 1;
		do {
			for (int i = 0; i < length; i++) {
				if (t[i] > t[i + 1]) {
					int container = t[i];
					t[i] = t[i + 1];
					t[i + 1] = container;
				}
			}
			length--;
		} while (length > 1);
	}
}
