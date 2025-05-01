package com.vaadin.hilla;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EndpointUtil}.
 */
@Generated
public class EndpointUtil__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EndpointUtil apply(RegisteredBean registeredBean, EndpointUtil instance) {
    AutowiredFieldValueResolver.forRequiredField("endpointProperties").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("registry").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("accessChecker").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
