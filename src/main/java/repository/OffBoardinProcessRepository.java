package repository;

import models.Employee;
import models.OffBoardingProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffBoardinProcessRepository extends JpaRepository<OffBoardingProcess,Integer> {

}
