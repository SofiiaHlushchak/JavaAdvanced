package ua.lviv.lgs.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import ua.lviv.lgs.dao.ParticipantRepository;
import ua.lviv.lgs.domain.Level;
import ua.lviv.lgs.domain.Participant;

@Repository
public class ParticipantRepositoryImpl implements ParticipantRepository {

	private List<Participant> participants = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		Participant participant1 = new Participant(1, "Sonia", "Sonia@i.ua", Level.L2, "something");
		Participant participant2 = new Participant(2, "Taras", "Taras@meta.ua", Level.L4,"somenthing");
		Participant participant3 = new Participant(3, "Nastya", "Nastya@i.ua", Level.L1, "somenthing");

		participants.addAll(Arrays.asList(participant1, participant2, participant3));
	}
	
	@Override
	public void create(Participant participant) {
		participant.setId(participants.size()+1);
		participants.add(participant);

	}

	@Override
	public void deleteById(int id) {
		participants.remove(participants.stream().filter(part->part.getId() == id).findFirst().get());
		for(int i = 0; i<participants.size(); i++)
			participants.get(i).setId(i+1);
		
	}

	@Override
	public Participant findById(int id) {
		return participants.stream().filter(part->part.getId() == id).findFirst().orElse(null);
	}

	@Override
	public List<Participant> findAll() {
		return participants;
	}

}
