package semiproject.board.service;

import java.util.List;

import semiproject.board.vo.EPVO;

public interface EPService {

	List<EPVO> getEPList();

	boolean deleteEP(EPVO ep);

	boolean updateEP(EPVO ep);
	
}
