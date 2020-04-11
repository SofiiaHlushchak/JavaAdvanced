package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.UnivercityRepository;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@Service
public class UnivercityServiceImpl implements UnivercityService {

	@Autowired
	private UnivercityRepository univercityRepository;
	
	@Override
	public Univercity saveUnivercity(Univercity univercity) {
		return univercityRepository.saveAndFlush(univercity);
	}

	@Override
	public Univercity updateUnivercity(Univercity univercity) {
		return univercityRepository.save(univercity);
		
	}

	@Override
	public Univercity findByIdUnivercity(Long id) {
		return univercityRepository.getOne(id);
	}

	@Override
	public void deleteByIdUnivercity(Long id) {
		univercityRepository.deleteById(id);
		
	}

	@Override
	public List<Univercity> findAllUnivercity() {
		return univercityRepository.findAll();
	}

	@Override
	public List<Univercity> findByNameUnivercity(String name) {
		return univercityRepository.findByName(name);
	}
	
}
