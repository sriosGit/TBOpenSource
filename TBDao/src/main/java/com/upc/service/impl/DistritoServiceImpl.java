package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.DBConexion;
import com.upc.dto.Distrito;
import com.upc.dto.Evento;
import com.upc.service.IDistritoService;

public class DistritoServiceImpl implements IDistritoService {

	public void create(Distrito d) throws Exception {
		// TODO Auto-generated method stub

		String insert = "{call sp_insert_distrito(?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, d.getNombre_distrito());
		
		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new Exception(estado);
		}


	}

	public void update(Distrito d) throws Exception {
		// TODO Auto-generated method stub
		String update = "{call sp_update_distrito(?,?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(update);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, d.getDistritoID());
		cs.setString(3, d.getNombre_distrito());
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
		String delete = "{call sp_delete_distrito(?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(delete);
		
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

	public Distrito get(int codigo) throws Exception {
		// TODO Auto-generated method stub
		String query = "{call sp_get_distrito(?)}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(query);
		cs.setInt(1, codigo);

		ResultSet rs = cs.executeQuery();
		if (rs.next()) {
			 mapRow(rs);
		}

		return mapRow(rs);

	}

	public List<Distrito> getAll() throws Exception {
		// TODO Auto-generated method stub
		List<Distrito> lista = new ArrayList<Distrito>();
		String query = "{call sp_list_distrito()}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			lista.add(mapRow(rs));
		}

		return lista;
	}

	public Distrito mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Distrito d = new Distrito();
		d.setDistritoID(rs.getInt(1));
		d.setNombre_distrito(rs.getString(2));
		return d;
	}

}
