import java.util.*;
import java.io.*;

/* 
 Dynamic Prog
 http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 */
 
class DP1{

public static void main(String[] args){

	BufferedReader reader = BufferedReader(InputStreamReader(System.in));
	String inputString = reader.readLine();
	int[] array = strToIntArray(inputString.split(" "));
	int result = maxProfit(array)

	System.out.println(result);
} 

public static int findWays(int[] array){

}

public static int[] strToIntArray(String[] str){
	int[] arr = new int[str.length];
	int i=0;
	for(String s: str){
		arr[i++] = String.parseInt(s);
	}
	return arr;
}
}

