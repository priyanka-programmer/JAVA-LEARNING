package ArrayQus;

public class CountPositiveNegativeZero {
    static void main(String[] args) {
        int[]arr={-4,2,3,5,0,6,9,-2};
        Count(arr);
    }
    static void Count(int[]arr){
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            } else if (arr[i]<0) {
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
