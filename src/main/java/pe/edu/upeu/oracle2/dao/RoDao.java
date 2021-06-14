package pe.edu.upeu.oracle2.dao;

import java.util.List;

import pe.edu.upeu.oracle2.entity.Rol;

public interface RoDao {
	public int create(Rol r);
	public int update(Rol r);
	public Rol read(int id);
	public int delete(int id);
	public List<Rol> readAll();
}
