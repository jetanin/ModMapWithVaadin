package com.fastandfurious.reindeer.taskmanagement.ui.view;

import com.fastandfurious.reindeer.taskmanagement.service.TaskService;
import java.time.Clock;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TaskListView}.
 */
@Generated
public class TaskListView__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'com.fastandfurious.reindeer.taskmanagement.ui.view.TaskListView'.
   */
  private static BeanInstanceSupplier<TaskListView> getTaskListViewInstanceSupplier() {
    return BeanInstanceSupplier.<TaskListView>forConstructor(TaskService.class, Clock.class)
            .withGenerator((registeredBean, args) -> new TaskListView(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'taskListView'.
   */
  public static BeanDefinition getTaskListViewBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaskListView.class);
    beanDefinition.setScope("prototype");
    beanDefinition.setInstanceSupplier(getTaskListViewInstanceSupplier());
    return beanDefinition;
  }
}
