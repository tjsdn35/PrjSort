package sort;

import java.util.Arrays;

class Student implements Comparable {
	private  int sno;

	public Student(int sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + "]";
	}

	// Sort 를 위해서 Comparable interface 를 구현하면
	// 오름차순  this.sno - s.sno; 
	// 내림차순  s.sno - this.sno
	@Override
	public int compareTo(Object o) {
		Student  s = (Student) o;
		return this.sno - s.sno;
	}
	
	
}

public class TestClassArraySort {

	public static void main(String[] args) {
		Student  []  studArr = new Student [] {
				new Student(15), new Student(7), new Student(3),
				new Student(1), new Student(12), new Student(6)				
		};
		
		dispArr( studArr );
		Arrays.sort( studArr );
		dispArr( studArr );

	}

	private static void dispArr(Student[] studArr) {
		
		for (Student student : studArr) {
			System.out.print( student +  " ");
		}
		System.out.println();
	}

}





