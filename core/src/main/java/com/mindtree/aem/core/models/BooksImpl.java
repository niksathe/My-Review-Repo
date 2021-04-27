package com.mindtree.aem.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(
		adaptables = SlingHttpServletRequest.class,
		adapters = Bookname.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)


public class BooksImpl implements Bookname {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(BooksImpl.class);
	
	@Inject
	Resource componentResource;
	
	@ValueMapValue
	@Default(values = "Any Name")
	private String fullname;
	
	@ValueMapValue
	@Default(values = "100")
	private int marks;
	
	@ValueMapValue
	private List<String> bookname;
	
	@Override
	public String getFullname() {
		return fullname;
	}

	@Override
	public List<String> getBookname() {
		if (bookname!=null) {
			return new ArrayList<String>(bookname);
		}else {
			return Collections.emptyList();
		}
	}

	@Override
	public int getMarks() {
		return marks;
	}

}
