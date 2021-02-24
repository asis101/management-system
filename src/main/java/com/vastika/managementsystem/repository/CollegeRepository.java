package com.vastika.managementsystem.repository;

import com.vastika.managementsystem.model.College;

import java.util.List;

public interface CollegeRepository {

    void saveCollege(College college);

    void updateCollege(College college);

    void deleteCollege(int id);

    College getCollegeById(int id);

    List<College> getAllCollege();

}
