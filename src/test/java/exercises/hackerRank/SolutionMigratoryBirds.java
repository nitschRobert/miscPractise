package exercises.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SolutionMigratoryBirds {

    public static int[] tempArray;

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
        // ?
        tempArray = Arrr;

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

    // Input Format
    //
    // The first line contains an integer denoting "n", the number of birds sighted and reported in the array "arr".
    //The second line describes "arr"  as "n"  space-separated integers representing the type numbers of each bird sighted.

    // Sample Input 1
    //            11
    //            1 2 3 4 5 4 3 2 1 3 4

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(arr);

        printArrr(arr);
        System.out.println(tempArray);

        Arrays.stream(SolutionMigratoryBirds.tempArray).forEach(System.out::println);

        System.out.println("Result = " + migratoryBirds(arr));

        //bufferedWriter.write(String.valueOf(migratoryBirds(arr)));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

}

