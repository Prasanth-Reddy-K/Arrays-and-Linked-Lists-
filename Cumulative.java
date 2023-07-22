import java.util.*;
class Cumulative {
    public static void main(String arg[]) {
        int[] arr = new int[30];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=  sc.nextInt();
        System.out.println("Enter the elements of array are : ");
        for(int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        int pro= 1;
         for(int i=0;i<n;i++) {
            arr[i]= pro*arr[i];
            pro= arr[i];
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}