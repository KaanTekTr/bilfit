package com.venividicode.bilfit.repositories;

import com.venividicode.bilfit.model.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository  extends JpaRepository<Field, Long> {
    //TODO
}
