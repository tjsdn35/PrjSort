package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(34);
		list.add(28);
		list.add(16);
		
		dispList( list ); // 정렬되지 않은 부분출력
		
		list.add(7);
		list.add(28);
		dispList( list );
		
		// compAsc
		// Comparator 인터페이스를 이용하여 이름이 없는 클래스(익명 클래스)에 코딩을
		// 추가하여 인터페이스 new 할 수 있다
		// 익명 : Anonymous 이름없는
		// 람다식 사용적 익명클래스 사용법
		Comparator<Integer> compAsc = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		Comparator<Integer> compDesc = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		
		// 오름차순 정렬해서 출력
		Collections.sort(list, compAsc);
		dispList(list); // 오름차순정렬
		
		// 내림차순 정렬해서 출력
		Collections.sort(list, compDesc);
		dispList(list);
		
		//-------------------------------------
		// 문자열
		ArrayList<String> names = new ArrayList<>();
		names.add("이순신");
		names.add("김유신");
		names.add("강감찬");
		names.add("을지문덕");
		names.add("권율");
		
		dispName( names );
		
		//오름차순
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		} );
		dispName( names );
		
		//내림차순
		/*
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		*/
		/*
		Collections.sort(names,(o1, o2)-> {
			return o2.compareTo(o1);
		});
		*/
		Collections.sort(names,(o1, o2) -> o2.compareTo(o1) );
		dispName( names );

	}
	// 이름출력
	private static void dispName(ArrayList<String> names) {
		
		for (String string : names) {
			System.out.println(names + " ");
		}
		
	}

	private static void dispList(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
	}

}
//수업중