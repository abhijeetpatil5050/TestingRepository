package com.labdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExp {

	public static void main(String[] args) {
		

		List<String> pointList = new ArrayList<String>();
		pointList.add("1");
		pointList.add("2");
		pointList.forEach(o ->  {
		                            System.out.println(o);
		}
		                        
		                 );

		System.out.println("hello");
	}

}
