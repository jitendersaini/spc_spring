package com.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

/**
 * @author j.saini
 *
 */
@Transactional
public interface NumbersDao extends CrudRepository<Numbers, Long> {
	public List<Numbers> findAll();

}
