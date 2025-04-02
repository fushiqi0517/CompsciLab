import java.util.*; 
import java.io.*;   
import static java.lang.System.*; 

public class Base
{
	// No instance variables are needed

    public static ArrayList<Integer> generateFibonacci(int limit) {
        ArrayList<Integer> fibList = new ArrayList<>();
        fibList.add(1); 
        fibList.add(2); 

        int nextFib;
        while (true) {
            nextFib = fibList.get(fibList.size() - 1) + fibList.get(fibList.size() - 2);
            if (nextFib > limit) break;
            fibList.add(nextFib);
        }
        return fibList;
    }

    public static void main(String[] args) throws IOException
    {
        // Print out your name
        out.println("Helen Zhou");

        Scanner input = new Scanner(new File("base.dat")); // reads in the base.dat file

        int datasets = input.nextInt();

        ArrayList<Integer> fibList = generateFibonacci(1000);

        for (int i = 0; i < datasets; i++) {
            int N = input.nextInt();
            out.print("f(" + N + ") = ");

            if (fibList.contains(N)) {
                out.println(N);
                continue;
            }

            ArrayList<Integer> result = new ArrayList<>();
            for (int j = fibList.size() - 1; j >= 0; j--) {
                if (fibList.get(j) <= N) {
                    result.add(fibList.get(j));
                    N -= fibList.get(j);
                }
                if (N == 0) break;
            }

            for (int k = 0; k < result.size(); k++) {
                if (k > 0) out.print(" + ");
                out.print(result.get(k));
            }
            out.println();
        }

        input.close();
     }
} // end of class Base
