import java.util.ArrayList;
import java.util.List;

public class Aloud1 {
    private  static List<Integer> readAloud(List<Integer> xs){
        List<Integer> answer = new ArrayList<>();
        int count=1;
        int prev_elt = xs.get(0);
        for(int i=1;i<xs.size();i++){
            if (prev_elt == xs.get(i)){
                count += 1;
            }
            else{
                answer.add(count);
                answer.add(prev_elt);
                prev_elt=xs.get(i);
                count=1;
            }
            if(i == xs.size()-1){
                answer.add(count);
                answer.add(prev_elt);
                prev_elt=xs.get(i);
                count=1;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(3);
        a.add(8);
//        a.add(10);
//        a.add(10);
//        a.add(10);
        System.out.println(a);
        System.out.println(readAloud(a));
    }
}
