package com.vaadin.hilla;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.server.auth.AccessAnnotationChecker;
import com.vaadin.hilla.auth.CsrfChecker;
import com.vaadin.hilla.auth.EndpointAccessChecker;
import com.vaadin.hilla.parser.jackson.JacksonObjectMapperFactory;
import jakarta.servlet.ServletContext;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link EndpointControllerConfiguration}.
 */
@Generated
public class EndpointControllerConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.vaadin.hilla.EndpointControllerConfiguration'.
   */
  private static BeanInstanceSupplier<EndpointControllerConfiguration> getEndpointControllerConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EndpointControllerConfiguration>forConstructor(EndpointProperties.class)
            .withGenerator((registeredBean, args) -> new EndpointControllerConfiguration$$SpringCGLIB$$0(args.get(0)));
  }

  /**
   * Get the bean definition for 'endpointControllerConfiguration'.
   */
  public static BeanDefinition getEndpointControllerConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointControllerConfiguration.class);
    beanDefinition.setTargetType(EndpointControllerConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(EndpointControllerConfiguration.class);
    beanDefinition.setInstanceSupplier(getEndpointControllerConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'accessAnnotationChecker'.
   */
  private static BeanInstanceSupplier<AccessAnnotationChecker> getAccessAnnotationCheckerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AccessAnnotationChecker>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "accessAnnotationChecker")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).accessAnnotationChecker());
  }

  /**
   * Get the bean definition for 'accessAnnotationChecker'.
   */
  public static BeanDefinition getAccessAnnotationCheckerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AccessAnnotationChecker.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getAccessAnnotationCheckerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'accessChecker'.
   */
  private static BeanInstanceSupplier<EndpointAccessChecker> getAccessCheckerInstanceSupplier() {
    return BeanInstanceSupplier.<EndpointAccessChecker>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "accessChecker", AccessAnnotationChecker.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).accessChecker(args.get(0)));
  }

  /**
   * Get the bean definition for 'accessChecker'.
   */
  public static BeanDefinition getAccessCheckerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointAccessChecker.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getAccessCheckerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'csrfChecker'.
   */
  private static BeanInstanceSupplier<CsrfChecker> getCsrfCheckerInstanceSupplier() {
    return BeanInstanceSupplier.<CsrfChecker>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "csrfChecker", ServletContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).csrfChecker(args.get(0)));
  }

  /**
   * Get the bean definition for 'csrfChecker'.
   */
  public static BeanDefinition getCsrfCheckerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CsrfChecker.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getCsrfCheckerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hillaEndpointObjectMapper'.
   */
  private static BeanInstanceSupplier<ObjectMapper> getHillaEndpointObjectMapperInstanceSupplier() {
    return BeanInstanceSupplier.<ObjectMapper>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "hillaEndpointObjectMapper", ApplicationContext.class, JacksonObjectMapperFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).hillaEndpointObjectMapper(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'hillaEndpointObjectMapper'.
   */
  public static BeanDefinition getHillaEndpointObjectMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObjectMapper.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getHillaEndpointObjectMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointInvoker'.
   */
  private static BeanInstanceSupplier<EndpointInvoker> getEndpointInvokerInstanceSupplier() {
    return BeanInstanceSupplier.<EndpointInvoker>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "endpointInvoker", ApplicationContext.class, ObjectMapper.class, ExplicitNullableTypeChecker.class, ServletContext.class, EndpointRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).endpointInvoker(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'endpointInvoker'.
   */
  public static BeanDefinition getEndpointInvokerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointInvoker.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getEndpointInvokerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointNameChecker'.
   */
  private static BeanInstanceSupplier<EndpointNameChecker> getEndpointNameCheckerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EndpointNameChecker>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "endpointNameChecker")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).endpointNameChecker());
  }

  /**
   * Get the bean definition for 'endpointNameChecker'.
   */
  public static BeanDefinition getEndpointNameCheckerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointNameChecker.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getEndpointNameCheckerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointRegistry'.
   */
  private static BeanInstanceSupplier<EndpointRegistry> getEndpointRegistryInstanceSupplier() {
    return BeanInstanceSupplier.<EndpointRegistry>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "endpointRegistry", EndpointNameChecker.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).endpointRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'endpointRegistry'.
   */
  public static BeanDefinition getEndpointRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointRegistry.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getEndpointRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointUtil'.
   */
  private static BeanInstanceSupplier<EndpointUtil> getEndpointUtilInstanceSupplier() {
    return BeanInstanceSupplier.<EndpointUtil>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "endpointUtil")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).endpointUtil());
  }

  /**
   * Get the bean definition for 'endpointUtil'.
   */
  public static BeanDefinition getEndpointUtilBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointUtil.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    InstanceSupplier<EndpointUtil> instanceSupplier = getEndpointUtilInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(EndpointUtil__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'typeChecker'.
   */
  private static BeanInstanceSupplier<ExplicitNullableTypeChecker> getTypeCheckerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExplicitNullableTypeChecker>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "typeChecker")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).typeChecker());
  }

  /**
   * Get the bean definition for 'typeChecker'.
   */
  public static BeanDefinition getTypeCheckerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExplicitNullableTypeChecker.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getTypeCheckerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webMvcRegistrationsHandlerMapping'.
   */
  private static BeanInstanceSupplier<WebMvcRegistrations> getWebMvcRegistrationsHandlerMappingInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebMvcRegistrations>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "webMvcRegistrationsHandlerMapping")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).webMvcRegistrationsHandlerMapping());
  }

  /**
   * Get the bean definition for 'webMvcRegistrationsHandlerMapping'.
   */
  public static BeanDefinition getWebMvcRegistrationsHandlerMappingBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebMvcRegistrations.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getWebMvcRegistrationsHandlerMappingInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointCodeGenerator'.
   */
  private static BeanInstanceSupplier<EndpointCodeGenerator> getEndpointCodeGeneratorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EndpointCodeGenerator>forFactoryMethod(EndpointControllerConfiguration$$SpringCGLIB$$0.class, "endpointCodeGenerator", ServletContext.class, EndpointController.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.vaadin.hilla.EndpointControllerConfiguration", EndpointControllerConfiguration.class).endpointCodeGenerator(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'endpointCodeGenerator'.
   */
  public static BeanDefinition getEndpointCodeGeneratorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointCodeGenerator.class);
    beanDefinition.setFactoryBeanName("com.vaadin.hilla.EndpointControllerConfiguration");
    beanDefinition.setInstanceSupplier(getEndpointCodeGeneratorInstanceSupplier());
    return beanDefinition;
  }
}
