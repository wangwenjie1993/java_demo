package com.ywgroup.iecloud.main;

import com.ywgroup.iecloud.test.MyExcludeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(value = "com.ywgroup.iecloud",
		excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,
				value = {MyExcludeFilter.class})})
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
