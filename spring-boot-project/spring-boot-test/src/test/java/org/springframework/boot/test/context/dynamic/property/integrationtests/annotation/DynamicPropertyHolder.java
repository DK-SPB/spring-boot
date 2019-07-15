package org.springframework.boot.test.context.dynamic.property.integrationtests.annotation;

import org.springframework.boot.test.context.dynamic.property.DynamicTestProperty;
import org.springframework.boot.test.util.TestPropertyValues;

/**
 * @author Korovin Anatoliy
 */
public class DynamicPropertyHolder {

	@DynamicTestProperty
	private static TestPropertyValues property() {
		return TestPropertyValues.of("key=051187");
	}

}
