package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@RestController
public class HomeController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/chandrayan")
	public String index()
	{
		return "U r app is working properly";
	}
	  // Handler for creating new record in DB
	
	@PostMapping("/saveStudent")
	public Student saveData(@RequestBody Student student)
	{
		studentRepository.save(student);
		return student;
	}
	
	
	//Handler for fetch a single record
		@GetMapping("/getStudent/{rollNo}")
		public Student getStudentData(@PathVariable int rollNo) {
			Optional<Student> student=studentRepository.findById(rollNo);	
			Student student1=student.get();
			return student1;
			
			
		}
		
		//Handler for fetch all data from DB	
		
		@GetMapping("/getAllStudent")	
		public List<Student>getAll(){
			
			List <Student> studentList=studentRepository.findAll();
			return studentList;
		}	
		
		//Handler for delete a particular record from DB
		
		@DeleteMapping("/deleteStudent/{rollNo}")
		public String deleteString(@PathVariable int rollNo)
		{
			Student student=studentRepository.findById(rollNo).get();
			if(student!=null)
				studentRepository.delete(student);
			return "Deleted Sucessfully";
			
		}
		
//		Handler for update a particular record from DB
		
		@PutMapping("/updateData")
		public Student updateStudentData(@RequestBody Student student)
		{
			studentRepository.save(student);
			return student;
			
			
		}	

}
