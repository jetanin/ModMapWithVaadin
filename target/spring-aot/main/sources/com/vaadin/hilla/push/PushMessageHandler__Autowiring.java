package com.vaadin.hilla.push;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PushMessageHandler}.
 */
@Generated
public class PushMessageHandler__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PushMessageHandler apply(RegisteredBean registeredBean,
      PushMessageHandler instance) {
    AutowiredFieldValueResolver.forRequiredField("servletContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
