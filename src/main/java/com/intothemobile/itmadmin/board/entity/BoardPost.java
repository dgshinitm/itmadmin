package com.intothemobile.itmadmin.board.entity;

import com.intothemobile.ifa.ancestors.ItmEntity;

public class BoardPost extends ItmEntity {

	private static final long serialVersionUID = 8771768686656595052L;

	private Integer postSeq;
	private Integer boardSeq;
	private String title;
	private String content;
	private String writer;
	private String tag;
	private Integer viewCnt;
	
	public Integer getPostSeq() {
		return postSeq;
	}
	public void setPostSeq(Integer postSeq) {
		this.postSeq = postSeq;
	}
	public Integer getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(Integer boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(Integer viewCnt) {
		this.viewCnt = viewCnt;
	}
}
