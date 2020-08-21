package org.edukar.school.service;

import org.edukar.school.dto.SchoolDto;
import org.edukar.school.entity.School;

public interface SchoolService {

	public School createSchoolRecord(SchoolDto dto);
	
	public School getSchoolRecord(Integer id);
}
