package com.fastandfurious.reindeer;

import java.time.Clock;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link Application}.
 */
@Generated
public class Application__BeanDefinitions {
  /**
   * Get the bean definition for 'application'.
   */
  public static BeanDefinition getApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Application.class);
    beanDefinition.setTargetType(Application.class);
    ConfigurationClassUtils.initializeConfigurationClass(Application.class);
    beanDefinition.setInstanceSupplier(Application$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'clock'.
   */
  private static BeanInstanceSupplier<Clock> getClockInstanceSupplier() {
    return BeanInstanceSupplier.<Clock>forFactoryMethod(Application$$SpringCGLIB$$0.class, "clock")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("application", Application.class).clock());
  }

  /**
   * Get the bean definition for 'clock'.
   */
  public static BeanDefinition getClockBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Clock.class);
    beanDefinition.setFactoryBeanName("application");
    beanDefinition.setInstanceSupplier(getClockInstanceSupplier());
    return beanDefinition;
  }
}
