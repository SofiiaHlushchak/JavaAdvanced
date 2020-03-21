package ua.lviv.lgs.shared;

import java.util.List;


public interface AbstractCRUD<T> {
	T create(T t);

	T read(Integer id);

	T update(T t);

	
	List <T> readAll();

	void delete(Integer id);

}
