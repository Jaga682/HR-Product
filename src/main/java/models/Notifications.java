package models;

import jakarta.persistence.*;

@Entity
@Table(name = "notifications")
public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notificationId;
    private int userId;
    private String message;
    private String status;

    public Notifications() {

    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
