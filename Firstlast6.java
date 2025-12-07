package srujan;
import java.util.Scanner;
public class Firstlast6 {
	public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6};  // you can change this array

        if (arr.length >= 1 && (arr[0] == 6 || arr[arr.length - 1] == 6)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
