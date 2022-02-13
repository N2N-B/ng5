package completejava;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingDescendingOrder {
	public static void main(String[] args) {
		Integer array[] = {23,45,46,27,28};
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

}
