package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "eval_360")
@Entity
public class Eval_360 {
	
	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "account_id")
	private long accountId;
	
	@Column(name = "candidate_id")
	private long candidateId;
	
	@Column(name = "candidate_assessment_id")
	private long candidateAssessmentId;
	
	
}
