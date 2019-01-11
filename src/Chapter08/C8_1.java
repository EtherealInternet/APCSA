package Chapter08;

public class C8_1 {

    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        System.out.println(" \t\tSu \tM \tT \tW \tTh \tF \tSa \tTotal");
        for (int row = 0; row < hours.length; row++) {
            int total = 0;
            System.out.print("Employee" + row);
            for (int column = 0; column < hours[row].length; column++) {
                total = total + hours[row][column];
                System.out.print(" \t" + hours[row][column]);
            }
            System.out.println(" \t" + total);
        }
    }
}
