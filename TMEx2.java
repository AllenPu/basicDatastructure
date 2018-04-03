import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


public class TMEx2 {
    public static void main(String[] args){
        TreeMap<String,Double> students = new TreeMap<String,Double>(new Reverse());
        
        students.put("Franksson,Frank",3.85);
        students.put("Mattsson,Matt",3.95);
        students.put("Hanksson,Hank",4.00);
        students.put("Jamesson,James",3.85);
        
        System.out.println(students);
        
        students = new TreeMap<String,Double>(new Length());
        
        students.put("Moe",3.85);
        students.put("Gary",3.95);
        students.put("Jenkins",4.00);
        students.put("Smittymanjensen",3.85);
        
        System.out.println(students);
    }
    
    static class Reverse implements Comparator<String>{
        public int compare(String s1, String s2){
            return s1.compareTo(s2)*-1; //Multiply standard result by -1.
        }
    }
    static class Length implements Comparator<String>{
        public int compare(String s1, String s2){
            int l1=s1.length();
            int l2=s2.length();
            if(l1==l2){
                return s1.compareTo(s2);    //If words are the same length, order is based on alphabetical order.
            }
            return l1-l2;   //Will be negaitve if s1 is longer, positive if s2 is longer.
        }
    }
}
