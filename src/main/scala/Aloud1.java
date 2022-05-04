import java.util.ArrayList;
import java.util.List;

public class Aloud1 {
    //    private  static List<Integer> readAloud(List<Integer> xs){
//        List<Integer> answer = new ArrayList<>();
//        int count=1;
//        int prev_elt = xs.get(0);
//        for(int i=1;i<xs.size();i++){
//            if (prev_elt == xs.get(i)){
//                count += 1;
//            }
//            else{
//                answer.add(count);
//                answer.add(prev_elt);
//                prev_elt=xs.get(i);
//                count=1;
//            }
//            if(i == xs.size()-1){
//                answer.add(count);
//                answer.add(prev_elt);
//                prev_elt=xs.get(i);
//                count=1;
//            }
//
//        }
//        return answer;
//    }
    public static List<Integer> readAloud(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        if (source.isEmpty()) { // early kill
            return result;
        }

        result.add(1); // adding the count for the first element in the source list
        return readAloud(source, result, 1);
    }

    private static List<Integer> readAloud(List<Integer> source, List<Integer> result, int pos) {
        if (pos == source.size()) { // base case
            result.add(source.get(pos - 1)); // adding the last value from the source list
            return result;
        }
        // recursive case
        int currentInd = result.size() - 1;

        if (source.get(pos - 1).equals(source.get(pos))) {
            result.set(currentInd, result.get(currentInd) + 1); // incrementing the count
        } else {
            result.add(source.get(pos - 1)); // adding the previous value
            result.add(1); // adding the count for a new value
        }
        return readAloud(source, result, pos + 1);
    }
//    public static List<Integer> readAloud1 (List<Integer> xs,List<Integer> answer, int ind){
//        if(ind == xs.size()) return answer;
//        if(ind == 0 || !answer.get(answer.size() - 1).equals(xs.get(ind))) {
//            answer.add(1);
//            answer.add(xs.get(ind));
//        }
//        else{
//            answer.set(answer.size() - 2, answer.get(answer.size() - 2) + 1);
//        }
//         return readAloud(xs ,answer,ind + 1);
//    }

    public static void main(String[] args) {
        System.out.println(readAloud(List.of(3, 3, 1, 1, 3, 1, 1)));
        System.out.println(readAloud(List.of(1, 1, 1, 180, 180)));
    }

//    public static void main(String[] args) {
//        List<Integer> a=new ArrayList<>();
//        a.add(3);
//        a.add(3);
//        a.add(8);
////        a.add(10);
////        a.add(10);
////        a.add(10);
//        System.out.println(a);
//        System.out.println(readAloud(a));
//    }
}
