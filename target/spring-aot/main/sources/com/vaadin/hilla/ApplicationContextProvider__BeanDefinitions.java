package com.vaadin.hilla;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ApplicationContextProvider}.
 */
@Generated
public class ApplicationContextProvider__BeanDefinitions {
  /**
   * Get the bean definition for 'applicationContextProvider'.
   */
  public static BeanDefinition getApplicationContextProviderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ApplicationContextProvider.class);
    beanDefinition.setInstanceSupplier(ApplicationContextProvider::new);
    return beanDefinition;
  }
}
