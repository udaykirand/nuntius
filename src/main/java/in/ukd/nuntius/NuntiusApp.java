package in.ukd.nuntius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"in.ukd.nuntius"})
public class NuntiusApp {
	private final static Logger LOG = LoggerFactory.getLogger(NuntiusApp.class);
	public static void main(String[] args) {
		LOG.info("========== Starting Nuntius ==========");
		SpringApplication.run(NuntiusApp.class);
	}
	
}
