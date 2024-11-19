import java.util.Scanner;
import java.util.Arrays;;

public class SecondLargest{
    public static int Second(int arr[])
    {
        int Largest = arr[0];
	int SecondLargest = arr[1];
	
	for(int i = 0; i<arr.length; i++)
	{
		if(arr[i] > Largest)
		{
			SecondLargest = Largest;
			Largest = arr[i];
		}
		else if(arr[i] > SecondLargest && arr[i] != Largest)
		{
			SecondLargest = arr[i];
		}
	
	}
	return SecondLargest;
}
        public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the array one by one");
        int arr[] = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        // function to find the second lowest element from the array  
        int Secondlarge = Second(arr);
        System.out.println("The second largest element is the: " + Secondlarge);
    }
}