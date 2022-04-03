package com.simplilearn;
import java.util.StringTokenizer;

public class StringTokenizer_example {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer ("Hello World, how are you?","");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			}

}
}
