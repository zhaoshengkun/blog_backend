package com.tongtong.cpp.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.id.IdentifierGenerationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Lock;


public abstract class GenericRepositoryServiceImpl<CT, KT extends Serializable,RT extends GenericRepository<CT,KT>> 
implements GenericRepositoryService<CT, KT, RT>{

	private static final Logger LOGGER = LoggerFactory.getLogger(GenericRepositoryServiceImpl.class);
	
	@Autowired
	private GenericRepository<CT, KT> repository;
	
	
	@Override
	public List<CT> findAll() {
		LOGGER.debug("findAll");
		return repository.findAll();
	}

	@Override
	// @Transactional(readOnly = true)
	public Page<CT> findAll(Pageable pageable) {
		LOGGER.debug("findAll");
		return repository.findAll(pageable);
	}

	@Override
	// @Transactional(readOnly = true)
	public Page<CT> findAll(String searchTerm, Pageable pageable) {
		return null;
	}

	@Override
	// @Transactional(readOnly = true)
	public Page<CT> findAll(Specification<CT> spec, Pageable pageable) {
		LOGGER.debug("findAll->Specification:{}, Pageable:{}", spec, pageable);
		return repository.findAll(spec, pageable);
	}

	@Override
	// @Transactional(readOnly = true)
	public List<CT> findAll(Specification<CT> spec) {
		LOGGER.debug("findAll->Specification:{}", spec);
		return repository.findAll(spec);
	}

	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public CT save(CT entity) {
		LOGGER.debug("GenericRepositoryService#save");
		try {
			return repository.save(entity);
		} catch (IdentifierGenerationException e) {
			// 未定义数据主键值

		} catch (ConstraintViolationException e) {
			// 外键关联数据不存在
		}
		return null;
	}

	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public List<CT> save(List<CT> entities) {
		LOGGER.debug("GenericRepositoryService#save");
		try {
			return repository.saveAll(entities);
		} catch (IdentifierGenerationException e) {
			// 未定义数据主键值

		} catch (ConstraintViolationException e) {
			// 外键关联数据不存在
		} catch (IllegalArgumentException e) {
			// 非法参数异常
		}

		return null;
	}

	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public CT saveAndFlush(CT entity) {
		LOGGER.debug("saveAndFlush");
		return repository.saveAndFlush(entity);
	}

	@Override
	// @Transactional(readOnly = true)
	public long count() {
		LOGGER.debug("count");
		return repository.count();
	}

	@Override
	// @Transactional(readOnly = true)
	public long count(Specification<CT> spec) {
		LOGGER.debug("count");
		return repository.count(spec);
	}

	@Override
	// @Transactional(readOnly = true)
	public boolean exists(KT id) {
		LOGGER.debug("exists");
		return repository.existsById(id);
	}

	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public void delete(CT entity) {
		LOGGER.debug("delete# Parameter:{}", entity);
		repository.delete(entity);
	}

	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public void delete(KT id) {
		LOGGER.debug("delete# Parameter:{}", id);
		repository.deleteById(id);
	}

	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public void deleteAll() {
		LOGGER.debug("deleteAll");
		repository.deleteAll();
	}

	@Override
	@Transactional
	@Lock(LockModeType.WRITE)
	public void deleteInBatch(List<CT> entities) {
		LOGGER.debug("deleteInBatch");
		repository.deleteInBatch(entities);
	}


	@Override
	public void executeQuery(String sqlString) {
	
	}

	@Override
	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	public void executeNamedQuery(String sqlString) {
		
	}

	@Override
	public void executeNamedQuery(String sqlString, HashMap<String, String> map) {

	}

	@Override
	public CT findOne(KT id) {
		LOGGER.debug("GenericRepositoryService#findOne(KT)");
		return repository.findById(id).get();
	}

	@Override
	// @Transactional(readOnly = true)
	public CT findOneByPrimaryKeyValue(String fieldName, Object value) {
		return null;
	}

}
