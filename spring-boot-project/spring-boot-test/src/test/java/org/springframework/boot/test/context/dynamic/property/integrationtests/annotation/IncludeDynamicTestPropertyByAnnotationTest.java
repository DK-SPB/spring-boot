package org.springframework.boot.test.context.dynamic.property.integrationtests.annotation;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for
 * {@link org.springframework.boot.test.context.dynamic.property.IncludeDynamicProperty}
 *
 * @author Korovin Anatoliy
 */
@AnnotationWithDynamicProperty
@SpringBootTest(classes = IncludeDynamicTestPropertyByAnnotationTest.class)
class IncludeDynamicTestPropertyByAnnotationTest {

	@Value("${key}")
	private String key;

	@Test
	void checkPropertyValueInjectInAnnotation() {
		assertThat(key).isEqualTo("051187");
	}

}
