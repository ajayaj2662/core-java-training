package com.day8;
import java.util.StringTokenizer;
public class StringTokenizerEx {
	public static void main(String[] args)
	{
		String s ="Welcome to java world";
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
