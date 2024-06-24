package com.ham1142.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ham1142.command.BCommand;
import com.ham1142.command.BListCommand;
import com.ham1142.command.BWriteCommand;
import com.ham1142.util.Constant;

@Controller
public class BoardController {
	
	BCommand command = null;
	
	private JdbcTemplate template;	
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping(value = "/write")
	public String write() {
		return "write_form";
	}
	
	@RequestMapping(value = "/writeOk")
	public String write(HttpServletRequest request, Model model) {
		
		// model에 request 싣기
		model.addAttribute("request", request);
		
		// command 호출
		command = new BWriteCommand();
		command.execute(model);		
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	
	
}
