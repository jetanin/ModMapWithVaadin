package com.vaadin.hilla;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EndpointProperties}.
 */
@Generated
public class EndpointProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'endpointProperties'.
   */
  public static BeanDefinition getEndpointPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointProperties.class);
    InstanceSupplier<EndpointProperties> instanceSupplier = InstanceSupplier.using(EndpointProperties::new);
    instanceSupplier = instanceSupplier.andThen(EndpointProperties__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
