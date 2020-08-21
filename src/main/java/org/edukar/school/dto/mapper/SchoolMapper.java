package org.edukar.school.dto.mapper;

import org.edukar.school.dto.SchoolDto;
import org.edukar.school.entity.School;
import org.modelmapper.ModelMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SchoolMapper {

	public static School schoolDtoToSchool(SchoolDto schoolDto) {
		ModelMapper mapper = new ModelMapper();
		School s = mapper.map(schoolDto, School.class);
		log.info(s.toString());
		return s;
	}
}
