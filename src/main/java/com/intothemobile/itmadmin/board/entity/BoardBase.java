package com.intothemobile.itmadmin.board.entity;

import com.intothemobile.ifa.ancestors.ItmEntity;

public class BoardBase extends ItmEntity {

	private static final long serialVersionUID = -5476364702338383403L;

	private Integer boardSeq;
	private String boardTpCd;
	private String boardNm;
	private String boardDSesc;
	
	public Integer getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(Integer boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getBoardTpCd() {
		return boardTpCd;
	}
	public void setBoardTpCd(String boardTpCd) {
		this.boardTpCd = boardTpCd;
	}
	public String getBoardNm() {
		return boardNm;
	}
	public void setBoardNm(String boardNm) {
		this.boardNm = boardNm;
	}
	public String getBoardDSesc() {
		return boardDSesc;
	}
	public void setBoardDSesc(String boardDSesc) {
		this.boardDSesc = boardDSesc;
	}
}
