package org.springframework.boot.test.context.dynamic.property.integrationtests.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.test.context.dynamic.property.IncludeDynamicProperty;

/**
 * @author Korovin Anatoliy
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@IncludeDynamicProperty(DynamicPropertyHolder.class)
public @interface AnnotationWithDynamicProperty {

}
