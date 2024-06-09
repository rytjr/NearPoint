package NearPoint;

import java.util.*;

public class NearPoint {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 =  sc.nextInt();
		
		int t = Math.abs(num);
		int t1 = Math.abs(num2);
		
		int sum = num*num4 + num2;
		int sum2 = num3*num4;
		
		if(sum <= sum2) {
			if(num <= num3) {
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
		}
		else {
			System.out.print(0);
		}
		
	}
}