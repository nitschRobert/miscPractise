package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratingBirds {

    public static int migratoryBirds(List<Integer> arr) {
        int[] Arrr = new int[6];
        for (int i = 0; i < arr.size(); i++) {
            Arrr[arr.get(i)] = Arrr[arr.get(i)]+1;
        }
        int res = 0, max = 0;
        for (int j =0; j< Arrr.length; j++) {
            if (Arrr[j] > max) {
                max = Arrr[j];
                res = j;
            }
        }
        return res;
    }


    public static void printArrr(List<Integer> arr) {
        int[] Arrr = new int[6];
        for (int i = 0; i < arr.size(); i++) {
            Arrr[arr.get(i)] +=1;
        }
        for (int ar : Arrr) {
            System.out.print(ar + " "); }
        System.out.println();
    }

    /* Sample Input 1
               11
               1 2 3 4 5 4 3 2 1 3 4
    */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        printArrr(arr);

        System.out.println("Result = " + migratoryBirds(arr));

        bufferedReader.close();
    }
}
