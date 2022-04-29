package com.venividicode.bilfit.repositories;

import com.venividicode.bilfit.models.GymMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymMemberRepository extends JpaRepository<GymMember, Long> {

    public List<GymMember> findById(long id);
    public GymMember deleteById(long id);
    public List<GymMember> findByName(String name);
}
