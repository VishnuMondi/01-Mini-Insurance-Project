package in.vishnu.runner;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.vishnu.entity.CitizenPlan;
import in.vishnu.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository repo;
	
	public void run(ApplicationArguments orgs) throws Exception {
        repo.deleteAll();
		// Cash Plan
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Swaraj");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmount(5000.00);

		// Cash Plan
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Satya Sri");
		c2.setGender("Fe-Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setDenialReason("Have a BMW Car");

		// Cash Plan
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("VenuGopal");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmount(5000.00);
		c3.setTerminationDate(LocalDate.now());
		c3.setTerminationReason("Ragging anEmployment");

		// Food Plan
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Prasad");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmount(6000.00);

		// Food Plan
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Priya");
		c5.setGender("Fe-Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setDenialReason("Property Income");

		// Food Plan
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Balaram");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmount(6000.00);
		c6.setTerminationDate(LocalDate.now());
		c6.setTerminationReason("Employee");

		//Medical Plan
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Vikas");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmount(7000.00);

		//Medical Plan
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Sanju");
		c8.setGender("Fe-Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setDenialReason("Data InCorrect");

		//Medical Plan
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Bhanu");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmount(7000.00);
		c9.setTerminationDate(LocalDate.now());
		c9.setTerminationReason("Late Paid");

		// EmploymentPlan
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Avinash");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmount(8000.00);

		// EmploymentPlan
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Siri");
		c11.setGender("Fe-Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setPlanStartDate(LocalDate.now());
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setDenialReason("Aadhar Not valid");

		// EmploymentPlan
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Eshwar");
		c12.setGender("Male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmount(8000.00);
		c12.setTerminationDate(LocalDate.now());
		c12.setTerminationReason("Govt Jib");
		
		List<CitizenPlan> list = Arrays.asList(c1,  c2, c3,  c4,  c5,  c6,  c7,  c8,  c9,  c10 , c11,  c12);
		
		
        repo.saveAll(list);
	}
}
