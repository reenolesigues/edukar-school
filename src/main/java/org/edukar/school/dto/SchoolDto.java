package org.edukar.school.dto;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
public class SchoolDto {

	private String schoolName;
	
	private String district;
	
	private String division;
	
	private String region;

	@Override
	public String toString() {
		return "SchoolDto [schoolName=" + schoolName + ", district=" + district + ", division=" + division + ", region="
				+ region + "]";
	}
	
	
}
