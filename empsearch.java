package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class empsearch {
  public static void main(String[] args) {
   
 ApplicationContext context=new    AnnotationConfigApplicationContext(Configuration.class);
Emp d=(Emp) context.getBean("emp");
System.out.println(d);

}
}