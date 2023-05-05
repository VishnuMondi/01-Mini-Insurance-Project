package in.vishnu.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
//@Table(name="CITIZEN_PLANS_INFO")
public class CitizenPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenid;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate ;
	private LocalDate planEndDate;
	private Double benefitAmount;
	private String denialReason;
	private LocalDate terminationDate;
	private String terminationReason;
	

}
