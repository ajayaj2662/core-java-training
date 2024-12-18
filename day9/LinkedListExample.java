package com.day9;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args)
	{
		{
			//List<Integer> list = new ArrayList<>();    //To store only integer type value because the type is integer generic
			List<Object> list = new LinkedList<>();
			list.add(10);
			list.add(30);
			list.add(10);  
			list.add(40);
			
			/*
			list.add(1, 15);		// adding element (index, value)
			System.out.println(list); //To display the list
			System.out.println(list.get(3));    //it is used to see index of element
			System.out.println(list.remove(0)); //it is used to remove element in that index
			System.out.println(list.contains(10)); // it tells the list having 10 or not(true or false)
			System.out.println(list.size()); //size of the list
			System.out.println(list.isEmpty()); //it tells the list is empty or not(true or false
			*/
			
			//way -1
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
			
			//Here Generic is object 
			//way -2
			for(Object i : list)
			{
				System.out.println(i);
			}
			
			//way - 3
			Iterator<Object> it = list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}
	}
