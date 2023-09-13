package semiproject.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import semiproject.board.vo.EPVO;

public interface EPDAO {

	List<EPVO> selectEPList();

	EPVO selectEP(@Param("ep_id")int ep_id);

	boolean deleteEP(@Param("ep_id")int ep_id);

	int updateEP(@Param("dbEp")EPVO dbEp);

	


}
