package com.baoning.spring.boot.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//打包
//@SpringBootApplication
//public class MongodbApplication extends SpringBootServletInitializer {
//
//protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//    return application.sources(MongodbApplication.class);
//}
//	public static void main(String[] args) {
//		SpringApplication.run(MongodbApplication.class, args);
//	}
//}


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}
}
