package basic;

import java.util.Stack;

public class PostFixEvaluation
{
	public static void main(String[] args)
	{
		System.out.println(postFixEvaluation("55*5*5*"));
	}

	public static int postFixEvaluation(String S)
	{
		Stack<Short> values = new Stack<Short>();
		char op;
		short a, b;
		for (int i = 0; i < S.length(); i++)
		{
			if (S.charAt(i) >= '0' && S.charAt(i) <= '9')
			{
				values.push((short) (S.charAt(i) - '0'));
			} else
			{
				if (values.size() < 2)
				{
					return -1;
				}
				op = S.charAt(i);
				if (op != '+' && op != '*')
				{
					return -1;
				}
				b = values.pop();
				a = values.pop();
				short res;
				if (op == '+')
				{
					res = (short) (a + b);
				} else
				{
					res = (short) (a * b);
				}
				if (res >= 4096)
				{
					return -1;
				}
				values.push(res);
			}
		}

		if (values.size() == 1)
		{
			return values.pop();
		} else
		{
			return -1;
		}
	}

}
