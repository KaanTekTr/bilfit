package com.venividicode.bilfit.repositories;

import com.venividicode.bilfit.models.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldRepository  extends JpaRepository<Field, Long> {
    public List<Field> findById(long id);
    public Field deleteById(long id);
    //findByActivity
    //findByName
}
