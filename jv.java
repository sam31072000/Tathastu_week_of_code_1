import java.io.*;
import java.util.*;
import java.util.Scanner.*;

public class reversearray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] A = new int[100];
		int start = 0,temp;
		int end = number-1;
		for(int i=0;i<number;i++){
			A[i]=sc.nextInt();
		}
		 while (start < end)
        {
            temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
		for(int i=0;i<number;i++){
			System.out.println(A[i]);
		}
	}
}
