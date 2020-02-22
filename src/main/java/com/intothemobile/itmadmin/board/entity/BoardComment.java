package com.intothemobile.itmadmin.board.entity;

import com.intothemobile.ifa.ancestors.ItmEntity;

/**
 * 게시판 댓글
 * 
 * @author dgshin
 */
public class BoardComment extends ItmEntity {

	private static final long serialVersionUID = -6729765240498397227L;

	private Integer commentSeq;
	private Integer postSeq;
	private Integer upCommentSeq;
	private String comment;
	private String writer;
	
	public Integer getCommentSeq() {
		return commentSeq;
	}
	public void setCommentSeq(Integer commentSeq) {
		this.commentSeq = commentSeq;
	}
	public Integer getPostSeq() {
		return postSeq;
	}
	public void setPostSeq(Integer postSeq) {
		this.postSeq = postSeq;
	}
	public Integer getUpCommentSeq() {
		return upCommentSeq;
	}
	public void setUpCommentSeq(Integer upCommentSeq) {
		this.upCommentSeq = upCommentSeq;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}
