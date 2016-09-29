package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.DBConexion;
import com.upc.dto.Categoria;
import com.upc.service.ICategoriaService;

public class CategoriaServiceImpl implements ICategoriaService {

	public void create(Categoria c) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_categoria(?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, c.getNombre_categoria());

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new SQLException(estado);
		}


	}

	public void update(Categoria o) throws Exception {
		// TODO Auto-generated method stub
		String update = "{call sp_update_categoria(?,?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(update);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, o.getCategoriaID());
		cs.setString(3, o.getNombre_categoria());

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new SQLException(estado);
		}
	}

	public void delete(int codigo) throws Exception {
		// TODO Auto-generated method stub
		String update = "{call sp_delete_categoria(?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(update);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, codigo);

		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new SQLException(estado);
		}
	}

	public Categoria get(int codigo) throws Exception {
		// TODO Auto-generated method stub
		String query = "{call sp_get_categoria(?)}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(query);
		cs.setInt(1, codigo);

		ResultSet rs = cs.executeQuery();
		if (rs.next()) {
			 mapRow(rs);
		}

		return mapRow(rs);
	}

	public List<Categoria> getAll() throws Exception {
		List<Categoria> lista = new ArrayList<Categoria>();
		String query = "{call sp_list_categoria()}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			lista.add(mapRow(rs));
		}

		return lista;
	}

	public Categoria mapRow(ResultSet rs) throws Exception {
		Categoria categoria =new Categoria();
		categoria.setCategoriaID(rs.getInt(1));
		categoria.setNombre_categoria(rs.getString(2));

		return categoria;
	}

}
