package com.vaadin.hilla;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.hilla.auth.CsrfChecker;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link EndpointController}.
 */
@Generated
public class EndpointController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.vaadin.hilla.EndpointController'.
   */
  private static BeanInstanceSupplier<EndpointController> getEndpointControllerInstanceSupplier() {
    return BeanInstanceSupplier.<EndpointController>forConstructor(ApplicationContext.class, EndpointRegistry.class, EndpointInvoker.class, CsrfChecker.class, ObjectMapper.class)
            .withGenerator((registeredBean, args) -> new EndpointController(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'endpointController'.
   */
  public static BeanDefinition getEndpointControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointController.class);
    beanDefinition.setInstanceSupplier(getEndpointControllerInstanceSupplier());
    return beanDefinition;
  }
}
