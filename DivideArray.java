//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class DivideArray {
    public static void main(String[] args) {
        int[] arr=getuserinput_array();
        int[] arr1 = {arr[0], getRandomElement(arr), arr[arr.length - 1]};
        int[] arr2 = {arr[1], getRandomElement(arr), arr[arr.length - 2]};
        int[] arr3 = {arr[2], getRandomElement(arr), arr[arr.length - 3]};
        printArray(arr1, "arr1");
        printArray(arr2, "arr2");
        printArray(arr3, "arr3");
    }
    private static int[] getuserinput_array(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element into the array :");
        for(int i=0;i<size;i++){
            System.out.print("Element"+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        return  arr;
    }
    private static int getRandomElement(int[] arr) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);
        return arr[randomIndex];
    }
    private static void printArray(int[] arr, String label) {
        System.out.print(label + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
/*output
Let consider a array with size 9.
Enter the size of the array :9
Enter the element into the array :
Element1 :5
Element2 :9
Element3 :3
Element4 :5
Element5 :7
Element6 :2
Element7 :1
Element8 :12
Element9 :4
arr1: [5, 9, 4]
arr2: [9, 2, 12]
arr3: [3, 7, 1]
middle element of every sub array is random element from the parent array elements.*/
