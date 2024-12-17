package com.day8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FileCopy {
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("D://notepad.txt");
		FileWriter fw = new FileWriter("D://notepad2.txt");
		int ch;
		while((ch=fr.read()) != -1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}
