package com.vaadin.flow.spring;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Bean definitions for {@link VaadinServletConfiguration}.
 */
@Generated
public class VaadinServletConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'vaadinServletConfiguration'.
   */
  public static BeanDefinition getVaadinServletConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinServletConfiguration.class);
    beanDefinition.setTargetType(VaadinServletConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(VaadinServletConfiguration.class);
    beanDefinition.setInstanceSupplier(VaadinServletConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'vaadinRootMapping'.
   */
  private static BeanInstanceSupplier<VaadinServletConfiguration.RootExcludeHandler> getVaadinRootMappingInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<VaadinServletConfiguration.RootExcludeHandler>forFactoryMethod(VaadinServletConfiguration$$SpringCGLIB$$0.class, "vaadinRootMapping", Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.VaadinServletConfiguration", VaadinServletConfiguration.class).vaadinRootMapping(args.get(0)));
  }

  /**
   * Get the bean definition for 'vaadinRootMapping'.
   */
  public static BeanDefinition getVaadinRootMappingBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinServletConfiguration.RootExcludeHandler.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.VaadinServletConfiguration");
    beanDefinition.setInstanceSupplier(getVaadinRootMappingInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'vaadinForwardingController'.
   */
  private static BeanInstanceSupplier<Controller> getVaadinForwardingControllerInstanceSupplier() {
    return BeanInstanceSupplier.<Controller>forFactoryMethod(VaadinServletConfiguration$$SpringCGLIB$$0.class, "vaadinForwardingController")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.VaadinServletConfiguration", VaadinServletConfiguration.class).vaadinForwardingController());
  }

  /**
   * Get the bean definition for 'vaadinForwardingController'.
   */
  public static BeanDefinition getVaadinForwardingControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Controller.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.VaadinServletConfiguration");
    beanDefinition.setInstanceSupplier(getVaadinForwardingControllerInstanceSupplier());
    return beanDefinition;
  }
}
