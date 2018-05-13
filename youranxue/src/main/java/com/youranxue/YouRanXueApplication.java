package com.youranxue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class YouRanXueApplication {

	public final static Logger logger = LoggerFactory.getLogger(YouRanXueApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(YouRanXueApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12);
	}

	// @Autowired
	// private final CityMapper cityMapper;
	//
	// public YouRanXueApplication(CityMapper cityMapper) {
	// this.cityMapper = cityMapper;
	// }

//	@Bean
//	CommandLineRunner sampleCommandLineRunner() {
//		CityExample example = new CityExample();
//		example.createCriteria().andStateEqualTo("CA");
//
//		List<City> cityList = this.cityMapper.selectByExample(example);
//
//		cityList.forEach(city -> System.out.println(city.getCountry()));
//		return null;
//
//	}
}
