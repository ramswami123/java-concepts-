import java.util.*;

public class MapCollection {
    public static void main(String[] args) {
      
      Map<String , Integer> mp = new HashMap<>();
      mp.put("Reena",20012003);
      mp.put("Charan",5082002);
      mp.put("Geeta",18092002);
      
      System.out.print(mp);
      
      //output 
      //creates  unordered map
      // {charan=5082002, Reena=20012003, geeta=18092002}
      
      TreeMap<String, Integer>mp1 = new TreeMap<>();
      mp1.put("Reena",20012003);
      mp1.put("Charan",5082002);
      mp1.put("Geeta",18092002);
      
      System.out.print(mp1);
      
      
      //output 
      //creates  ordered map
      //{Charan=5082002, Geeta=18092002, Reena=20012003}
      
      
  }
}
