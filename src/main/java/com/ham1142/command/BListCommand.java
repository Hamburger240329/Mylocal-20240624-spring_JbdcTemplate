package com.ham1142.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.ham1142.dao.BoardDao;
import com.ham1142.dto.BoardDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> boardDtos = boardDao.list();
		
		model.addAttribute("boardList", boardDtos);

	}

}