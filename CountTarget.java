import java.util.Scanner;
import java.util.Arrays;
public class CountTarget{
	public static int Occurence(int arr[],int targetelement)
	{
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == targetelement)
			{
				count++;
			}
		}
        return count;	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.println("Enter the array one by one:");
		//  Intalizing and defining the array
		int arr[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		// target element 
		int targetelement = sc.nextInt();
		int target = Occurence(arr,targetelement);
		System.out.println("The count of the target Element is the:" + target);

	}
}