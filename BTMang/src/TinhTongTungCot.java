import java.util.Scanner;

public class TinhTongTungCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input row want caculate : ");
        int numberRow = scanner.nextInt();
        double[][] arr ={
                {3,5,6,8},
                {4,3,2,8},
                {2,5,3,9}
        };
        if(numberRow<0 && numberRow>arr.length-1 ){
            System.out.println("stt khong hop le ");
        }else {
            switch (numberRow){
                case 0:
                    for (int column = 0; column < arr[0].length; column++) {
                        int total = 0;
                        for (int row = 0; row < arr.length; row++)
                            total += arr[row][column];
                        System.out.println("Sum for column " + column + " is " + total);
                        break;
                    }
                case 1:
                    for (int column = 1; column < arr[0].length; column++) {
                        int total = 0;
                        for (int row = 0; row < arr.length; row++)
                            total += arr[row][column];
                        System.out.println("Sum for column " + column + " is " + total);
                        break;
                    }
                case 2:
                    for (int column = 2; column < arr[0].length; column++) {
                        int total = 0;
                        for (int row = 0; row < arr.length; row++)
                            total += arr[row][column];
                        System.out.println("Sum for column " + column + " is " + total);
                        break;
                    }
                case 3:
                    for (int column = 3; column < arr[0].length; column++) {
                        int total = 0;
                        for (int row = 0; row < arr.length; row++)
                            total += arr[row][column];
                        System.out.println("Sum for column " + column + " is " + total);
                        break;
                    }
            }
        }
    }
}
