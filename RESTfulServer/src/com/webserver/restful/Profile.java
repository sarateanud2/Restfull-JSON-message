package com.webserver.restful;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private long id;
	private String firstName;
	private String lname;
	private Date created;
	
	public Profile() {
		super();
	}

	public Profile(long id, String firstName, String lname, Date created) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lname = lname;
		this.created = created;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
		
}
