package semiproject.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import semiproject.board.vo.TimeoffVO;

public interface TimeoffDAO {

	List<TimeoffVO> selectTimeoffList();

	TimeoffVO selectTimeoff(@Param("tm_num")int tm_num);

	int updateTimeoff(@Param("dbTimeoff")TimeoffVO dbTimeoff);

	int insertTimeoff(@Param("timeoff")TimeoffVO timeoff);

}
