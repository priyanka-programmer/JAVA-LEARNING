package Functions;

public class PassbyValue {
    static void main(String[] args) {
        int a=5;
        int b=3;
        swap(5,3);
        System.out.println(a+" "+b+" ");
    }
    static void swap(int a,int b){
        int temp=a;
         a=b;
         b=temp;


    }

}
