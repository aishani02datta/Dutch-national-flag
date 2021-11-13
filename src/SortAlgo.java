import java.io.*;
import java.util.*;
public class SortAlgo {
    static void sort012(int a[],int n){
        n=a.length;
        int temp=0,low=0,mid=0;
        int high=n-1;
        while(mid<=high){
        switch(a[mid]){
            case 0: {
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            break;
            case 1:{
                mid++;
            }
            break;
            case 2: {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
            break;
        }
            }
        }
        static void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"");
        }
        }
        public static void main(String args[]) {
            int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
            int n = a.length;
            sort012(a, n);
            System.out.println("Sorted array is as follows:");
            printArray(a, n);
        }


    }
    
