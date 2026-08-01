package Functions;

public class SWAP {
    static void main(String[] args) {
        swap(5,3);

    }
    static void swap(int a,int b){
        int temp=a;
         a=b;
         b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
