import java.util.ArrayList;

public class Remover {
	
	// 3 min
	
	
	
	/* Given a matrix, return an arrayList with all of the values of that matrix 
   in row-major order, except you should exclude num.
   
   EXAMPLE
   removeFunction(new int[][] {{5,3,1,4}, {4,4,1,4,6,3}, {1,3,4}}, 4)); -> 5,3,1,1,6,3,1,3
	removeFunction(new int[][] {{9,9,1,4}, {8,9,6,9,1,2}, {2,5,9}}, 9)); -> 1,4,8,6,1,2,2,5
	removeFunction(new int[][] {{4,3,8,1}, {5,1,1,7,6,1}, {1,5,3}}, 1)); -> 4,3,8,5,7,6,5,3

   */
	
	public static ArrayList<Integer> removeFunction(int[][] m, int num) {
		
      ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if (m[i][j] != num) {
					myList.add(m[i][j]);
				}
			}
		}
		return myList;
	}

	public static void main(String[] args) {
		
		System.out.println(removeFunction(new int[][] {{5,3,1,4}, {4,4,1,4,6,3}, {1,3,4}}, 4));//[5,3,1,1,6,3,1,3]
		System.out.println(removeFunction(new int[][] {{9,9,1,4}, {8,9,6,9,1,2}, {2,5,9}}, 9));//[1,4,8,6,1,2,2,5]
		System.out.println(removeFunction(new int[][] {{4,3,8,1}, {5,1,1,7,6,1}, {1,5,3}}, 1));//[4,3,8,5,7,6,5,3]
		System.out.println(removeFunction(new int[][] {{5,2,5,3}, {5,6,5,5,9,3}, {9,5,8}}, 5));//[2,3,6,9,3,9,8]
		System.out.println(removeFunction(new int[][] {{1,3,6,4}, {3,3,1,3,6,3}, {1,3,4}}, 3));//[1,6,4,1,6,1,4]
		System.out.println(removeFunction(new int[][] {{8,7,6,6}, {7,7,8,4,6,1}, {6,2,6}}, 6));//[8,7,7,7,8,4,1,2]
		System.out.println(removeFunction(new int[][] {{1,8,8,9}, {9,8,4,2,8,7}, {8,8,5}}, 8));//[1,9,9,4,2,7,5]
		System.out.println(removeFunction(new int[][] {{9,6,9,3}, {4,9,6,4,6,6}, {3,4,5}}, 6));//[9,6,9,3,4,6,5,3,4,5]
		
	}

}