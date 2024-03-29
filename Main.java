import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String [] args){
        // read file and create process
        ArrayList<Process> processes = createProcesses();
       
        // Run FIFO algorithm
        FIFOJobScheduling.schedule(processes);
    }

    public static ArrayList<Process> createProcesses(){
        ArrayList<Process> processes = new ArrayList<>();
        String filename = "input3.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] split = line.split(" ");
                String processID = split[0];
                int arrivalTime = Integer.parseInt(split[1]);
                int burstTime = Integer.parseInt(split[2]);
                Process process = new Process(processID, arrivalTime, burstTime);
                processes.add(process);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Collections.sort(processes, new Comparator<Process>() {
            @Override
            public int compare(Process p1, Process p2) {
                return Integer.compare(p1.getArrivalTime(), p2.getArrivalTime());
            }
        });
        return processes;
    }
}