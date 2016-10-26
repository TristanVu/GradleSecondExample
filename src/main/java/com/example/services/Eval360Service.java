package com.example.services;

import java.util.List;

import com.example.entities.Eval_360;

public interface Eval360Service {
	public List<Eval_360> findEval360ByListName(List<String> evalNames);
}
