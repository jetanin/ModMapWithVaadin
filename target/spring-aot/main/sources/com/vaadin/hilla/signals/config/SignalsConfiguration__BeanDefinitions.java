package com.vaadin.hilla.signals.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.hilla.EndpointInvoker;
import com.vaadin.hilla.signals.core.registry.SecureSignalsRegistry;
import com.vaadin.hilla.signals.handler.SignalsHandler;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SignalsConfiguration}.
 */
@Generated
public class SignalsConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.vaadin.hilla.signals.config.SignalsConfiguration'.
   */
  private static BeanInstanceSupplier<SignalsConfiguration> getSignalsConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SignalsConfiguration>forConstructor(EndpointInvoker.class, ObjectMapper.class)
            .withGenerator((registeredBean, args) -> new SignalsConfiguration$$SpringCGLIB$$0(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'signalsConfiguration'.
   */
  public static BeanDefinition getSignalsConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SignalsConfiguration.class);
    beanDefinition.setTargetType(SignalsConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(SignalsConfiguration.class);
    beanDefinition.setInstanceSupplier(getSignalsConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'signalsHandler'.
   */
  private static BeanInstanceSupplier<SignalsHandler> getSignalsHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<SignalsHandler>forFactoryMethod(SignalsConfiguration$$SpringCGLIB$$0.class, "signalsHandler", SecureSignalsRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.signals.config.SignalsConfiguration", SignalsConfiguration.class).signalsHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'signalsHandler'.
   */
  public static BeanDefinition getSignalsHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SignalsHandler.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.signals.config.SignalsConfiguration");
    beanDefinition.setInstanceSupplier(getSignalsHandlerInstanceSupplier());
    return beanDefinition;
  }
}
