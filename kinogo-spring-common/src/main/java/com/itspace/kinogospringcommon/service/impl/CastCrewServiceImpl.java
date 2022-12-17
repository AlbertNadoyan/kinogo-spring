package com.itspace.kinogospringcommon.service.impl;

import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.CastCrew;
import com.itspace.kinogospringcommon.repository.CastCrewRepository;
import com.itspace.kinogospringcommon.service.CastCrewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class CastCrewServiceImpl implements CastCrewService {
    private final CastCrewRepository castCrewRepository;

    @Override
    public List<CastCrew> getAll() {
        log.info("Get all cast and crew data.");
        return castCrewRepository.findAll();
    }

    @Override
    public Optional<CastCrew> getById(int id) {
        log.info("Get cast and crew data by id.");
        return castCrewRepository.findById(id);
    }

    @Override
    public List<CastCrew> findAllById(int id){
        List<CastCrew> allById = castCrewRepository.findAllById(id);
        if(allById.isEmpty()){
            log.error("Invalid cast and crew id.");
        }
        log.info("Get all cast and crew data by id.");
        return allById;
    }

    @Override
    public List<CastCrew> findTop20ByOrderByIdDesc() {
        return castCrewRepository.findTop20ByOrderByIdDesc();
    }

    @Override
    public int count() {
        log.info("Count cast and crew data.");
        return (int) castCrewRepository.count();
    }
}
