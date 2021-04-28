package com.mindtree.aem.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class NameCapsModel {
	
	@Inject
	private String name;
	
	private String fname;
	
	public String getFname() {
		return fname;
	}

	@PostConstruct
	private void initModel() {
		this.fname = Character.toUpperCase(this.name.charAt(0)) + this.name.substring(1);
	}
}
