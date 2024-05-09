package com.sports.sportsmatch.service;

import com.sports.sportsmatch.model.dto.CreateMatchRequestDTO;
import org.apache.coyote.BadRequestException;

public interface MatchService {
    public Object createMatch(CreateMatchRequestDTO createMatchRequestDTO) throws BadRequestException;
}
