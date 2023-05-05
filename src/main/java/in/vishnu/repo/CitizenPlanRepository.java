package in.vishnu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.vishnu.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{

	

	@Query("select distinct(planName) from CitizenPlan")
	public List<String> getPlanName();
	
	@Query("select distinct(planStatus)from CitizenPlan")
	public List<String> getPlanStatus();
}
