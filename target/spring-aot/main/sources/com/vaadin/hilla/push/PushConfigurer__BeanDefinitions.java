package com.vaadin.hilla.push;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.hilla.EndpointInvoker;
import com.vaadin.hilla.EndpointProperties;
import org.atmosphere.cpr.AtmosphereServlet;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link PushConfigurer}.
 */
@Generated
public class PushConfigurer__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.vaadin.hilla.push.PushConfigurer'.
   */
  private static BeanInstanceSupplier<PushConfigurer> getPushConfigurerInstanceSupplier() {
    return BeanInstanceSupplier.<PushConfigurer>forConstructor(EndpointProperties.class)
            .withGenerator((registeredBean, args) -> new PushConfigurer$$SpringCGLIB$$0(args.get(0)));
  }

  /**
   * Get the bean definition for 'pushConfigurer'.
   */
  public static BeanDefinition getPushConfigurerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PushConfigurer.class);
    beanDefinition.setTargetType(PushConfigurer.class);
    ConfigurationClassUtils.initializeConfigurationClass(PushConfigurer.class);
    beanDefinition.setInstanceSupplier(getPushConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pushEndpoint'.
   */
  private static BeanInstanceSupplier<PushEndpoint> getPushEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<PushEndpoint>forFactoryMethod(PushConfigurer$$SpringCGLIB$$0.class, "pushEndpoint", ObjectMapper.class, PushMessageHandler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.push.PushConfigurer", PushConfigurer.class).pushEndpoint(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'pushEndpoint'.
   */
  public static BeanDefinition getPushEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PushEndpoint.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.push.PushConfigurer");
    beanDefinition.setInstanceSupplier(getPushEndpointInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pushMessageHandler'.
   */
  private static BeanInstanceSupplier<PushMessageHandler> getPushMessageHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<PushMessageHandler>forFactoryMethod(PushConfigurer$$SpringCGLIB$$0.class, "pushMessageHandler", EndpointInvoker.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.push.PushConfigurer", PushConfigurer.class).pushMessageHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'pushMessageHandler'.
   */
  public static BeanDefinition getPushMessageHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PushMessageHandler.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.push.PushConfigurer");
    InstanceSupplier<PushMessageHandler> instanceSupplier = getPushMessageHandlerInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(PushMessageHandler__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'atmosphereInitializer'.
   */
  private static BeanInstanceSupplier<PushConfigurer.EmbeddedAtmosphereInitializer> getAtmosphereInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PushConfigurer.EmbeddedAtmosphereInitializer>forFactoryMethod(PushConfigurer$$SpringCGLIB$$0.class, "atmosphereInitializer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.push.PushConfigurer", PushConfigurer.class).atmosphereInitializer());
  }

  /**
   * Get the bean definition for 'atmosphereInitializer'.
   */
  public static BeanDefinition getAtmosphereInitializerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PushConfigurer.EmbeddedAtmosphereInitializer.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.push.PushConfigurer");
    beanDefinition.setInstanceSupplier(getAtmosphereInitializerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'atmosphereServlet'.
   */
  private static BeanInstanceSupplier<ServletRegistrationBean> getAtmosphereServletInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletRegistrationBean>forFactoryMethod(PushConfigurer$$SpringCGLIB$$0.class, "atmosphereServlet", PushEndpoint.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.push.PushConfigurer", PushConfigurer.class).atmosphereServlet(args.get(0)));
  }

  /**
   * Get the bean definition for 'atmosphereServlet'.
   */
  public static BeanDefinition getAtmosphereServletBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ServletRegistrationBean.class, AtmosphereServlet.class));
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.push.PushConfigurer");
    beanDefinition.setInstanceSupplier(getAtmosphereServletInstanceSupplier());
    return beanDefinition;
  }
}
