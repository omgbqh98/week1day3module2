import java.util.Scanner;

public class THtimViTriCuaGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String students[] = {"huynh", "hoa", "khanh", "tien"};
        System.out.println("input name in students: ");
        String name = scanner.nextLine();

        boolean checkExist =false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)){
                System.out.println("ten ban vua nhap co trong list và vị trí :" + i);
                checkExist=true;
                break;
            }
        }
        if(!checkExist)
            System.out.println("ko có tu " + name + "trong list");
        }
    }

