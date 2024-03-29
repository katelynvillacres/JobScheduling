import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class FIFOJobScheduling{
    public static void schedule(ArrayList<Process> processes){
        Queue<Process> queue = new LinkedList<>(processes);
        runFIFO(queue);
    }

    public static void runFIFO(Queue<Process> queue){
        // At some point, I'd like to visualize the information. Consider the implementation of this
        int[] gantt = new int[queue.size()];
        int running_time = queue.peek().getArrivalTime(); // Set = to the first process that arrives
        while (!queue.isEmpty()){
            Process p = queue.remove();
            System.out.println("Process " + p.getProcessID() + " starts at t = " + running_time);
            // UPDATE GANTT DIAGRAM
            running_time += p.getBurstTime();
            System.out.println("Process " + p.getProcessID() + " terminates at t = " + running_time);


            // Step 1: Print when Process p starts
            System.out.println("Successfully removed " + p.getProcessID());
        }
    }




}