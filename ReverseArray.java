import java.util.Scanner;
public class ReverseArray{
    public static void Reverse(int arr[])
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("The size of the array");
        int size = sc.nextInt();
        // Intalizing and the declearing the array
        int arr[] = new int[size];
        for (int i = 0; i<size ;i++)
        {
            arr[i] = sc.nextInt();
        }
        // logic of the reverse 
        Reverse(arr);
        
        for(int value: arr)
        {
            System.out.println(value + " \t ");
        }
    }
}