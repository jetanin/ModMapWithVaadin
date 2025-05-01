package com.fastandfurious.reindeer.base.ui.view;

import com.vaadin.flow.server.VaadinServiceInitListener;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link MainErrorHandler}.
 */
@Generated
public class MainErrorHandler__BeanDefinitions {
  /**
   * Get the bean definition for 'mainErrorHandler'.
   */
  public static BeanDefinition getMainErrorHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MainErrorHandler.class);
    beanDefinition.setTargetType(MainErrorHandler.class);
    ConfigurationClassUtils.initializeConfigurationClass(MainErrorHandler.class);
    beanDefinition.setInstanceSupplier(MainErrorHandler$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'errorHandlerInitializer'.
   */
  private static BeanInstanceSupplier<VaadinServiceInitListener> getErrorHandlerInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<VaadinServiceInitListener>forFactoryMethod(MainErrorHandler$$SpringCGLIB$$0.class, "errorHandlerInitializer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("mainErrorHandler", MainErrorHandler.class).errorHandlerInitializer());
  }

  /**
   * Get the bean definition for 'errorHandlerInitializer'.
   */
  public static BeanDefinition getErrorHandlerInitializerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VaadinServiceInitListener.class);
    beanDefinition.setFactoryBeanName("mainErrorHandler");
    beanDefinition.setInstanceSupplier(getErrorHandlerInitializerInstanceSupplier());
    return beanDefinition;
  }
}
