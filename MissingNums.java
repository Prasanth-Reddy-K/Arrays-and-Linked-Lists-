import java.util.*;
public class MissingNums {
    public static void main(String arg[]) {
        int[] arr = new int[100];
        int[] tem= new int[100];
        //int[] res= new int[50];
        int len=0;
        List<Integer> li= new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=  sc.nextInt();
        System.out.println("Enter the elements of array are : ");
        for(int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
            len= arr[i];
        }
        sc.close();
        //System.out.println(len+" ");
        for(int i=1;i<=len;i++) {
            tem[i-1]= i;
        }
        //for(int i=0;i<n;i++) {
        //    System.out.print(arr[i]+" ");
        //}
        int j=0;
         for(int i=0;i<len;i++) {
            if(arr[j]== tem[i]) {
                j++;
         } else {
            li.add(tem[i]);
         }
        }
         Iterator<Integer> it = li.iterator();
         while(it.hasNext()) {
            System.out.println(it.next());
          }
    }
}
