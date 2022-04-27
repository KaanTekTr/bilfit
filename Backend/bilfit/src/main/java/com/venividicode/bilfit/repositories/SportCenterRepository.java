package com.venividicode.bilfit.repositories;

import com.venividicode.bilfit.models.SportCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportCenterRepository extends JpaRepository<SportCenter, Long> {
    //TODO
}
