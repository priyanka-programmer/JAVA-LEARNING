package LinearSearch;

public class SearchInString {
    static void main(String[] args) {
        String st="PRIYANKA";
        char target='I';
        System.out.println(Search(st,target));
    }

    static boolean Search(String st,char target){
        if(st.length()==0){
            return false;
        }
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==target){
                return true;
            }
        }
        return false;

    }
}
