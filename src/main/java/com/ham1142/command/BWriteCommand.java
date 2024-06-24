package com.ham1142.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.ham1142.dao.BoardDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		// 컨트롤러에서 model안에 request 객체를 넣어서 보내줌
		Map<String, Object> map = model.asMap();
		// model을 map 타입으로 변환(map으로 변환해야만 request 객체를 꺼내올수 있음)
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// map에서 "request"이름으로 되어 있는 request 객체를 빼서 request 타입으로 저장
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BoardDao boardDao = new BoardDao();
		boardDao.writeOk(bname, btitle, bcontent);
		
	}

}