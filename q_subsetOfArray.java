// Given two arrays[2,8,7,3,5] and [2,3,1,0,2] find which number is not present in second
// array.


import java.util.*;

class Main
{
static boolean subset_arrays(int arr1[], int arr2[],
int m, int n)
{
int i = 0;
int j = 0;
for (i = 0; i < n; i++)
{
for (j = 0; j < m; j++)
{
if(arr2[i] == arr1[j])
break;
}

if (j == m)
return false;
}

return true;
}

public static void main (String[] args)
{
int m,n,i;
int arr1[] = new int[10];
int arr2[] = new int[10];
Scanner sc = new Scanner(System.in);
System.out.print(“Enter the size of array 1 : “);
m = sc.nextInt();
System.out.print(“Enter the size of array 2 : “);
n = sc.nextInt();
System.out.print(“Input the array 1 elements : “);
for(i=0;i<n;i++)
{
arr1[i] = sc.nextInt();
}
System.out.print(“Input the array 2 elements : “);
for(i=0;i<m;i++)
{
arr2[i] = sc.nextInt();
}

if(subset_arrays(arr1,arr2,n,m))
System.out.print(“\n This following numbers are present in Second array”, arr2[n]);
else
System.out.print(“\n Number is not present \n”);
}
}