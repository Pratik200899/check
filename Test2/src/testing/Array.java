package testing;

import java.util.ArrayList;
import java.util.Collections;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Find the maximum profit you can achieve. You may complete at most two transactions.
//
//Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
//
//Example 1:
//
//Input: prices = [3,3,5,0,0,3,1,4]
//Output: 6
//Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
//Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
//Example 2:
//
//Input: prices = [1,2,3,4,5]
//Output: 4
//Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple
//transactions at the same time. You must sell before buying again.
//java code


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		ArrayList<Integer> arr1=new ArrayList<Integer>();
	
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		int x=0;
		int p=0, temp;
		for(int i =0;i< arr.length;i++) {
			System.out.println("arr i "+arr[i]);
			for(int j=i+1;j< arr.length;j++) {
				
				if(arr[j]>arr[i]) {
					System.out.println("arr j "+arr[j]);
					temp= arr[j]-arr[i];
					//p=p+temp;
					list.add(temp);
					i=j;
					break;
				}
			}
		}
		Collections.sort(list);
		//System.out.println(list);
		int res= list.get(list.size()-1)+list.get(list.size()-2);
		System.out.println(res);
		
		

	}

}
