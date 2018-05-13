package com.revature.beans;

import javax.persistence.*;


@Entity
@Table(name="BEAR")
public class Bear {
	
	@Id
	@Column(name="BEAR_ID")	
	private int id;
	
	@Column(name="BEAR_NAME")
	private String name;
	
	@Column(name="BEAR_WEIGHT")
	private int bearWeight;
	
//	@Column(name="BEAR_TYPE_ID")
//	private int bearTypeId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="BEAR_TYPE_ID")
	private BearType bearType;
	
//	@Column(name="BEAR_CAVE_ID")
//	private int caveId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CAVE_ID")
	private Cave cave;

}
