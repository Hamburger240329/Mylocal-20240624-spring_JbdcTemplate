package com.ham1142.board.command;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.ham1142.board.command.BCommand;
import com.ham1142.board.dao.BoardDao;
import com.ham1142.board.dto.BoardDto;

public class BContentViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bnum = request.getParameter("bnum");
		
		BoardDao boardDao = new BoardDao();
		BoardDto boardDto = boardDao.content_view(bnum);
		
		model.addAttribute("boardDto",boardDto);
				
		
	
		
	}

}
