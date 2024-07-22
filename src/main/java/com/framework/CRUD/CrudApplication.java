package com.framework.CRUD;

import com.framework.CRUD.sampleJDBCh2.Option;
import com.framework.CRUD.sampleJDBCh2.SampleObject;
import com.framework.CRUD.sampleJDBCh2.SampleObjectIRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class CrudApplication {

	private static final Logger log = LoggerFactory.getLogger((CrudApplication.class));
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

//	@Bean
//	CommandLineRunner objects(SampleObjectIRepository sampleObjectIRepository) {
//		return args -> {
//			SampleObject sampleObject = new SampleObject(5, "Object 5", "Object 5 Description", BigDecimal.valueOf(100), Option.B);
//			sampleObjectIRepository.create(sampleObject);
//		};
//	}

}
