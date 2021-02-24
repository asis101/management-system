package com.vastika.managementsystem.service;

import com.vastika.managementsystem.model.College;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CollegeService {

    void saveCollege(College college);

    void updateCollege(College college);

    void deleteCollege(int id);

    College getCollegeById(int id);

    List<College> getAllCollege();
}
