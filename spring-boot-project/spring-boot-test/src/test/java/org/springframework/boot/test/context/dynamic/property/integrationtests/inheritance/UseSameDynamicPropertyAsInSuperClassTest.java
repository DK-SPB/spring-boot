package org.springframework.boot.test.context.dynamic.property.integrationtests.inheritance;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.dynamic.property.DynamicTestProperty;
import org.springframework.boot.test.util.TestPropertyValues;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link DynamicTestProperty}
 *
 * @author Korovin Anatoliy
 */
@SpringBootTest(classes = UseSameDynamicPropertyAsInSuperClassTest.class)
class UseSameDynamicPropertyAsInSuperClassTest extends ParentTest {

	@Value("${first}")
	private String first;

	@Value("${second}")
	private String second;

	@DynamicTestProperty
	private static TestPropertyValues properties() {
		return TestPropertyValues.of("second=LOCAL");
	}

	@Test
	void dynamicPropertyFromSuperClass() {
		assertThat(first).isEqualTo("001");
		assertThat(second).isEqualTo("LOCAL");
	}

}
