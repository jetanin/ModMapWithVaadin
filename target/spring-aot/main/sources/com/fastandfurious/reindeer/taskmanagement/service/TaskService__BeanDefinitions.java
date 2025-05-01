package com.fastandfurious.reindeer.taskmanagement.service;

import com.fastandfurious.reindeer.taskmanagement.domain.TaskRepository;
import java.time.Clock;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TaskService}.
 */
@Generated
public class TaskService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'taskService'.
   */
  private static BeanInstanceSupplier<TaskService> getTaskServiceInstanceSupplier() {
    return BeanInstanceSupplier.<TaskService>forConstructor(TaskRepository.class, Clock.class)
            .withGenerator((registeredBean, args) -> new TaskService(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'taskService'.
   */
  public static BeanDefinition getTaskServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaskService.class);
    beanDefinition.setInstanceSupplier(getTaskServiceInstanceSupplier());
    return beanDefinition;
  }
}
