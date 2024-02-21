//3.选择排序
//时间复杂度 O(n*2)， 额外空间复杂度O(1), 性能好于冒泡和简单选择排序

import java.util.Arrays;

public class InsertionSort {
    public static void MyInsertionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        // 0~i上有序
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                MySwap(arr, j, j - 1);
            }
        }
    }
    public static void MySwap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
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
            MyInsertionSort(arr1);
            Arrays.sort(arr2);
            if(!Arrays.equals(arr1, arr2)){
                res = false;
                break;
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
