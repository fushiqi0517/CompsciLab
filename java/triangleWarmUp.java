public class triangleWarmUp {

    public static int triangle(int rows) {
        // Base case: if there are no rows, there are no blocks
        if (rows == 0) {
            return 0;
        }
        // Recursive case: the number of blocks in the current row plus the number of blocks in the previous rows
        return rows + triangle(rows - 1);
    }

    public static void main(String[] args) {
        System.out.println(triangle(0)); // 0
        System.out.println(triangle(1)); // 1 
        System.out.println(triangle(2)); // 3
        System.out.println(triangle(3)); // 6 
        System.out.println(triangle(4)); // 10
        System.out.println(triangle(5)); // 15
        System.out.println(triangle(6)); // 21
        System.out.println(triangle(7)); // 28  
    }
}