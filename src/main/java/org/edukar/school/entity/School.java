package org.edukar.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "SCHOOL", schema = "edukar_school")
@Getter
@Setter
@ToString
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqGen")
	@SequenceGenerator(name = "SeqGen", sequenceName = "edukar_school.school_id_sequence")
	private Integer id;
	
	private String schoolName;
	
	private String district;
	
	private String division;
	
	private String region;
}
