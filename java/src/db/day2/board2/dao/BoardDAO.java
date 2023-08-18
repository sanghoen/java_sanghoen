package db.day2.board2.dao;

import org.apache.ibatis.annotations.Param;

public interface BoardDAO {

	int insertBoard(@Param("title")String title, @Param("id")String id);

}
