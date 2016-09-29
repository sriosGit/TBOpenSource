package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.DBConexion;
import com.upc.dto.Evento;
import com.upc.service.IEventoService;

public class EventoServiceImpl implements IEventoService {

	public void create(Evento e) throws Exception {
		// TODO Auto-generated method stub

		String insert = "{call sp_insert_evento(?,?,?,?,?,?,?,?,?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setString(2, e.getNombre_evento());
		cs.setString(3, e.getFechaInicio());
		cs.setString(4, e.getFechaFin());
		cs.setString(5, e.getHora());
		cs.setString(6, e.getDireccion());
		cs.setFloat(7, e.getCoorX());
		cs.setFloat(8, e.getCoorY());
		cs.setString(9, e.getUrlImg());
		cs.setFloat(10, e.getPrecio());
	
		
		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new Exception(estado);
		}

	}

	public void update(Evento e) throws Exception {
		// TODO Auto-generated method stub
		String update = "{call sp_update_evento(?,?,?,?,?,?,?,?,?,?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(update);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, e.getId());
		cs.setString(3, e.getNombre_evento());
		cs.setString(4, e.getFechaInicio());
		cs.setString(5, e.getFechaFin());
		cs.setString(6, e.getHora());
		cs.setString(7, e.getDireccion());
		cs.setFloat(8, e.getCoorX());
		cs.setFloat(9, e.getCoorY());
		cs.setString(10, e.getUrlImg());
		cs.setFloat(11, e.getPrecio());
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
		String delete = "{call sp_delete_evento(?,?)}";

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

	public Evento get(int codigo) throws Exception {
		// TODO Auto-generated method stub
		String query = "{call sp_get_evento(?)}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(query);
		cs.setInt(1, codigo);

		ResultSet rs = cs.executeQuery();
		if (rs.next()) {
			 mapRow(rs);
		}

		return mapRow(rs);
	}

	public List<Evento> getAll() throws Exception {
		// TODO Auto-generated method stub
		List<Evento> lista = new ArrayList<Evento>();
		String query = "{call sp_list_evento()}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			lista.add(mapRow(rs));
		}

		return lista;
	}

	public Evento mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub

		Evento e =new Evento();
		
		e.setId(rs.getInt(1));
		e.setNombre_evento(rs.getString(2));
		e.setFechaInicio(rs.getString(3));
		e.setFechaFin(rs.getString(4));
		e.setHora(rs.getString(5));
		e.setDireccion(rs.getString(6));
		e.setCoorX(rs.getFloat(7));
		e.setCoorY(rs.getFloat(8));
		e.setUrlImg(rs.getString(9));
		e.setPrecio(rs.getFloat(10));
	
		return e;

	}

}
