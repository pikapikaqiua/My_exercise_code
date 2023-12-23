
//2.冒泡排序
//时间复杂度 O(n*2)， 额外空间复杂度O(1)


public class BubbleSort {
    public static void Bubble(int[] arr) {
        if(arr == null || arr.length < 2)
        {
            return;
        }
        for(int i = 0; i < arr.length - 1; i++)                                                
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j+1] < arr[j])
                {
                    swap1(arr, j+1, j);
                }
            }
        }
    }

    public static void swap1(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,5,6,1,9,10,7,5,6,2,3,15,31};
        Bubble(arr1);
        System.out.println("数组长度:");
        System.out.println(arr1.length);

        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }
    }
}