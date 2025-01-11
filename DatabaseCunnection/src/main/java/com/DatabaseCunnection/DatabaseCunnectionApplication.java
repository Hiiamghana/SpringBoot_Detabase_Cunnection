package com.DatabaseCunnection;

import com.DatabaseCunnection.model.*;
import com.DatabaseCunnection.repository.CategoryRepository;
import com.DatabaseCunnection.repository.ProductRepository;
import com.DatabaseCunnection.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DatabaseCunnectionApplication implements CommandLineRunner{



	@Autowired
	private  StudentRepository studentRepository;

	private Logger logger= LoggerFactory.getLogger(DatabaseCunnectionApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DatabaseCunnectionApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{



			// One To One Mapping

//		Student student= new Student(); // store value in student table
//		student.setStudentName("Biswajit Dalai ");
//		student.setAbout("Iam a student of BCA");
//		student.setStudentId(15);

//
//
//
//
//		Laptop laptop= new Laptop(); // store value in laptop table
//		laptop.setLaptopId(16);
//		laptop.setModelNumber("jhsyq9uy");
//		laptop.setBrand("hp");
////
//
//
//
//				// for maping
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//
//
//
//		Student save= studentRepository.save(student);
//
//		logger.info("saved data :{}",save.getStudentName());


//			// for find the details of student with the help of Id
//	Student student =studentRepository.findById(15).get();
//		logger.info("name is : {}",student.getStudentName());
//
//		// this is the laptop details of the student
//		Laptop laptop= student.getLaptop();
//		logger.info("laptop {} ,{}",laptop.getBrand(),laptop.getModelNumber());
//


//		// ONE TO MANY
//
//
//		Student student= new Student(); // store value in student table
//		student.setStudentName("Hiiamghana1 ");
//		student.setAbout("Iam a student of Bsc");
//		student.setStudentId(27);
//
//		Address a1=new Address();
//		a1.setAddressId(23);
//		a1.setStreet("pku");
//		a1.setCity("pku");
//		a1.setCountry("india");
//		a1.setStudent(student);   // this is for getting data from student
//
//
//		Address a2=new Address();
//		a2.setAddressId(20);
//		a2.setStreet("jk");
//		a2.setCity("kolaghat");
//		a2.setCountry("india");
//		a2.setStudent(student);  //this is for getting data from student
//
//
//		List<Address>addressList=new ArrayList<>(); // this is for add address in table
//		addressList.add(a1);
//		addressList.add(a2);
//
//
//		student.setAddressList(addressList);
//		Student save=studentRepository.save(student);
//
//		logger.info("saved studet with Id {}, and address {}",save.getStudentId(),save.getAddressList());




//
//		// Many To Many
//
//
//		Product product1=new Product();
//		product1.setpId("nwdhiu46");
//		product1.setProductName("macbook");
//
//
//		Product product2=new Product();
//		product2.setpId("A15P");
//		product2.setProductName("Apple 15 pro");
//
//
//
//		Product product3=new Product();
//		product3.setpId("A16PMx");
//		product3.setProductName("Apple 16 pro max");
//
//
//
//
//		Category category1= new Category();
//		category1.setcId("CId1");
//		category1.setTitle("Electronics");
//
//
//		Category category2= new Category();
//		category2.setcId("CId2");
//		category2.setTitle("Phones");
//
//
//		Category category3= new Category();
//		category3.setcId("CId3");
//		category3.setTitle("Phones");
//
//
//
//		List<Product>category1Products=category1.getProducts();
//		category1Products.add(product1);
//		category1Products.add(product2);
//		category1Products.add(product3);
//
//
//		List<Product>category2Products=category2.getProducts();
//		category2Products.add(product2);
//		category2Products.add(product3);
//
//
//		categoryRepository.save(category1);
//		categoryRepository.save(category2);


// 			// for collect data from category
//		Category category= categoryRepository.findById("CId1").get();
//
//		System.out.println(category.getProducts().size());
//
//
//		Category category2= categoryRepository.findById("CId2").get();
//		System.out.println(category2.getProducts().size());


		// For collect data from product

		Product product=productRepository.findById("A16PMx").get();
		System.out.println(product.getCategories().size());



	}





	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

}
