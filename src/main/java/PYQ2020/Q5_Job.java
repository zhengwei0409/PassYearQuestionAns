
package PYQ2020;

public class Q5_Job {
    private String job;
    private int numTask, memory;
    
    public Q5_Job(String job, int numTask, int memory) {
        this.job = job;
        this.numTask = numTask;
        this.memory = memory;
    }
    
    public String getJobName() {
        return job;
    }
    
    public int getNumberOfTask() {
        return numTask;
    }
    
    public int getMemory() {
        return memory;
    }
    
    @Override
    public String toString() {
        return "Name of the job : " + job + " Memory : " + memory + " GB Number of task : " + numTask;
    }
}
