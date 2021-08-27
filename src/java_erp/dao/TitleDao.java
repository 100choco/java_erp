package java_erp.dao;

import java.util.ArrayList;

import java_erp.dto.Title;

public interface TitleDao {
	ArrayList<Title> selectTitleByAll();
	Title selectTitleByNo(Title title);
	
	int insertTitle(Title title);
	int updateTitle(Title title);
	int deletTitle(Title title);
}
