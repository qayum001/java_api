package web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import web.api.infrastructure.InfrastructureCfg;
import web.api.persistence.PersistenceCfg;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(PersistenceCfg.class);

		SpringApplication.run(ApiApplication.class, args).setParent(ctx);;
	}
}
