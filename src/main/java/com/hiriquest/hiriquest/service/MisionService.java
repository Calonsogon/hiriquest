package com.hiriquest.hiriquest.service;

import com.hiriquest.hiriquest.model.Mision;
import com.hiriquest.hiriquest.repository.MisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MisionService {
    @Autowired
    private MisionRepository misionRepository;

    public List<Mision> getAllMisiones() {
        return misionRepository.findAll();
    }

   public Mision getMisionById(Long id) {
        return misionRepository.findById(id).orElse(null);
    }

    public Mision createMision(Mision mision) {
        return misionRepository.save(mision);
    }

    public Mision updateMision(Long id, Mision mision) {
        if (misionRepository.existsById(id)) {
            mision.setId(id);
            return misionRepository.save(mision);
        }
        return null;
    }

    public void deleteMision(Long id) {
        misionRepository.deleteById(id);
    }

    
}
