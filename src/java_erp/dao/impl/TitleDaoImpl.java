package java_erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import java_erp.dao.TitleDao;
import java_erp.dto.Title;
import java_erp.util.JdbcUtil;

public class TitleDaoImpl implements TitleDao {
	
	private static final TitleDaoImpl instance = new TitleDaoImpl();
	
	public static TitleDaoImpl getInstance() {
		return instance;
	}
	
	private TitleDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Title> selectTitleByAll() {
		String sql = "SELECT tno, tname FROM title ";
		ArrayList<Title> list = null;
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			list = new ArrayList<Title>();
			while(rs.next()) {
				list.add(getTitle(rs));
				
			}
		} catch (SQLException e) {
			System.out.println("sql 문법 오류 sql check하시오~~~");
			e.printStackTrace();
		}
		return list;
	}

	private Title getTitle(ResultSet rs) throws SQLException {
		int tNo = rs.getInt("tno");
		String tName = rs.getString("tname");
		Title title = new Title(tNo, tName);
		return title;
	}

	@Override
	public Title selectTitleByNo(Title title) {
		String sql = "SELECT tno, tname FROM title where tno = ?";
		try(Connection con = JdbcUtil.getConnection();
				java.sql.PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, title.gettNo());
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getTitle(rs);
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		}

	@Override
	public int insertTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

}
