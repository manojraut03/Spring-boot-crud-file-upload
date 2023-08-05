package com.demo.classicone.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.classicone.model.User;
import com.demo.classicone.service.UserService;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Controller;
@Controller
public class UserController {
	
	String filePath = System.getProperty("user.dir") + "/Uploads";
	@Autowired
	private UserService service;

	public UserController() {
		
	}
	
//	@GetMapping("/")	
//	
//	ResponseEntity<String> message(){
//		return ResponseEntity.ok("In Cont");
//	}
	
	
	
	@GetMapping("/dashboard")
	//@RequestMapping("/")
	public String dashboardPage() {
		return "dashboard";
	}
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	@RequestMapping("/detail")
	public String detail() {
		return "detail";
	}
	
	@PostMapping("/savedetail")
	public String saveDetail(@ModelAttribute("user") User user, @RequestParam("files") MultipartFile[] files) throws IOException {
//		System.out.println(user.getName());
		System.out.println(files);
		List<String> fileNames = new ArrayList<>();

	         Arrays.asList(files).stream().forEach(file -> {

	        fileNames.add(file.getOriginalFilename());
	        
	        String fname= file.getOriginalFilename();
			
			FileOutputStream fout;
			try {
				fout = new FileOutputStream(filePath+ File.separator + file.getOriginalFilename());
				fout.write(file.getBytes());
		        fout.close(); 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	               
	      });
	       
	     user.setPhoto(fileNames.get(0));
	     user.setAadhar(fileNames.get(1));
	     user.setPancard(fileNames.get(2));
	     user.setLicence(fileNames.get(3));
	     System.out.println(fileNames.get(0));
	  
		
		
 		
		
//		String filePath = System.getProperty("user.dir") + "/Uploads" + File.separator + file.getOriginalFilename();
//		byte[] bytes = file.getBytes();
//		String fname= file.getOriginalFilename();
//		
//		System.out.println("FIlename===="+fname+"-------------"+bytes);
//		System.out.println("filePath"+filePath);
//		FileOutputStream fout = new FileOutputStream(filePath);
//        fout.write(file.getBytes());
        
        // Closing the connection
       // fout.close();
//        System.out.println("File Uploaded Successfully");
////		Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
////		Files.write(path, bytes);
//        user.setPhoto(fname);
//        //user.setImgdata(bytes);
 		service.saveUser(user);
		
		//System.out.println("save detail");
        return "success";
	}
	
	
//	@PostMapping("/savedetail")
//	public String saveDetail(@ModelAttribute("user") User user, MultipartFile[] files) throws IOException {
////		System.out.println(user.getName());
////		System.out.println(user.getDob());
//		//String filePath = System.getProperty("user.dir") + "/Uploads" + File.separator + file.getOriginalFilename();
//		
//		Arrays.stream(files).forEach(t -> 
//		
//				)
//		byte[] bytes = file.getBytes();
//		String fname= file.getOriginalFilename();
//		
//		//System.out.println("FIlename===="+fname+"-------------"+bytes);
//		System.out.println("filePath"+filePath);
//		FileOutputStream fout = new FileOutputStream(filePath);
//        fout.write(file.getBytes());
//         
//        // Closing the connection
//        fout.close();
//       System.out.println("File Uploaded Successfully");
////		Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
////		Files.write(path, bytes);
//		
//		//service.saveUser(user);
//		
//		//System.out.println("save detail");
//		return "success";
//	}
	

}
