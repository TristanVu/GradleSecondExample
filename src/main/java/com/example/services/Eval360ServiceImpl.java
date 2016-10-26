package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Eval_360;
import com.example.repo.Eval360Repository;

@Service("eval360Service")
@Transactional
public class Eval360ServiceImpl implements Eval360Service {

	@Autowired
	Eval360Repository eval360Repository;
	
	@Override
	public List<Eval_360> findEval360ByListName(List<String> evalNames) {		
		return eval360Repository.findEval360ByListName(evalNames);
	}

}
