package com.revature.beans;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="CAVE")
public class Cave {
	
	@Id
	@Column(name="CAVE_ID")
	private int id;
	
	@Column(name="CAVE_NAME")
	private String name;
	
	@Column(name="CAVE_MAXBEARS")
	private int maxBears;
	
	@OneToMany(mappedBy="cave", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Bear> bears;
	

}
