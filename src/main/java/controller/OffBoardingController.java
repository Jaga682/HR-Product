package controller;


import models.Employee;
import models.Notifications;
import models.OffBoardingProcess;
import models.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.OffBoardinServices;

import java.util.List;

@RestController
@RequestMapping("/api/offboarding")
public class OffBoardingController {

    @Autowired
    private OffBoardinServices offboardingService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return offboardingService.getAllEmployees();
    }

    @PostMapping("/start/{employeeId}")
    public OffBoardingProcess startOffboarding(@PathVariable int employeeId) {
        return offboardingService.startOffboarding(employeeId);
    }

    @GetMapping("/tasks/{processId}")
    public List<Tasks> getTasks(@PathVariable int processId) {
        return offboardingService.getTasksByProcessId(processId);
    }

    @PostMapping("/task/{processId}")
    public Tasks addTask(@PathVariable int processId, @RequestBody Tasks task) {
        return offboardingService.addTask(processId, task.getTaskName(), task.getDepartment(), task.getAssignedTo());
    }

    @PostMapping("/notification")
    public Notifications addNotification(@RequestBody Notifications notification) {
        return offboardingService.addNotification(notification.getUserId(), notification.getMessage());
    }
}
