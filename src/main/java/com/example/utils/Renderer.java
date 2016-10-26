package com.example.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entities.Eval_360;
import com.example.services.Eval360Service;

@Component
public final class Renderer {
	
	@Autowired
	private Eval360Service eval360Service;
	
	public void printOutEval360(List<String> evalNames) {		
		List<Eval_360> evallst = eval360Service.findEval360ByListName(evalNames);
		if (evallst != null) {
			for (Eval_360 eval : evallst) {			    
				System.out.println("Candidate Assessment id of  " + eval.getName() + " : " + eval.getCandidateAssessmentId());
			}
		}
		
	}
}
