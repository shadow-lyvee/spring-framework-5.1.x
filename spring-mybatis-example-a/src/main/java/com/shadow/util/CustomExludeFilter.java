package com.shadow.util;

import org.springframework.core.type.filter.AbstractTypeHierarchyTraversingFilter;

public class CustomExludeFilter extends AbstractTypeHierarchyTraversingFilter {

	protected CustomExludeFilter(boolean considerInherited, boolean considerInterfaces) {
		super(considerInherited, considerInterfaces);
	}

	@Override
	protected boolean matchClassName(String className) {
		return super.matchClassName(className);
	}
}
