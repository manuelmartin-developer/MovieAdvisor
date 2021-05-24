package name.manuelmartin.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import name.manuelmartin.movieadvisor.model.Film;

@Repository
public class FilmDaoImplMemory implements FilmDao {
	
	public List<Film> peliculas = new ArrayList<>();
	
	public void init() {
		
		peliculas = UtilFilmFileReader.readFile(path, separator, listseparator);
		
	}

	public Film findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Film> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Film film) {
		// TODO Auto-generated method stub

	}

	public void edit(Film film) {
		// TODO Auto-generated method stub

	}

	public void delete(Film film) {
		// TODO Auto-generated method stub

	}

}
