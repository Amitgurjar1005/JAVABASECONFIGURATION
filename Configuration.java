package com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages="com")
public class Configuration {
	
	@Bean(destroyMethod="start")
   public Emp emp() {
	   Emp emp=new Emp();
	    emp.setEcode(3232);
	    
	    emp.setName("sasds");
	    emp.setAddress(ad());
	   return emp;  
}
	
	@Bean
	   public Address ad() {
		   Address ad=new Address();
		    ad.setHouseno("12");
		    ad.setRoadno(" A B road");
		    ad.setStreet("veena nagar");
		   return ad;  
	}
}