package com.tongtong.cpp.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

public interface GenericRepositoryService <CT ,KT extends Serializable ,RT extends GenericRepository<CT, KT>>{
	
	List<CT> findAll();

	Page<CT> findAll(Pageable pageable);

	Page<CT> findAll(String searchTerm, Pageable pageable);

	Page<CT> findAll(Specification<CT> spec, Pageable pageable);

	List<CT> findAll(Specification<CT> spec);

	CT findOne(KT id);

	CT save(CT entity);

	List<CT> save(List<CT> entities);

	long count();

	long count(Specification<CT> spec);

	void delete(CT entity);

	void delete(KT id);

	void deleteAll();

	void deleteInBatch(List<CT> entities);

	CT saveAndFlush(CT entity);

	boolean exists(KT id);

	void executeQuery(String sqlString);

	CT findOneByPrimaryKeyValue(String fieldName, Object value);

	void executeNamedQuery(String sqlString);

	void executeNamedQuery(String sqlString, HashMap<String, String> map);
	
}
