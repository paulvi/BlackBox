package org.unirail.BlackBox;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
// Required field that value has  bi-direction values dispersion gradient.
public @interface X {
	double value() default 0;//most often  value or value range (-7 | 78)
}
	