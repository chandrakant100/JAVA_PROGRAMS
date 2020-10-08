import java.util.*;

class spriralTraverse {

	static List<Integer> spiralTraversal(int [][]arr, int n, int m) {
		int startC = 0, endC = m - 1, startR = 0, endR = n - 1;
		ArrayList<Integer> list = new ArrayList<>();
		boolean [][]visited = new boolean[n][m];
		while (startC <= endC && startR <= endR) {
			for (int i = startC; i <= endC; i++) {
				if (visited[startR][i])
					continue;
				list.add(arr[startR][i]);
				visited[startR][i] = true;
			}
			for (int i = startR + 1; i <= endR; i++) {
				if (visited[i][endC])
					continue;
				list.add(arr[i][endC]);
				visited[i][endC] = true;
			}
			for (int i = endC - 1; i >= startC; i--) {
				if (visited[endR][i])
					continue;
				list.add(arr[endR][i]);
				visited[endR][i] = true;
			}
			for (int i = endR - 1; i > startR; i--) {
				if (visited[i][startC])
					continue;
				list.add(arr[i][startC]);
				visited[i][startC] = true;
			}
			startC++;
			startR++;
			endC--;
			endR--;
		}
		return list;
	}

	static void spiralFill(int [][]arr, int n, int m) {
		int startC = 0, endC = m - 1, startR = 0, endR = n - 1, c = 1;
		boolean [][]visited = new boolean[n][m];
		while (startC <= endC && startR <= endR) {
			for (int i = startC; i <= endC; i++) {
				if (visited[startR][i])
					continue;
				arr[startR][i] = c++;
				visited[startR][i] = true;
			}
			for (int i = startR + 1; i <= endR; i++) {
				if (visited[i][endC])
					continue;
				arr[i][endC] = c++;
				visited[i][endC] = true;
			}
			for (int i = endC - 1; i >= startC; i--) {
				if (visited[endR][i])
					continue;
				arr[endR][i] = c++;
				visited[endR][i] = true;
			}
			for (int i = endR - 1; i > startR; i--) {
				if (visited[i][startC])
					continue;
				arr[i][startC] = c++;
				visited[i][startC] = true;
			}
			startC++;
			startR++;
			endC--;
			endR--;
		}
		for (int []j : arr) {
			for (int i : j)
				System.out.print(i + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 3, m = 5;
		int [][]arr = new int[n][m];
		spiralFill(arr, n, m);
		System.out.println(spiralTraversal(arr, n, m));
	}
}