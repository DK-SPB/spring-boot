package org.springframework.boot.test.context.dynamic.property.integrationtests.inheritance;

import org.springframework.boot.test.context.dynamic.property.DynamicTestProperty;
import org.springframework.boot.test.util.TestPropertyValues;

/**
 * @author Korovin Anatoliy
 */
public abstract class ParentTest {

	@DynamicTestProperty
	private static TestPropertyValues parentProperties() {
		return TestPropertyValues.of("first=001", "second=002");
	}

}
