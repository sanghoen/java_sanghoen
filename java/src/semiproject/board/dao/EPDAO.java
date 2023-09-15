package semiproject.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import semiproject.board.vo.EPVO;

public interface EPDAO {

	List<EPVO> selectEPList();

	EPVO selectEP(@Param("ep_id")int ep_id);

	boolean deleteEP(@Param("ep_id")int ep_id);

	int updateEP(@Param("dbEp")EPVO dbEp);

	void insertTm(@Param("ep_id") int ep_id, @Param("today") String today);

	EPVO selectST(@Param("ep_id")int ep_id);

	void insertST(@Param("epST")EPVO epST);

}
