package com.revature.ers.pojo;

import java.sql.Date;
import java.sql.Timestamp;

public class Reimbursement {
	
	private int reimbId;
	private double reimbAmount;
	private Timestamp subDate;
	private Timestamp resolved;
	private String desc;
	private byte reciept;
	private int author;
	private int resolver;
	private int statusId;
	private int type;
	
	public Reimbursement() {
		super();
	}

	public Reimbursement(int reimbId, double reimbAmount, Timestamp subDate, Timestamp resolved, String desc, byte reciept,
			int author, int resolver, int statusId, int type) {
		super();
		this.reimbId = reimbId;
		this.reimbAmount = reimbAmount;
		this.subDate = subDate;
		this.resolved = resolved;
		this.desc = desc;
		this.reciept = reciept;
		this.author = author;
		this.resolver = resolver;
		this.statusId = statusId;
		this.type = type;
	}

	public int getReimbId() {
		return reimbId;
	}

	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}

	public double getReimbAmount() {
		return reimbAmount;
	}

	public void setReimbAmount(double reimbAmount) {
		this.reimbAmount = reimbAmount;
	}

	public Timestamp getSubDate() {
		return subDate;
	}

	public void setSubDate(Timestamp subDate) {
		this.subDate = subDate;
	}

	public Timestamp getResolved() {
		return resolved;
	}

	public void setResolved(Timestamp resolved) {
		this.resolved = resolved;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public byte getReciept() {
		return reciept;
	}

	public void setReciept(byte reciept) {
		this.reciept = reciept;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public int getResolver() {
		return resolver;
	}

	public void setResolver(int resolver) {
		this.resolver = resolver;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + author;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + reciept;
		long temp;
		temp = Double.doubleToLongBits(reimbAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + reimbId;
		result = prime * result + ((resolved == null) ? 0 : resolved.hashCode());
		result = prime * result + resolver;
		result = prime * result + statusId;
		result = prime * result + ((subDate == null) ? 0 : subDate.hashCode());
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (author != other.author)
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (reciept != other.reciept)
			return false;
		if (Double.doubleToLongBits(reimbAmount) != Double.doubleToLongBits(other.reimbAmount))
			return false;
		if (reimbId != other.reimbId)
			return false;
		if (resolved == null) {
			if (other.resolved != null)
				return false;
		} else if (!resolved.equals(other.resolved))
			return false;
		if (resolver != other.resolver)
			return false;
		if (statusId != other.statusId)
			return false;
		if (subDate == null) {
			if (other.subDate != null)
				return false;
		} else if (!subDate.equals(other.subDate))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbId=" + reimbId + ", reimbAmount=" + reimbAmount + ", subDate=" + subDate
				+ ", resolved=" + resolved + ", desc=" + desc + ", reciept=" + reciept + ", author=" + author
				+ ", resolver=" + resolver + ", statusId=" + statusId + ", type=" + type + "]";
	}
	
	
	
}
