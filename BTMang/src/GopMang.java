import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        System.out.println("input value arr1 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
            System.out.println("value " + (i+1) +": "+ arr1[i]);
        }
        System.out.println("input value arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
            System.out.println("value " + (i+1) +": " + arr2[i]);
        }
        int arr3[] = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i+arr1.length] = arr2[i];
            }
        }
        System.out.println("sau khi gop 2 arr: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+ "\t");
        }
    }
}
