package com.itspace.kinogospringweb.controller;

import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.CastCrew;
import com.itspace.kinogospringcommon.service.CastCrewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class CastCrewController {

    private final CastCrewService castCrewService;


    @GetMapping("/castcrew")
    public String getAllCastCrew(ModelMap modelMap){
        List<CastCrew> allCastCrew = castCrewService.getAll();
        int countCastCrew = castCrewService.count();
        modelMap.addAttribute("allCastCrew",allCastCrew);
        modelMap.addAttribute("castCrew", countCastCrew);
        return "celebritygrid01";
    }

    @GetMapping("/castcrew/{id}")
    public String getCastCrew(@PathVariable("id") int id, ModelMap modelMap) throws EntityNotFoundException {
        List<CastCrew> allById = castCrewService.findAllById(id);
        modelMap.addAttribute("getByIdCast", allById);
        return "celebritysingle";
    }

}
