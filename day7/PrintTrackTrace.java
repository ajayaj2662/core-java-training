package com.day7;
import java.io.FileReader;
public class PrintTrackTrace
{
	public static void main(String[] args)
	{
			try
			{
				FileReader file1 = new FileReader("adsbc.txt");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}

