package com.ham1142.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.ham1142.board.dao.BoardDao;
import com.ham1142.board.dto.BoardDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> boardDtos = boardDao.list();
		
		model.addAttribute("boardList", boardDtos);

	}

}