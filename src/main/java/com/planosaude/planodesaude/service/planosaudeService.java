package com.planosaude.planodesaude.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.planosaude.planodesaude.entity.plano;
import com.planosaude.planodesaude.repository.planoSaudeRepository;

@Service
public class planosaudeService {
    private planoSaudeRepository planoSaudeRepository;

    
   public planosaudeService(com.planosaude.planodesaude.repository.planoSaudeRepository planoSaudeRepository) {
        this.planoSaudeRepository = planoSaudeRepository;
    }
public List<plano> create(plano plano){
    planoSaudeRepository.save(plano);
    return list();
    }
   public List <plano> list (){
    Sort sort = Sort.by("prioridade").descending().and(
        Sort.by("dataInclusao").descending()
    );
   return planoSaudeRepository.findAll();
    }

   public List<plano> update(plano plano){
    planoSaudeRepository.save(plano);
    return list();
    }

   public List<plano> delete(Long id){
    planoSaudeRepository.deleteById(id);
    return list();
    }

}
