package LinearSearch;

public class LinearSearch {
    static void main(String[] args) {
        int[] nums = {23, 43, 54, 675, -2, -4};
        int target=34;
        int ans=linearSearch(nums, target);
        System.out.println(ans);
    }
//Search in the array:return the index if item found
    // otherwise if the item not found return -1
    static int linearSearch(int[] nums,int target) {
        //if array is empty
        if (nums.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
