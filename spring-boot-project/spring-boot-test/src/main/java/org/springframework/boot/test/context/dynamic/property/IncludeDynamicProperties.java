package org.springframework.boot.test.context.dynamic.property;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@code @IncludeDynamicProperties} is a container for one or more
 * {@code @IncludeDynamicProperty} declarations.
 *
 * @author Korovin Anatoliy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface IncludeDynamicProperties {

	IncludeDynamicProperty[] value();

}
