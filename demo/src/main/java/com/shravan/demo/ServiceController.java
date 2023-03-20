package com.shravan.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.Sorter;
import com.mycompany.app.Bubblesort;
import com.mycompany.app.InsertionSort;
import com.mycompany.app.Merge;

@RestController
public class ServiceController{

	@RequestMapping("/Merge")
	public int[] service(){
		Sorter sorter = new Sorter();
		int temp[] = {10,9,8,7,6,5,4,3,2,1};

		return(sorter.Sort(temp,new Merge()));
	}
	@RequestMapping("/Bubblesort")
	public int[] Bubble(){
		Sorter sorter = new Sorter();
		int temp[] = {10,9,8,7,6,5,4,3,2,1};

		return(sorter.Sort(temp,new Bubblesort()));
	}
	@RequestMapping("/InsertionSort")
	public int[] Insert(){
		Sorter sorter = new Sorter();
		int temp[] = {10,9,8,7,6,5,4,3,2,1};

		return(sorter.Sort(temp,new InsertionSort()));
	}
}
