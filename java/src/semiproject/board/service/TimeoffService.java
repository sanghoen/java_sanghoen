package semiproject.board.service;

import java.util.List;

import semiproject.board.vo.TimeoffVO;

public interface TimeoffService {

	List<TimeoffVO> getTimeoffList();

	boolean updateTimeoff(TimeoffVO timeoff);

	boolean insertTimeoff(TimeoffVO timeoff);

}
