package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.domain.Participant;

public interface ParticipantRepository {
	
	void create (Participant participant);
	
    void deleteById (int id);
	
    Participant findById (int id);
	
	public List<Participant> findAll ();

}
