
//1.选择排序
//时间复杂度 O(n*2)， 额外空间复杂度O(1)

public class SelectionSort {
    public static void SelectionSortSelf(int[] arr) {
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
        int[] arr1 = {3,2,5,6,1,9,10,7,5,6,2,3,15,31};
        System.out.println("数组长度:");
        System.out.println(arr1.length);
        SelectionSortSelf(arr1);
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
