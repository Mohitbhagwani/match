package com.sports.sportsmatch.controller;

import com.sports.sportsmatch.model.dto.CreateMatchRequestDTO;
import com.sports.sportsmatch.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService matchService;
    @PostMapping("match")
    public Object createMatch(@RequestBody CreateMatchRequestDTO createMatchRequestDTO) throws Exception {
        return ResponseEntity.ok().body(matchService.createMatch(createMatchRequestDTO));
    }

}
