public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int []arr = {9,4,8,3,2,5,1};
       int index = minValue(arr);

        for (int i = 0; i < arr.length; i++) {
            index = i;
        } System.out.println("phan tu nho nhat trong mang: " +arr[index]);
    }

    static int minValue(int [] arr ) {
     return -1;

    }

}
