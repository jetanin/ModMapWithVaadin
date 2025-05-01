package com.vaadin.hilla.startup;

import com.vaadin.hilla.EndpointController;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EndpointRegistryInitializer}.
 */
@Generated
public class EndpointRegistryInitializer__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.vaadin.hilla.startup.EndpointRegistryInitializer'.
   */
  private static BeanInstanceSupplier<EndpointRegistryInitializer> getEndpointRegistryInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EndpointRegistryInitializer>forConstructor(EndpointController.class)
            .withGenerator((registeredBean, args) -> new EndpointRegistryInitializer(args.get(0)));
  }

  /**
   * Get the bean definition for 'endpointRegistryInitializer'.
   */
  public static BeanDefinition getEndpointRegistryInitializerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointRegistryInitializer.class);
    beanDefinition.setInstanceSupplier(getEndpointRegistryInitializerInstanceSupplier());
    return beanDefinition;
  }
}
