package sort;

import java.util.Arrays;
import java.util.Collections;

public class TestArraySort {

	public static void main(String[] args) {
		//int [] arr1 = new int[] {1,5,3,2,4};
		int [] arr1 = {1,5,3,2,4};
		System.out.println(arr1); // [I@6b95977
		System.out.println(Arrays.toString(arr1));
		
		// Stream 문법
		Arrays.sort( arr1 );
		System.out.println(Arrays.toString(arr1));
		arr1 = Arrays.stream(arr1)
				.boxed()
				.sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
				
		System.out.println(Arrays.toString(arr1));
		
		// 람다식은 class 대상으로만 가능
		// Arrays.sort( arr1, (a, b) -> { return b-a; } ); // 에러
		Integer [] arr2 = {1,5,3,2,4};
		Arrays.sort( arr2, (a, b) -> { return b-a; } );
		System.out.println(Arrays.toString(arr2));
		
		String [] names = {"라나","사나","가나","하나"};
		System.out.println(Arrays.toString(names));
		Arrays.sort( names, (a, b) -> b.compareTo(a) );
		System.out.println(Arrays.toString(names));
		
	}

}
