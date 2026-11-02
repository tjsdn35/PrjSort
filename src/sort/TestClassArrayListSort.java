package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class  Member {
	private  int  mno;

	public Member(int mno) {
		this.mno = mno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "Member [mno=" + mno + "]";
	}
	
}

public class TestClassArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<Member>  mList = new ArrayList<> (
			Arrays.asList(
			  new Member(22), new Member(13), new Member(7), 	
			  new Member(27), new Member(19), new Member(3) 	
			)
		);
		
		dispList(mList);
		/*
		Collections.sort( mList, new Comparator<Member>() {

			@Override
			public int compare(Member m1, Member m2) {				
				//return m1.getMno() - m2.getMno();
				return m2.getMno() - m1.getMno();
			}
		} );
		*/
		Collections.sort( mList, (m1, m2) -> m2.getMno() - m1.getMno() );
		dispList(mList);

	}

	private static void dispList(ArrayList<Member> mList) {

		for (Member member : mList) {
			System.out.print(member +  " " );
		}
		System.out.println();
		
	}

}











