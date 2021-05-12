package com.mindtree.aem.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = CodingChallengeInterface.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CodingChallengeModel implements CodingChallengeInterface {

	@ValueMapValue
	private List<String> codingmultifield;
	
	@ValueMapValue
	@Default(values = "{Boolean}false")
	private Boolean checkboolean;
	
	@ValueMapValue
	private String path;
	
	@ValueMapValue
	private String selectdropdown;
	
	@ValueMapValue
	String fileReference;
	
	@Override
	public String getFileReference() {
		return fileReference;
	}

	@Override
	public List<String> getCodingmultifield() {
		if (codingmultifield!=null) {
			return new ArrayList<String>(codingmultifield);
		}else {
			return Collections.emptyList();
		}
	}

	@Override
	public Boolean isCheckboolean() {
		return checkboolean;
	}

	@Override
	public String getSelectdropdown() {
		return selectdropdown;
	}

	@Override
	public String getPath() {
		return path;
	}
}
