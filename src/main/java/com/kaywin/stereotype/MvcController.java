package com.kaywin.stereotype;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Controller
public @interface MvcController {
    @AliasFor(
            annotation = Controller.class
    )
    String value() default "";
}
