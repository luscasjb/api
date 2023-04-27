/*
package com.integracao.compras.api.scheduler;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzSchedulerConfig {

	  @Bean
	  public JobDetail jobDetail() {
	    return JobBuilder.newJob(MyJob.class)
	      .withIdentity("myJob")
	      .storeDurably()
	      .build();
	  }

	  @Bean
	  public Trigger trigger(JobDetail job) {
	    return TriggerBuilder.newTrigger()
	      .forJob(job)
	      .withIdentity("myTrigger")
	      .withSchedule(SimpleScheduleBuilder.repeatHourlyForever(48))
	      .build();
	  }
}*/
