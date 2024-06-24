package com.ham1142.dto;

public class BoardDto {
	
	private int bnum;//게시판 글 번호
	private String bname;//게시판 글 쓴이
	private String btitle;//게시판 글 제목
	private String bcontent;//게시판 글 내용
	private int bhit;//글 조회수
	private String bdate;//글 등록일시
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDto(int bnum, String bname, String btitle, String bcontent, int bhit, String bdate) {
		super();
		this.bnum = bnum;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bhit = bhit;
		this.bdate = bdate;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
	
}
