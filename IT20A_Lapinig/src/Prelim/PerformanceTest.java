
package Prelim;
import java.util.ArrayList;

public class PerformanceTest {
    public static void main(String[] args) {
        
       int n = 100000000;
       ArrayList <Integer> uncle = new ArrayList<>();
       
       long start = System.nanoTime();
       for(int i=0; i<n ; i++){
         uncle.add(i);
       }
       
      long end = System.nanoTime();
      System.out.print("tabang tanan: " + (end-start) + "mga iyaiyahon");
       
       
    }
    
}
