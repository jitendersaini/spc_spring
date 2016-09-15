package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author j.saini
 *
 */
@Entity
@Table(name = "SORTED_NUMBERS")
public class Numbers {

	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private Long originalStack;

	

	public Numbers() {

	}

	/**
	 * @param originalStack	
	 */
	public Numbers(Long originalStack) {
		super();
		this.originalStack = originalStack;		
	}

	/**
	 * @return the originalStack
	 */
	public Long getOriginalStack() {
		return originalStack;
	}

	/**
	 * @param originalStack
	 *            the originalStack to set
	 */
	public void setOriginalStack(Long originalStack) {
		this.originalStack = originalStack;
	}

}
