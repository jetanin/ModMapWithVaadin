package com.vaadin.flow.spring;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SpringBootAutoConfiguration}.
 */
@Generated
public class SpringBootAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SpringBootAutoConfiguration apply(RegisteredBean registeredBean,
      SpringBootAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("context").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
