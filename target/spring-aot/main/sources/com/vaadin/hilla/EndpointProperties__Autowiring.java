package com.vaadin.hilla;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EndpointProperties}.
 */
@Generated
public class EndpointProperties__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EndpointProperties apply(RegisteredBean registeredBean,
      EndpointProperties instance) {
    AutowiredFieldValueResolver.forRequiredField("endpointPrefix").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
