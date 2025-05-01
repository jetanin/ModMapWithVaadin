package com.vaadin.hilla.route;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RouteUtil}.
 */
@Generated
public class RouteUtil__BeanDefinitions {
  /**
   * Get the bean definition for 'routeUtil'.
   */
  public static BeanDefinition getRouteUtilBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RouteUtil.class);
    beanDefinition.setInstanceSupplier(RouteUtil::new);
    return beanDefinition;
  }
}
