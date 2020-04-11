package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Univercity;

public interface UnivercityService {

	Univercity saveUnivercity(Univercity univercity);

	Univercity updateUnivercity(Univercity univercity);

	Univercity findByIdUnivercity(Long id);
	
	void deleteByIdUnivercity(Long id);

	List<Univercity> findAllUnivercity();

	List<Univercity> findByNameUnivercity(String name);
}
