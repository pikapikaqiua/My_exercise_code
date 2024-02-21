
//1.选择排序
//时间复杂度 O(n*2)， 额外空间复杂度O(1)
import java.util.Arrays;

public class SelectionSort {
    public static void MySelectionSort(int[] arr) {
        if(arr == null || arr.length<2){
            return;
        }
        //遍历i~N-1，每次把最小值放在i位置
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            //i~N-1寻找最小值的下标
            for(int j = i + 1; j < arr.length; j++){             
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap1(arr, i, minIndex);
        }
    }

    public static void swap1(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    //异或交换两个不同地址的数
    public static void swap2(int[] arr, int a, int b) {
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
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
            MySelectionSort(arr1);
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
