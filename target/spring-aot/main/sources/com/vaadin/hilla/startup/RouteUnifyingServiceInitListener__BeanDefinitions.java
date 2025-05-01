package com.vaadin.hilla.startup;

import com.vaadin.flow.server.auth.NavigationAccessControl;
import com.vaadin.flow.server.auth.ViewAccessChecker;
import com.vaadin.hilla.route.RouteUnifyingConfigurationProperties;
import com.vaadin.hilla.route.RouteUtil;
import java.lang.SuppressWarnings;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RouteUnifyingServiceInitListener}.
 */
@Generated
public class RouteUnifyingServiceInitListener__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.vaadin.hilla.startup.RouteUnifyingServiceInitListener'.
   */
  @SuppressWarnings("removal")
  private static BeanInstanceSupplier<RouteUnifyingServiceInitListener> getRouteUnifyingServiceInitListenerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RouteUnifyingServiceInitListener>forConstructor(RouteUtil.class, RouteUnifyingConfigurationProperties.class, NavigationAccessControl.class, ViewAccessChecker.class)
            .withGenerator((registeredBean, args) -> new RouteUnifyingServiceInitListener(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'routeUnifyingServiceInitListener'.
   */
  public static BeanDefinition getRouteUnifyingServiceInitListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RouteUnifyingServiceInitListener.class);
    beanDefinition.setInstanceSupplier(getRouteUnifyingServiceInitListenerInstanceSupplier());
    return beanDefinition;
  }
}
