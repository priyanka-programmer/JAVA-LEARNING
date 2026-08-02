package LinearSearch;

public class FindMin {
    static void main(String[] args) {
        int[]arr={18,12,-7,23,4,5,6,3,14,28,30};
        System.out.println(SearchMin(arr));
    }
    static int SearchMin(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
