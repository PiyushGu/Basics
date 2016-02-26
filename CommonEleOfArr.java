package basic;

import java.util.HashSet;
import java.util.Set;

public class CommonEleOfArr
{

	public static void main(String[] args)
	{

		int[] A = { 5, 5 };
		int[] B = { 5, 1, 1, 6 };

		Set<Integer> eleSet = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++)
		{
			eleSet.add(A[i]);
		}
		int minValue = Integer.MIN_VALUE;
		for (int i = 0; i < B.length; i++)
		{
			if (eleSet.contains(B[i]))
			{
				if (minValue < B[i])
				{
					minValue = B[i];
				}
			}
		}

	}
}
