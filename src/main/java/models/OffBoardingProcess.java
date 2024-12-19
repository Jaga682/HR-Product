package models;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "offboarding_processes")
public class OffBoardingProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int processId;

    private int employeeId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;

    public OffBoardingProcess() {

    }

    public OffBoardingProcess(int processId, int employeeId, LocalDateTime startDate, LocalDateTime endDate, String status) {
        this.processId = processId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
