import java.util.*;
public class Shoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, res = 0;;
		System.out.print("Enter the number of socks : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the sock's : ");
		for(int i = 0;i < n; i++) 
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for(int i = 0, count = 0; i <arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				count++;
			}else {
				if((count + 1)% 2 == 1)
					res++;
				count = 0;
			}
			if(i == arr.length - 2)
				if(count % 2 == 0 && count > 0)
					res++;
		}
		if(((arr.length > 1) && arr[arr.length - 1] !=arr[arr.length-2]) || arr.length == 1)
			res++;
		System.out.println("Total number of singular socks = " + res);
	}
}