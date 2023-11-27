package exercises.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLst_2 {

    public static void main(String[] args) {
        System.out.println("sample input");
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int d = in.nextInt();
            list.add(new ArrayList<Integer>());
            for(int j = 0; j < d; j++){
                /*Inside the inner scope, we parse each number of that line into the newly-created array:	*/
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
        int q = in.nextInt();
        for(int k = 0; k < q; k++){
            int x = in.nextInt();
            int y = in.nextInt();
                try {
                    System.out.println("\n" + list.get(x - 1).get(y - 1));
                    /* Remember to decrease the positions by 1 since the position always start at 0, not 1*/
                } catch (IndexOutOfBoundsException e) { /*You could use Exception e if you are unsure about the types of exceptions will be met*/
                    System.out.println("\n" + "ERROR!");
                }
        }
    }

    /*
    Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
     */

    /*
    Sample Output

74
52
37
ERROR!
ERROR!
     */
}
