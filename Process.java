import java.util.*;

public class Process{
    String processID;
    int arrivalTime;
    int burstTime;
    int priority;
    int remainingBurstTime;
    int startTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;

    public Process(String processID, int arrivalTime, int burstTime){
        this.processID = processID;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
    
    public String getProcessID() { return this.processID; }
    public int getArrivalTime() { return this.arrivalTime; }
    public int getBurstTime() { return this.burstTime; }

    // Other getters will require computations; for now, we'll leave this blank

}