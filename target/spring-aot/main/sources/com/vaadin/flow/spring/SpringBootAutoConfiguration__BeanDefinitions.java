package com.vaadin.flow.spring;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Bean definitions for {@link SpringBootAutoConfiguration}.
 */
@Generated
public class SpringBootAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'springBootAutoConfiguration'.
   */
  public static BeanDefinition getSpringBootAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringBootAutoConfiguration.class);
    beanDefinition.setTargetType(SpringBootAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpringBootAutoConfiguration.class);
    InstanceSupplier<SpringBootAutoConfiguration> instanceSupplier = InstanceSupplier.using(SpringBootAutoConfiguration$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(SpringBootAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'contextInitializer'.
   */
  private static BeanInstanceSupplier<ServletContextInitializer> getContextInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletContextInitializer>forFactoryMethod(SpringBootAutoConfiguration$$SpringCGLIB$$0.class, "contextInitializer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.SpringBootAutoConfiguration", SpringBootAutoConfiguration.class).contextInitializer());
  }

  /**
   * Get the bean definition for 'contextInitializer'.
   */
  public static BeanDefinition getContextInitializerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletContextInitializer.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.SpringBootAutoConfiguration");
    beanDefinition.setInstanceSupplier(getContextInitializerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'servletRegistrationBean'.
   */
  private static BeanInstanceSupplier<ServletRegistrationBean> getServletRegistrationBeanInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletRegistrationBean>forFactoryMethod(SpringBootAutoConfiguration$$SpringCGLIB$$0.class, "servletRegistrationBean", ObjectProvider.class, VaadinConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.SpringBootAutoConfiguration", SpringBootAutoConfiguration.class).servletRegistrationBean(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'servletRegistrationBean'.
   */
  public static BeanDefinition getServletRegistrationBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ServletRegistrationBean.class, SpringServlet.class));
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.SpringBootAutoConfiguration");
    beanDefinition.setInstanceSupplier(getServletRegistrationBeanInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'websocketEndpointDeployer'.
   */
  private static BeanInstanceSupplier<ServerEndpointExporter> getWebsocketEndpointDeployerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServerEndpointExporter>forFactoryMethod(SpringBootAutoConfiguration$$SpringCGLIB$$0.class, "websocketEndpointDeployer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.flow.spring.SpringBootAutoConfiguration", SpringBootAutoConfiguration.class).websocketEndpointDeployer());
  }

  /**
   * Get the bean definition for 'websocketEndpointDeployer'.
   */
  public static BeanDefinition getWebsocketEndpointDeployerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServerEndpointExporter.class);
    beanDefinition.setFactoryBeanName("com.vaadin.flow.spring.SpringBootAutoConfiguration");
    beanDefinition.setInstanceSupplier(getWebsocketEndpointDeployerInstanceSupplier());
    return beanDefinition;
  }
}
