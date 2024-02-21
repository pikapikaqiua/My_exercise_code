//4.归并排序
//时间复杂度 O(nlogn)， 额外空间复杂度O(n)

import java.util.Arrays;

public class MergeSort {
    public static void MyMergeSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        MyProcess(arr, 0, arr.length - 1);
    }
    public static void MyProcess(int[] arr, int L, int R){
        if (L == R) {
            return;
        }
        int Mid = L + ((R - L) >> 1);
        MyProcess(arr, L, Mid);
        MyProcess(arr, Mid + 1, R);
        MyMerge(arr, L, Mid, R);
    }
    public static void MyMerge(int[] arr, int L, int Mid, int R){
        int[] ExtraArray = new int[R - L + 1];
        int p1 = L;
        int p2 = Mid + 1;
        int i = 0;
        while (p1 <= Mid && p2 <= R) {
            ExtraArray[i++] = arr[p1] >= arr[p2] ? arr[p2++] : arr[p1++];
        }
        while (p1 <= Mid) {
            ExtraArray[i++] = arr[p1++];
        }
        while (p2 <= R) {
            ExtraArray[i++] = arr[p2++];
        }
        for (int j = 0; j < ExtraArray.length; j++) {
            arr[j + L] = ExtraArray[j];
        }
    }

    //计数器For test 
    public static void main(String[] args) {
        int TestTimes = 500;
        int MaxSize = 100;
        int MaxValue = 100;
        boolean res = true;
        for (int i = 0; i < TestTimes; i++) {
            int[] arr1 = GenerateArray(MaxSize, MaxValue);
            int[] arr2 = CopyMyarry(arr1);
            MyMergeSort(arr1);
            Arrays.sort(arr2);
            if(!Arrays.equals(arr1, arr2)){
                res = false;
                break;
            }
            if(i == TestTimes - 1){
                System.out.println("==============================");
                System.out.println(arr1.length);
                PrintArray(arr1);
                System.out.println("==============================");
                System.out.println(arr2.length);
                PrintArray(arr2);
            }
        }
        System.out.println(res ? "NICE!" : "FUCKING!!!");
        
    }
    public static int[] GenerateArray(int MaxSize, int MaxValue){
        int[] arr = new int[(int)((Math.random()*MaxSize))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random()*(MaxSize + 1)));
        }
        return arr;
    }
    public static int[] CopyMyarry(int[] arr){
        int[] CopyArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            CopyArray[i] = arr[i];
        }
        return CopyArray;
    }
    public static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);

        }
    }
}
