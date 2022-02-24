class Program10
{
	public static void transpose(int[][] matrix)
	{
		int[][] answer = new int[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				answer[i][j] = matrix[j][i];
			}
		}
		for(int i=0;i<answer.length;i++)
		{
			for(int j=0;j<answer[0].length;j++)
			{
				System.out.print(answer[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		transpose(mat);
	}
}