package com.vaadin.hilla.route;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link RouteUnifyingConfiguration}.
 */
@Generated
public class RouteUnifyingConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'routeUnifyingConfiguration'.
   */
  public static BeanDefinition getRouteUnifyingConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RouteUnifyingConfiguration.class);
    beanDefinition.setTargetType(RouteUnifyingConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(RouteUnifyingConfiguration.class);
    beanDefinition.setInstanceSupplier(RouteUnifyingConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'routeUnifyingConfigurationProperties'.
   */
  private static BeanInstanceSupplier<RouteUnifyingConfigurationProperties> getRouteUnifyingConfigurationPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RouteUnifyingConfigurationProperties>forFactoryMethod(RouteUnifyingConfiguration$$SpringCGLIB$$0.class, "routeUnifyingConfigurationProperties")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.route.RouteUnifyingConfiguration", RouteUnifyingConfiguration.class).routeUnifyingConfigurationProperties());
  }

  /**
   * Get the bean definition for 'routeUnifyingConfigurationProperties'.
   */
  public static BeanDefinition getRouteUnifyingConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RouteUnifyingConfigurationProperties.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.route.RouteUnifyingConfiguration");
    beanDefinition.setInstanceSupplier(getRouteUnifyingConfigurationPropertiesInstanceSupplier());
    return beanDefinition;
  }
}
