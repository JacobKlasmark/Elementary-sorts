/**************
 * A program that asks for a size and input to an int array and then sorts it.
 * 
 * 
 * @author Jacob Klasmark
 *
 */

public class Insertion_sort4
{
	//input: int array
	//sorts it from smallest to largest
	public static void sort (int[] a)
	{
		int N = a.length;
		int swaps = 0;
		for (int i = 1; i < N; i++)
		{
			for (int j= i; j > 0 && less(a[j], a[j-1]); j--)
			{
				swap(a, j-1, j); 
				swaps++;
				//System.out.println(swaps);
			}
			System.out.print("[swaps: " + swaps + "]   ");
			show(a);
			
		}
	}
	
	//input: two int
	//returns true if the first one is smaller, otherwise returns false
	private static boolean less(int a, int b)
	{
		if (a > b)
			return true;
		else
			return false;
	}
	
	//input: int array and two int
	//swap places between the two integers in the array
	private static void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	//input: int array
	// prints out the array
	private static void show(int[] a)
	{
		String s = "";
		for (int i = 0; i < a.length; i++)
		{
			s = s + a[i] + " ";
		}
		System.out.println(s);
	}
	
	private static void inversion(int[] a)
	{
		int inversions = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					inversions = inversions + 1;
					System.out.print("[" + i + "," + a[i] + "], [" + j + "," + a[j] + "] | ");
				}
			}
		}
		System.out.println();
		System.out.println("Total number of inversion: " + inversions);
	}
	
	public static void main(String[] args)
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//Asks for size of the array
		System.out.println("Define input size: ");
		
		// initiate the array of correct size
		int input_size = in.nextInt();
		int [] a = new int [input_size];
		
		// Asks for the input to the array
		System.out.println("Typ in the number sequence: ");
		for (int i = 0; i < input_size; i++)
			a[i] = in.nextInt();
		
		//inversions
		inversion(a);
		
		// sort the array
		sort(a);
		
		// OUTPUT
		/*
		Define input size: 
			6
			Typ in the number sequence: 
			1 2 4 3 5 0
			[0,1], [5,0] | [1,2], [5,0] | [2,4], [3,3] | [2,4], [5,0] | [3,3], [5,0] | [4,5], [5,0] | 
			Total number of inversion: 6
			[swaps: 1]   2 1 4 3 5 0 
			[swaps: 3]   4 2 1 3 5 0 
			[swaps: 5]   4 3 2 1 5 0 
			[swaps: 9]   5 4 3 2 1 0 
			[swaps: 9]   5 4 3 2 1 0 */
		
	}

}