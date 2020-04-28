package com.cg.lab2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.lab2.trainee.entity.Trainee1;
import com.cg.lab2.trainee.interfaces.TraineeServiceInterface;

@SpringBootApplication
public class Lab2Application implements CommandLineRunner{

@Autowired
TraineeServiceInterface td;

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		  Trainee1 s1 = new Trainee1(1, "sachin", "cs","mumbai");
		  Trainee1 s2 = new Trainee1(2,"ravi","mech","mumbai");
		  Trainee1 s3 = new Trainee1(3, "santhosh", "cs","mumbai");
		  Trainee1 s4 = new Trainee1(4,"mahesh","civil","mumbai");
		  
		  td.addtrainee(s1); 
		  td.addtrainee(s2);
		  td.addtrainee(s3);
		  td.addtrainee(s4);
		  
		  System.out.println("record inserted");
		  List<Trainee1> studentlist =td.retrieve();

}
}
