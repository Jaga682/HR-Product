package models;


import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;
    private int processId;
    private String taskName;
    private String department;
    private int assignedTo;
    private String status;

    public Tasks() {

    }

    public Tasks(int processId, String taskName, String department, int assignedTo, String status) {
        this.processId = processId;
        this.taskName = taskName;
        this.department = department;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(int assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
