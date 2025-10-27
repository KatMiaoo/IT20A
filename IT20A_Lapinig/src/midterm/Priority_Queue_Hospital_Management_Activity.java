
package midterm;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;
public class Priority_Queue_Hospital_Management_Activity {
    public static void main(String[] args) {
        Queue <String> patients = new LinkedList <String>();
        
        patients.offer("Anna (Severity: " + 3 + ")");
        patients.offer("Bob (Severity: " + 1 + ")");
        patients.offer("Carla (Severity: " + 2 + ")");
        patients.offer("Dave (Severity: " + 1 + ")");
        
        System.out.println("===Arrival Order===");
        System.out.println("Arrival Order: " + patients);
        
        System.out.println("===Treatment Order===");
        
        PriorityQueue <String> Treating = new PriorityQueue <>(Comparator.comparingInt(
                s-> Integer.parseInt(s.replaceAll("[^0-9]", ""))
        ));
        
        Treating.addAll(patients);
        
        System.out.println("\n===Treatment Order===");
        while(!patients.isEmpty()){
            System.out.println("Treating: " + patients.poll());
        }
        
    }
}
    
