package com.vastika.managementsystem.service;

import com.vastika.managementsystem.model.College;
import com.vastika.managementsystem.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public void saveCollege(College college) {
        collegeRepository.saveCollege(college);
    }

    @Override
    public void updateCollege(College college) {
        collegeRepository.updateCollege(college);
    }

    @Override
    public void deleteCollege(int id) {
        collegeRepository.deleteCollege(id);
    }

    @Override
    public College getCollegeById(int id) {
        return collegeRepository.getCollegeById(id);
    }

    @Override
    public List<College> getAllCollege() {
        return collegeRepository.getAllCollege();
    }
}
