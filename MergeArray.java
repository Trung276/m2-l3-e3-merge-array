import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang 1: ");
        int sizeArray1 = scanner.nextInt();
        System.out.print("Nhap so phan tu mang 2: ");
        int sizeArray2 = scanner.nextInt();
        int [] array1 = new int [sizeArray1];
        int [] array2 = new int [sizeArray2];
        int [] array3 = new int[sizeArray1 + sizeArray2];
        System.out.println("Moi ban nhap mang 1");
        for (int i = 0; i < sizeArray1; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            array3[i] = array1[i];
        }
        System.out.print("Mang 1: ");
        for (int i = 0; i < sizeArray1; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n" + "Moi ban nhap mang 2");
        for (int i = 0; i < sizeArray2; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
            array3[sizeArray1 + i] = array2[i];
        }
        System.out.print("Mang 2: ");
        for (int i = 0; i < sizeArray2; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.print("\n" +"Ket qua gop mang: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
