package exercises.javaEx.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLst {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList <ArrayList<Integer>> dList = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            int dLength = scan.nextInt();
            ArrayList<Integer> d = new ArrayList<>(dLength);
            for (int j=0; j < dLength; j++)
            {
                d.add(scan.nextInt());
            }
            dList.add(d);
        }

        int q = scan.nextInt();
        for (int k = 0; k < q; k++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try{
               System.out.println(dList.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
              }
        }
        scan.close();
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
