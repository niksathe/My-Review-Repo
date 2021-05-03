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

	@Override
	public List<String> getCodingmultifield() {
		if (codingmultifield!=null) {
			return new ArrayList<String>(codingmultifield);
		}else {
			return Collections.emptyList();
		}
	}
	
	
}
