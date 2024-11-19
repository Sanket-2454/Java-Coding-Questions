import java.util.Scanner;
public class SumOfArray{
	public static int sumOfArray(int arr[])
	{
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		System.out.println("Enter the array one by one:");
		int arr[] = new int[size];
		for(int i = 0; i< size; i++)
		{
			arr[i] = sc.nextInt();
		}

		int total = sumOfArray(arr);
		System.out.println("The sum of the array is the:" + total);
	}
}