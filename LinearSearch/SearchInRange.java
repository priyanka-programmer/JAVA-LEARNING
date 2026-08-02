package LinearSearch;

public class SearchInRange {
    static void main(String[] args) {
        int[]arr={18,12,-7,23,4,5,6,3,14,28,30};
        int target=3;
        System.out.println(SearchInRange(arr,target));
    }
    static int SearchInRange(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=1;i<5;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
