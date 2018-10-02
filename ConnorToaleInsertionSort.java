public class ConnorToaleInsertionSort

{

public static void main(String a[])

{

int[] arr={5,2,6,3,9,4,7,10,8,1}; //Length can be changed freely

System.out.println("Pre-sorted array: ");

for(int i:arr)

{

System.out.print(i+" ");

}

int[] arr_sort=InsertionSort(arr); //calls method to sort the array

System.out.println("\nSorted array: ");

for(int i:arr_sort)

{

System.out.print(i+" ");

}

}

public static int[] InsertionSort(int[] arr) //method to sort the array

{

int value;

for (int i=1;i< arr.length; i++)

{

for(int j=i;j>0;j--)

{

if(arr[j]<arr[j-1])

{

value=arr[j];

arr[j]=arr[j-1];

arr[j-1]=value;

}

}

}

return arr; //returns sorted array after method is called

}

}