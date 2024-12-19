package service;


import models.Employee;
import models.Notifications;
import models.OffBoardingProcess;
import models.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import repository.NotificationRepository;
import repository.OffBoardinProcessRepository;
import repository.TasksRepository;

import javax.management.Notification;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OffBoardinServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private OffBoardinProcessRepository processRepository;

    @Autowired
    private TasksRepository taskRepository;

    @Autowired
    private NotificationRepository notificationRepository;

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Start the offboarding process
    public OffBoardingProcess startOffboarding(int employeeId) {
        OffBoardingProcess process = new OffBoardingProcess();
        process.setEmployeeId(employeeId);
        process.setStartDate(LocalDateTime.now());
        process.setStatus("Pending");
        return processRepository.save(process);
    }

    // Get tasks by offboarding process ID
    public List<Tasks> getTasksByProcessId(int processId) {
        return taskRepository.findByProcessId(processId);
    }

    // Add task
    public Tasks addTask(int processId, String taskName, String department, int assignedTo) {
        Tasks task = new Tasks();
        task.setProcessId(processId);
        task.setTaskName(taskName);
        task.setDepartment(department);
        task.setAssignedTo(assignedTo);
        task.setStatus("Pending");
        taskRepository.save(task);
        return task;
    }

    // Add notification
    public Notifications addNotification(int userId, String message) {
        Notifications notification = new Notifications();
        notification.setUserId(userId);
        notification.setMessage(message);
        notification.setStatus("Unread");
        return notificationRepository.save(notification);
    }
}
