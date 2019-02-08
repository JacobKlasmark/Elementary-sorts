/*******************
 * A program that asks for a size and input to an int array and then sorts it.
 * 
 * 
 * 
 * @author Jacob Klasmark
 *
 */

public class Insertion_sort 
{
	//input: int array
	//sorts it from smallest to largest
	public static void sort (int[] a)
	{
		int N = a.length;
		for (int i = 1; i < N; i++)
		{
			for (int j= i; j > 0 && less(a[j], a[j-1]); j--)
				swap(a, j-1, j);
			show(a);
		}
	}
	
	//input: two int
	//returns true if the first one is smaller, otherwise returns false
	private static boolean less(int a, int b)
	{
		if (a < b)
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
	
	public static void main(String[] args)
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		//Asks for size of the array
		System.out.println("Define input size: ");
		int input_size = in.nextInt();
		
		// initiate the array of correct size
		int [] a = new int [input_size];
		
		// Asks for the input to the array
		System.out.println("Typ in the number sequence: ");
		for (int i = 0; i < input_size; i++)
			a[i] = in.nextInt();
		
		// sort the array
		sort(a);

		
		// OUTPUT
		/*Define input size: 
			6
			Typ in the number sequence: 
			1 2 4 3 5 0
			1 2 4 3 5 0 
			1 2 4 3 5 0 
			1 2 3 4 5 0 
			1 2 3 4 5 0 
			0 1 2 3 4 5 */
		
	}

}
