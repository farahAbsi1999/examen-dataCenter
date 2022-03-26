package tn.esprit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.Disque;
import tn.esprit.spring.entities.User;


/**
 * @author MrJava
 *
 * 
 */



@EnableScheduling
@EnableSwagger2
@EnableWebMvc
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@SpringBootApplication
public class ExamenDataCenterApplication implements CommandLineRunner  {

	
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ExamenDataCenterApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(User.class);
		restConfiguration.exposeIdsFor(Disque.class);
	}

}
