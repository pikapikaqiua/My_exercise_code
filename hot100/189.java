//189. 轮转数组
//给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。

//示例 1:

//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右轮转 1 步: [7,1,2,3,4,5,6]
//向右轮转 2 步: [6,7,1,2,3,4,5]
//向右轮转 3 步: [5,6,7,1,2,3,4]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//1.case:注意本题没有保证 k 小于数组长度 n。由于轮转 n 次等于没有轮转，轮转 n+1 等于轮转 1 次，依此类推，轮转 k 次等于轮转 kmodn 次。
// 时间复杂度：O(n)，空间复杂度O(1)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;    //!!!!!!
        reverse(nums, 0, n - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, k - 1);
    }
    public void reverse(int [] nums, int i, int j){
        while(i < j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
//2.使用额外的数组。原数组下标为 i 的元素放至新数组下标为 (i+k)modn 的位置，最后将新数组拷贝至原数组即可
//时间复杂度：O(n)，空间复杂度O(n)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for(int i = 0; i < n; ++i)
        {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}