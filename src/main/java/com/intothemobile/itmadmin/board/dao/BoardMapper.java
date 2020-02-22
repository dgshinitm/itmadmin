package com.intothemobile.itmadmin.board.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	String currentDatetime();
}
