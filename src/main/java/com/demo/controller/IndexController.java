package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.demo.Model.User;


@SessionAttributes({"user"})
@Controller
@RequestMapping("/index")
public class IndexController extends AbstractController{

	@RequestMapping(value ="/hello.do" )
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
        return new ModelAndView("Helloworld");
    }

	 @RequestMapping(value="/login.do")
	    public ModelAndView login(HttpServletRequest request,HttpServletResponse response,@RequestParam("name")String name,@RequestParam(value="pwd",required=false) String pwd){
	        ModelAndView modelAndView = new ModelAndView("Index");
	        System.out.println("name:"+name+" pwd:"+pwd);
	        return modelAndView;
	        }
	 
	 @RequestMapping("/getlogin/name/{name}/pwd/{pwd}")
	    public ModelAndView getlogin(@PathVariable(value ="name") String name,@PathVariable(value ="pwd") String pwd){
	        ModelAndView modelAndView = new ModelAndView("1"); 
	        System.out.println("name:"+name+" pwd:"+pwd);
	        return new ModelAndView("1"); 
	        }

	 @RequestMapping(value="/login.do",method=RequestMethod.POST)
	    public ModelAndView login4(HttpServletRequest request,HttpServletResponse response,User user){
	        ModelAndView modelAndView = new ModelAndView("Index"); 
	        modelAndView.addObject("user", user);
	        return modelAndView;
	        }
	 
	 
	    @RequestMapping(value = "/testModel.do",method = RequestMethod.GET)
	    public String testModel(Model model){
	          User user=new User();
	          user.setName("abc");
	          user.setPwd("123456");
	          model.addAttribute("user",user);
	          return "Index";
	    }
	    
	    @RequestMapping(value ="/test.do" )
	    protected ModelAndView gettest(HttpServletRequest request)
	            throws Exception {
	    	ModelAndView modelAndView=new ModelAndView("Index");
	    	User u=new User();
	          u.setName("abc");
	          u.setPwd("123456789");
	          modelAndView.addObject("user",u);
	        return modelAndView;
	    }
	    @ModelAttribute(value = "mymap")
	    public Map<String,Object> map() {
	      User user=new User();
	      user.setName("abc");
	      user.setPwd("123456");
	      HashMap<String, Object> map=new HashMap<String, Object>(); 
	      map.put("user",user);
	      return map;
	    }
	    @RequestMapping(value="/requestbodybind.do",method = {RequestMethod.POST})  
		@ResponseBody  
		public User requestBodyBind(@RequestBody User user){  
		      System.out.println("requestbodybind:" + user);  
		      return user;  
		}
}
