package com.vaadin.flow.spring.springnative;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VaadinBeanFactoryInitializationAotProcessor}.
 */
@Generated
public class VaadinBeanFactoryInitializationAotProcessor__BeanDefinitions {
  /**
   * Bean definitions for {@link VaadinBeanFactoryInitializationAotProcessor.Marker}.
   */
  @Generated
  public static class Marker {
    /**
     * Get the bean definition for 'marker'.
     */
    public static BeanDefinition getMarkerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinBeanFactoryInitializationAotProcessor.Marker.class);
      beanDefinition.setInstanceSupplier(VaadinBeanFactoryInitializationAotProcessor.Marker::new);
      return beanDefinition;
    }
  }
}
