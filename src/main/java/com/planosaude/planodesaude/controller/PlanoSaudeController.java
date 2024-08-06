package com.planosaude.planodesaude.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planosaude.planodesaude.entity.plano;
import com.planosaude.planodesaude.service.planosaudeService;

@RestController
@RequestMapping("/planos")
public class PlanoSaudeController {
    private planosaudeService planosaudeService;
    

    public PlanoSaudeController(com.planosaude.planodesaude.service.planosaudeService planosaudeService) {
        this.planosaudeService = planosaudeService;
    }

    @PostMapping
    List<plano> create (@RequestBody plano plano) {
        return planosaudeService.create(plano);
    }

    @GetMapping
    List<plano> list (){
        return planosaudeService.list();
    }

    @PutMapping
    List<plano> update(@RequestBody plano plano){
        return planosaudeService.update(plano);
    }

    @DeleteMapping("{id}")
    List<plano> delete(@PathVariable ("id") Long id){
        return planosaudeService.delete(id);
    }

    
}
