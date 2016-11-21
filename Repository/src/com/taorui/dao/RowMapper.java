package com.taorui.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
	public T rowMap(ResultSet rs) throws SQLException;
}
