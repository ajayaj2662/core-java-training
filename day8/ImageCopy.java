package com.day8;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopy 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fr = new FileInputStream("D://Dog.jpg");
		FileOutputStream fw = new FileOutputStream("D://Dog2.jpg");
		int ch;
		while((ch=fr.read()) != -1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}
