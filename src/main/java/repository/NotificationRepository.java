package repository;

import models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.Notification;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notifications,Integer> {
    List<Notification> findByUserId(int userId);

}
