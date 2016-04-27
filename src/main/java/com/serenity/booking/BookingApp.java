package com.serenity.booking;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.serenity.booking.repository.CourseRepository;

import io.swagger.models.Swagger;

@SpringBootApplication
@Import(Swagger.class)
public class BookingApp {
	
	

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BookingApp.class, args);
		
		
		//BookingRepository repoBooking = (BookingRepository)ctx.getBean("bookingRepository");
		//LevelRepository repoLevel = (LevelRepository)ctx.getBean("levelRepository");
		//TypeRepository repoType = (TypeRepository)ctx.getBean("typeRepository");
		CourseRepository repoCourse = (CourseRepository)ctx.getBean("courseRepository");
		
		
		
		System.out.println("Los beans:");

	    String[] beanNames = ctx.getBeanDefinitionNames();
	    Arrays.sort(beanNames);
	    for (String beanName : beanNames) {
	        System.out.println(beanName);
	    }
	    
	    //System.out.println((repoBooking.findAll()).size());
	    //System.out.println((repoLevel.findAll()).size());
	    //System.out.println((repoType.findAll()).size());
	    System.out.println((repoCourse.findAllByOrderByDdateAsc()).size());
	    //System.out.println((repoBooking.findAll()).size());

	}
	
	
	

}
