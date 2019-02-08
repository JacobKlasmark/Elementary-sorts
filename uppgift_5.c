


#include <stdio.h>

// Takes an array with integers and two integers.
// swaps the content of the place with array index the first number, with
// the content of the place with array index the second number
void swap (int ar[], int a, int b)
{
	int t = ar[a];
	ar[a] = ar[b];
	ar[b] = t;
}


// Takes an array with integers and seperates them so negative numbers are first.
// loop invariant: if there exists numbers to the left of "i" in the array, they have to be negative as long as there
// are negative numbers to the right of "i"
void seperate(int ar[], int size)
{
	int i = 0;
	int j = 1;
	int stop = 0;

	// Checks from the left if the number is positive, then checks from the right to find a negative number and swap these two
	while (i < (size - j))
	{
		stop = 1;
		if (ar[i] >= 0)
		{

			while (stop > 0)
			{
				if (ar[size - j] < 0)
				{
					swap(ar, i, (size - j));
					stop = 0;

				}
				j++;
			}
		}
		i++;
	}

}



int main(void)
{
	int ar[10] = { -1, 2, 6, 3, -6, 0, -2, -5, 8, 6 };
	//int ar[4] = { 1, 2, -3, 4 };
	int size = sizeof(ar)/sizeof(ar[0]);

	for (int i = 0; i < size; i++)
		printf("%d ", ar[i]);

	printf("\n");

	seperate(ar, size);

	for (int i = 0; i < size; i++)
		printf("%d ", ar[i]);


// OUTPUT
// -1 2 6 3 -6 0 -2 -5 8 6
// -1 -5 -2 -6 3 0 6 2 8 6

}