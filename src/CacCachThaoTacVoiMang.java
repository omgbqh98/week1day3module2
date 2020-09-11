import java.util.Scanner;

public class CacCachThaoTacVoiMang {
    public static void main(String[] args) {
//        int matrix[][] = new int[5][5];
        int matrix[][]= {
                {4,3,5},
                {3,4,2},
                {7,3,9}
        };

//        nhập từ bàn phím mảng 1 chiều:

        //         Khai báo các biến, nhập và kiểm tra kích thước mảng :
        int size;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("input a size: ");
            size= scanner.nextInt();
            if(size>20){
                System.out.println("size vuot qua");
            }
        }while (size>20);
//       nhập giá trị cho các phần tử:
        array = new int[size];
        int i =0;
        while (i<array.length){
            System.out.println("input element " + (i+1)+ ": ");
            array[i] = scanner.nextInt();
            i++;
            System.out.printf("%-20s%s","Elements in array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }






//        nhạp mảng từ bàn phím mang 2 chieu:

//        java.util.Scanner input = new Scanner(System.in);
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }



        //nhap ngau nhien:
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }



//        in lần lượt từng phần tử trong mảng:
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.println();
//        }



//        tính tổng tất cả phần tử trong mảng:
//        int total = 0;
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                total += matrix[row][column];
//            }
//            System.out.println("tong phan tu trong mảng la:"+ total);
//        }



//        tính tổng từng cột:
//        for (int column = 0; column < matrix[0].length; column++) {
//            int total = 0;
//            for (int row = 0; row < matrix.length; row++)
//                total += matrix[row][column];
//            System.out.println("Sum for column " + column + " is "
//                    + total);
//        }




//       Tìm ra dòng có tổng các phần tử là lớn nhất:
//        int maxRow = 0;
//        int indexOfMaxRow = 0;
//// Get sum of the first row in maxRow
//        for (int column = 0; column < matrix[0].length; column++) {
//            maxRow += matrix[0][column];
//        }
//        for (int row = 1; row < matrix.length; row++) {
//            int totalOfThisRow = 0;
//            for (int column = 0; column < matrix[row].length; column++)
//                totalOfThisRow += matrix[row][column];
//            if (totalOfThisRow > maxRow) {
//                maxRow = totalOfThisRow;
//                indexOfMaxRow = row;
//            }
//        }
//        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);





//        Xáo trộn mảng:
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                int i1 = (int) (Math.random() * matrix.length);
//                int j1 = (int) (Math.random() * matrix[i].length);
//
//                // Swap matrix[i][j] with matrix[i1][j1]
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i1][j1];
//                matrix[i1][j1] = temp;
//            }
//        }
//        System.out.println(matrix);




//        tạo mảng 3 chiều:
//        double[][][] scores = new double[6][5][2];

        double[][][] scores = {
                {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
                {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
                {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
                {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
                {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
                {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}};

    }
}


