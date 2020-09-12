import java.util.Scanner;
public class XoaPhanTuTrongMang {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = {10, 4, 6, 7, 8, 6, 5, 20, 50, 88, 45, 14, 7878};
//        System.out.println("Before:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println();
//        System.out.println("Enter a number: ");
//        int x = scanner.nextInt();
//        for (int j = 0; j <= arr.length - 1; j++) {
//            if (x == arr[j]) {
//                int index = j;
//                System.out.println("vi tri: " + index);
//                for (int k = index; k <= arr.length - 1; k++) {
//                    if (index == arr.length - 1) {
//                        arr[index] = 0;
//                    } else {
//                        arr[index] = arr[index + 1];
//                        arr[index + 1] = 0;
//                        index++;
//                    }
//                }
//            }
//        }
//        System.out.println("After:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//    }
//}



    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int number = scanner.nextInt();
        int index = del(array,number);
        for (int i = index; i <array.length-1 ; i++) {
            array[i] = array[i + 1];
        } array[array.length - 1] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i]+ ", ");
        }
    }
    public static int del(int[]arr,int number){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                index = i;
            }
        }
        return index;
    }
}