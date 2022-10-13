package BT1_BT2;

import java.util.Scanner;

public class ThuatToanXapXep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ban muon co bao nhieu phan tu trong mang:");
        int arrLong=Integer.parseInt(scanner.nextLine());
        int[] arrInt=new int[arrLong];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("Nhap gia tri cua phan tu thu %d ",i+1);
            arrInt[i]=Integer.parseInt(scanner.nextLine());
        }
        insertionSort(arrInt);

        System.out.println("Mang sau khi sap xep la:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("\t"+arrInt[i]);
        }
    }
    public static void insertionSort(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[j]<list[i]){
                    int temp=list[j];
                    list[j]=list[i];
                    list[i]=temp;
                }
            }
        }
    }
}
