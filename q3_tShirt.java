// There are 100 man making a circle each man is wearing a T-shirt with a number 1 to 100
// in series. Person with Number 1 on his/her T-Shirt got a gun now 1 kill 2 and give that
// gun to 3 and then 3 kill 4 and give that gun to 5.. then so on 99 killed 100 and give that
// gun again to 1.WAP to find which man is left with a gun on his hand at the end ??
import java.io.*;
import java.util.*;

class Main {

	public static void main (String[] args) {
		int man = 100;
	
		
		int[] arr = new int[man];
	
	
		for (int i = 0; i < man; i++) {
			arr[i] = i + 1;
		}
	
		
		int position = 0;
	
		
		while (arr.length > 1)
		{
		
		
			position++;
		
			position %= arr.length;
		
		
			int[] newArray = new int[arr.length - 1];
			System.arraycopy(arr, 0, newArray, 0, position);
			System.arraycopy(arr, position + 1, newArray, position,arr.length - position - 1);
			a = newArray;
		
		
		}
	
	    System.out.println("The man left with gun is:");
		System.out.print(arr[0]);
	}
}
