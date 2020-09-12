import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {

        int arr[] = {3,5,7,0,0};
        System.out.println("truoc khi chen: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +"  ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int number = scanner.nextInt();
        System.out.println("input index: ");
        int index = scanner.nextInt();
       if(index<1 && index >=arr.length-1 ){
           System.out.println("khong chen dc");
       }else {
           for (int i = 0; i < arr.length; i++) {
               if(index==i){
                   arr[i+1]=arr[i];
                   arr[i]=number;

           }
           }
           System.out.println("sau khi chen:");
           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i]+ "  ");
           }
       }
    }

}
