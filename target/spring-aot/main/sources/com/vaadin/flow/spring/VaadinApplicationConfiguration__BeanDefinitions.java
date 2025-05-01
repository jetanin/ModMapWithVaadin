package com.vaadin.flow.spring;

import com.vaadin.flow.server.auth.MenuAccessControl;
import com.vaadin.flow.server.startup.ApplicationConfigurationFactory;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link VaadinApplicationConfiguration}.
 */
@Generated
public class VaadinApplicationConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'vaadinApplicationConfiguration'.
   */
  public static BeanDefinition getVaadinApplicationConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinApplicationConfiguration.class);
    beanDefinition.setTargetType(VaadinApplicationConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(VaadinApplicationConfiguration.class);
    beanDefinition.setInstanceSupplier(VaadinApplicationConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultApplicationConfigurationFactory'.
   */
  private static BeanInstanceSupplier<ApplicationConfigurationFactory> getDefaultApplicationConfigurationFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ApplicationConfigurationFactory>forFactoryMethod(VaadinApplicationConfiguration$$SpringCGLIB$$0.class, "defaultApplicationConfigurationFactory")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.VaadinApplicationConfiguration", VaadinApplicationConfiguration.class).defaultApplicationConfigurationFactory());
  }

  /**
   * Get the bean definition for 'defaultApplicationConfigurationFactory'.
   */
  public static BeanDefinition getDefaultApplicationConfigurationFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ApplicationConfigurationFactory.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.VaadinApplicationConfiguration");
    beanDefinition.setInstanceSupplier(getDefaultApplicationConfigurationFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'vaadinApplicationContextInitializer'.
   */
  private static BeanInstanceSupplier<ApplicationContextAware> getVaadinApplicationContextInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ApplicationContextAware>forFactoryMethod(VaadinApplicationConfiguration$$SpringCGLIB$$0.class, "vaadinApplicationContextInitializer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.VaadinApplicationConfiguration", VaadinApplicationConfiguration.class).vaadinApplicationContextInitializer());
  }

  /**
   * Get the bean definition for 'vaadinApplicationContextInitializer'.
   */
  public static BeanDefinition getVaadinApplicationContextInitializerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ApplicationContextAware.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.VaadinApplicationConfiguration");
    beanDefinition.setInstanceSupplier(getVaadinApplicationContextInitializerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'springSecurityVaadinMenuAccessControl'.
   */
  private static BeanInstanceSupplier<MenuAccessControl> getSpringSecurityVaadinMenuAccessControlInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MenuAccessControl>forFactoryMethod(VaadinApplicationConfiguration$$SpringCGLIB$$0.class, "springSecurityVaadinMenuAccessControl")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.VaadinApplicationConfiguration", VaadinApplicationConfiguration.class).springSecurityVaadinMenuAccessControl());
  }

  /**
   * Get the bean definition for 'springSecurityVaadinMenuAccessControl'.
   */
  public static BeanDefinition getSpringSecurityVaadinMenuAccessControlBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MenuAccessControl.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.VaadinApplicationConfiguration");
    beanDefinition.setInstanceSupplier(getSpringSecurityVaadinMenuAccessControlInstanceSupplier());
    return beanDefinition;
  }
}
