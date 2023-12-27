package day10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import day10.model.StudentProgress;
import day10.model.TotalMarksCalculator;
import day10.model.User;
import day10.model.UserValidator;




@Controller
@SessionAttributes("progressReport")//Binding this attribute at SESSION level

public class SpringMvcController {
	@RequestMapping("/showLogin")//@RequestMapping(value = "/showLogin", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";//Returns view name
	}
	
	//This method will be called when client makes a POST request for /doValidate URL
	@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	public String getResultPage(@RequestParam("uid") String userName, @RequestParam("pwd") String password) {
		String resultPage = "failure";
		User userModel = new User(userName, password); //Building the Data Model
		boolean success = UserValidator.isValid(userModel);
		if(success)
			resultPage = "success";
		return resultPage;
	}
	
	@RequestMapping("/studentEntry")
	public String getStudentEntryPage() {
		return "studentEntry";
	}
	
	@RequestMapping(value = "/acceptStudent", method = RequestMethod.POST)
	public String processStudentInfo(String studentName, int phy, int chem, int maths, Model dataModel) {
		int totalMarks = TotalMarksCalculator.getTotalMarks(phy, chem, maths);
		StudentProgress progress = new StudentProgress(studentName, totalMarks);
		//Attaching StudentProgress information to the Model: dataModel
		dataModel.addAttribute("progressReport", progress);
		dataModel.addAttribute("message", "Thank You!!");
		return "StudentProgress";
	}
	
}
