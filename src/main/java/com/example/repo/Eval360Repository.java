package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Eval_360;

public interface Eval360Repository extends JpaRepository<Eval_360, Long> {

	@Query("SELECT e FROM Eval_360 AS e WHERE e.name IN :evalNames")
	public List<Eval_360> findEval360ByListName(@Param("evalNames") List<String> evalNames);
}
