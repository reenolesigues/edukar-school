package org.edukar.school.service.impl;

import java.util.Optional;

import org.edukar.school.dto.SchoolDto;
import org.edukar.school.dto.mapper.SchoolMapper;
import org.edukar.school.entity.School;
import org.edukar.school.repository.SchoolRepository;
import org.edukar.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SchoolServiceImpl implements SchoolService{

	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	public School createSchoolRecord(SchoolDto dto) {
		return schoolRepository.save(SchoolMapper.schoolDtoToSchool(dto));
	}

	@Override
	public School getSchoolRecord(Integer id) {
		Optional<School> s = schoolRepository.findById(id);
		if(s.isEmpty())
			return null;
		return s.get();
	}

}