package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.ds.DBConexion;
import com.upc.dto.Usuario;
import com.upc.service.IUsuarioService;

public class UsuarioServiceImpl implements IUsuarioService{

	public void create(Usuario u) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_usuario(?,?,?,?,?,?,?,?,?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, u.getTipo_usuario());
		cs.setString(3, u.getNombres());
		cs.setString(4, u.getApellidos());
		cs.setString(5, u.getUrlImg());
		cs.setString(5, u.getDNI());
		cs.setString(7, u.getDireccion());
		cs.setString(8, u.getEmail());
		cs.setString(9, u.getPassword());
		cs.setInt(10, u.getDistritoID());
	
		
		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new Exception(estado);
		}

	}

	public void update(Usuario u) throws Exception {
		// TODO Auto-generated method stub
		String update = "{call sp_update_usuario(?,?,?,?,?,?,?,?,?,?,?)}";

		Connection cn = DBConexion.connection();

		cn.setAutoCommit(true);

		CallableStatement cs = cn.prepareCall(update);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		cs.setInt(2, u.getId());
		cs.setInt(3, u.getTipo_usuario());
		cs.setString(4, u.getNombres());
		cs.setString(5, u.getApellidos());
		cs.setString(6, u.getUrlImg());
		cs.setString(7, u.getDNI());
		cs.setString(8, u.getDireccion());
		cs.setString(9, u.getEmail());
		cs.setString(10, u.getPassword());
		cs.setInt(11, u.getDistritoID());
	

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
		String delete = "{call sp_delete_usuario(?,?)}";

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

	public Usuario get(int codigo) throws Exception {
		// TODO Auto-generated method stub
		String get = "{call sp_get_usuario(?)}";

		Connection cn = DBConexion.connection();

		CallableStatement cs = cn.prepareCall(get);
		cs.setInt(1, codigo);

		ResultSet rs = cs.executeQuery();
		if (rs.next()) {
			 mapRow(rs);
		}

		return mapRow(rs);
	}

	public List<Usuario> getAll() throws Exception {
		List<Usuario> lista = new ArrayList<Usuario>();
		String query = "{call sp_list_categoria()}";

		Connection cn = DBConexion.connection();
		
		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			lista.add(mapRow(rs));
		}

		return lista;
	}

	public Usuario mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		u.setId(rs.getInt(1));
		u.setTipo_usuario(rs.getInt(2));
		u.setNombres(rs.getString(3));
		u.setApellidos(rs.getString(4));
		u.setUrlImg(rs.getString(5));
		u.setDNI(rs.getString(6));
		u.setDireccion(rs.getString(7));
		u.setEmail(rs.getString(8));
		u.setPassword(rs.getString(9));
		u.setDistritoID(rs.getInt(10));
		
		
		
		return u;
	}
	
	
	
}
