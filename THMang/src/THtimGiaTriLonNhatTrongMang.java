import java.util.Scanner;

public class THtimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        double[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("input size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("ban nhap qua size toi da");

            }
        } while (size > 20);
        arr = new double[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("input element" + (i + 1) + ":");
            arr[i] = scanner.nextDouble();
            i++;
        }
        System.out.println("list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"\t");
        }
        double max = arr[0];
        int index =1;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>max){
                max = arr[j];
                index = j+1;
            }
        }
        System.out.println("so tien lon nhat la: " + max + "va vi tri trong list là: " +index);



    }
}
