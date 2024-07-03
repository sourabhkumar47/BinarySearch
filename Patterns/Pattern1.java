public class Pattern1 {
    public static void main(String[] args) {
//        pattern1one(5);

        int rows = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }

    }

//                   *
//                  **
//                 ***
//                ****
//               *****

    static void pattern1one(int n) {
        for (int row = 0; row <n; row++) {
            int noofspacing = n-row;

            for (int spacing = 0; spacing < noofspacing; spacing++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//           *****
//            ****
//             ***
//              **
//               *

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            for (int spacing = 0; spacing < row; spacing++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 0; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int noOfColEachRow = row > n ? n - (row - n) : row;

            int noOfSpaces = n - noOfColEachRow;
            for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= noOfColEachRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int ItemInEachCol = row > n ? n - (row - n) : row;
            for (int col = 1; col <= ItemInEachCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
