import java.util.Arrays;
import java.util.Scanner;

public class FactorsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
         factorsSort(A);
        System.out.println(Arrays.toString(A));
    }
    public static void factorsSort(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length-1;j++)
            {
                if(countFactor(A[j]) > countFactor(A[j+1]))
                {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

    }
    public static int countFactor(int num)
    {
        int count = 0;
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                count++;
        }
        return count;
    }
}
/*
Factors Sort
You are given an array A of N elements.
Sort the given array in increasing order of number of distinct factors of each element,
i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.
Note: You cannot use any extra space

Input 1:
A = [6, 8, 9]
Input 2:
A = [2, 4, 7]
Output 1:
[9, 6, 8]
Output 2:
[2, 7, 4]
 */
