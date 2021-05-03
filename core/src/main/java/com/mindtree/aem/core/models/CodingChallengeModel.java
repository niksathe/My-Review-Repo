package com.mindtree.aem.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@SuppressWarnings("unused")

@Model(adaptables = SlingHttpServletRequest.class, adapters = Bookname.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CodingChallengeModel implements CodingChallengeInterface {

	@ValueMapValue
	private List<String> codingmultifield;
	
	@ValueMapValue
	private Boolean checkboolean;
	
	@ValueMapValue
	private String path;
	
	@ValueMapValue
	private String selectdropdown;
	

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
