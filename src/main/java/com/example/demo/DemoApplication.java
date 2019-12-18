package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		this.jdbcTemplate.execute("create table car (id int PRIMARY KEY,,make varchar,registration varchar)");
		this.jdbcTemplate.execute("insert into table car(id,make,registration) values('0','bmw','123123123')");
	}123*/

}
