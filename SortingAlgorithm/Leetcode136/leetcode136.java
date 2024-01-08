/*
 * 136. 只出现一次的数字  
简单

给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。

关键：异或性质：  1.0^N=N , N^N=0

                2.满足交换律和结合律

                3.同一批数异或结果相同


260. 只出现一次的数字 III

中等

给你一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。

你必须设计并实现线性时间复杂度的算法且仅使用常量额外空间来解决此问题。

关键：异或思路和提取某一个数二进制下最右侧的1

 */

public class leetcode136 {
    
    public static int Leetcode136_single(int[] arrs) {
        int single = 0;
        for(int i = 0; i < arrs.length; i++)
        {
            single ^= arrs[i];
        }
        return single;
    }
    
    
    public static void main(String[] args) {
        int[] arr1 = {3,2,2,6,1,7,5,7,5,6,2,3,2,8,8,10,10};
        System.out.println(Leetcode136_single(arr1));

    }
}


