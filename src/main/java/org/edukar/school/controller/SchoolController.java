package org.edukar.school.controller;

import org.edukar.school.dto.SchoolDto;
import org.edukar.school.entity.School;
import org.edukar.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/school")
@Slf4j
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public School createSchoolRecord(@RequestBody SchoolDto schoolDto) {
		return schoolService.createSchoolRecord(schoolDto);
	}
	
	@GetMapping(path = "/{id}")
	public School readSchoolRecord(@PathVariable(name = "id") Integer id) {
		return schoolService.getSchoolRecord(id);
	}
}
