package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="BEAR_TYPE")
public class BearType {
	
	@Id
	@Column(name="BEAR_TYPE_ID")
	private int bearTypeId;
	
	@Column(name="BEAR_TYPE_NAME")
	private String name;

}
