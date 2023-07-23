import java.io.*;
import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,sum=0,res=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                   
                }
                 if(sum<0) 
                     res++;
            }
        }
        System.out.print(res);
    }
}
