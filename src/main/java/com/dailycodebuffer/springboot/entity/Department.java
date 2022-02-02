package com.dailycodebuffer.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DEPARTMENT")
@Builder
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long departmentid;
	@NotBlank(message = "Please add department name")
	@Length(max = 5,min = 1)
	@Size(max=10,min=0)
	private String departmentName;
	@NotBlank(message = "Provide department Address")
	private String departmentAddress;
	@NotBlank(message = "Provide department Code")
	private String departmentCode;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long departmentid,
			@NotBlank(message = "Please add department name") @Length(max = 5, min = 1) @Size(max = 10, min = 0) String departmentName,
			@NotBlank(message = "Provide department Address") String departmentAddress,
			@NotBlank(message = "Provide department Code") String departmentCode) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [departmentid=");
		builder.append(departmentid);
		builder.append(", departmentName=");
		builder.append(departmentName);
		builder.append(", departmentAddress=");
		builder.append(departmentAddress);
		builder.append(", departmentCode=");
		builder.append(departmentCode);
		builder.append("]");
		return builder.toString();
	}
	
	

}