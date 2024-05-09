package com.sports.sportsmatch.service.impl;

import com.sports.sportsmatch.Repository.MatchRepository;
import com.sports.sportsmatch.Repository.PlayerRepository;
import com.sports.sportsmatch.model.dao.Match;
import com.sports.sportsmatch.model.dao.Player;
import com.sports.sportsmatch.model.dto.CreateMatchRequestDTO;
import com.sports.sportsmatch.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class MatchServiceImpl implements MatchService {
    private final MatchRepository matchRepository;
    private final PlayerRepository playerRepository;

    public Object createMatch(CreateMatchRequestDTO createMatchRequestDTO) throws BadRequestException {
        Player player = playerRepository.findById(createMatchRequestDTO.getPlayerId()).orElseThrow(()-> new BadRequestException("Invalid palyer id"));
        Match match = new Match();
        match.setPlayerOfTheMatch(player);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        match.setMatchDate(LocalDate.parse(createMatchRequestDTO.getMatchDate(), dtf));
        match.setVenue(createMatchRequestDTO.getVenue());
        matchRepository.save(match);
        return match;
    }
}
