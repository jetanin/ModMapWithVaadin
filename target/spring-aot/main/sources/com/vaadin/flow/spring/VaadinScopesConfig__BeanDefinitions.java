package com.vaadin.flow.spring;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link VaadinScopesConfig}.
 */
@Generated
public class VaadinScopesConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'vaadinScopesConfig'.
   */
  public static BeanDefinition getVaadinScopesConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinScopesConfig.class);
    beanDefinition.setTargetType(VaadinScopesConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(VaadinScopesConfig.class);
    beanDefinition.setInstanceSupplier(VaadinScopesConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'vaadinSessionScope'.
   */
  public static BeanDefinition getVaadinSessionScopeBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinScopesConfig.class);
    beanDefinition.setTargetType(BeanFactoryPostProcessor.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<BeanFactoryPostProcessor>forFactoryMethod(VaadinScopesConfig.class, "vaadinSessionScope").withGenerator((registeredBean) -> VaadinScopesConfig.vaadinSessionScope()));
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'vaadinUIScope'.
   */
  public static BeanDefinition getVaadinUIScopeBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinScopesConfig.class);
    beanDefinition.setTargetType(BeanFactoryPostProcessor.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<BeanFactoryPostProcessor>forFactoryMethod(VaadinScopesConfig.class, "vaadinUIScope").withGenerator((registeredBean) -> VaadinScopesConfig.vaadinUIScope()));
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'vaadinRouteScope'.
   */
  public static BeanDefinition getVaadinRouteScopeBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinScopesConfig.class);
    beanDefinition.setTargetType(BeanFactoryPostProcessor.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<BeanFactoryPostProcessor>forFactoryMethod(VaadinScopesConfig.class, "vaadinRouteScope").withGenerator((registeredBean) -> VaadinScopesConfig.vaadinRouteScope()));
    return beanDefinition;
  }
}
