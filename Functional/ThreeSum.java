import java.util.*;
public class ThreeSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        //sorting the array-bubble sort
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //sliding window
        for(int i=0;i<arr.length-2;i++) {
            int fix=arr[i];
            int left=i+1,right=arr.length-1;
            while(left<right) {
                if(fix+arr[left]+arr[right]==0) {
                    System.out.print(fix);
                    System.out.print(arr[left]);
                    System.out.println(arr[right]);
                    break;
                }
                //System.out.println();
                else if(fix+arr[left]+arr[right]<0)
                    left++;
                else
                    right--;
            }
        }

    }

}
