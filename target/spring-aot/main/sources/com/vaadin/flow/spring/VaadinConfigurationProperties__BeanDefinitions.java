package com.vaadin.flow.spring;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VaadinConfigurationProperties}.
 */
@Generated
public class VaadinConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'vaadinConfigurationProperties'.
   */
  public static BeanDefinition getVaadinConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(VaadinConfigurationProperties::new);
    return beanDefinition;
  }
}
