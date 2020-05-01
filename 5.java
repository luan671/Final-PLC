private final int n = 3;

private void withGoto(int[][] x)
{
	int i;
	int j;
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (x[i][j] != 0)
			{
				goto reject;
			}
		}
		System.out.printf("First all zero row is: %d", i);
		break;
reject:
		;
	}
}

private void withOutGoto(int[][] x)
{
	boolean flag = false;
	int i;
	int j;
	for (i = 0; i < n; i++)
	{
		int colCounter = 0;
		for (j = 0; j < n; j++)
		{
			if (x[i][j] == 0)
			{
				colCounter++;
			}
		}
		if (flag == false && colCounter == n)
		{
			System.out.printf("First all zero row is: %d", i);
			flag = true;
		}
	}
}

private static int Main()
{
	int[][] x =
	{
		{0, 1, 2},
		{0, 0, 0},
		{8, 9, 10}
	};
	withOutGoto(x);
	return 0;
}
