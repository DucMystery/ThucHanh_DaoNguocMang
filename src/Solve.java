import java.util.Arrays;
import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myArray[] ={1,2,3,4,5,6,7,8,9};
        daoNguocMang(myArray);


    }

    public static void daoNguocMang(int arr[]){
        for (int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] =temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
