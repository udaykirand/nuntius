package in.ukd.nuntius;

import java.util.Properties;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NuntiusStartup implements ApplicationListener<ApplicationReadyEvent> {
	
	Scheduler scheduler;
	
	private final static Logger LOG = LoggerFactory.getLogger(NuntiusStartup.class);

	/**
	 * This event is executed as late as conceivably possible to indicate that
	 * the application is ready to service requests.
	 */
	@Override
	@Required
	public void onApplicationEvent(final ApplicationReadyEvent event) {

		SchedulerFactory factory = new StdSchedulerFactory();
		try {
			Properties props = new Properties();
			props.load(NuntiusStartup.class.getClassLoader().getResourceAsStream("quartz.properties"));
			((StdSchedulerFactory) factory).initialize(props);
			scheduler = factory.getScheduler();
			scheduler.start();
			LOG.info("Scheduler started");
			
		} catch (Exception e) {
			LOG.error("Failed to start scheduler --- Killing Application");
			e.printStackTrace();
			// TODO Add code trigger email in case startup fails
			System.exit(1);
		}

	}

}