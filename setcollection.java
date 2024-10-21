import java.util.*;

public class setcollection {
    public static void main(String[] args) {
      //genrates unordered set 
      Set<Integer>s = new HashSet<Integer>();
      
      s.add(1);s.add(2);s.add(19);s.add(65);s.add(-19);
      
      System.out.println(s);
      // output:[1, 65, 2, -19, 19]
      
      //genrates sorted set 
      Set<Integer>st = new TreeSet<Integer>();
      st.add(1);st.add(2);st.add(19);st.add(65);st.add(-19);
      System.out.println(st);
      //[-19, 1, 2, 19, 65]
  }
}
