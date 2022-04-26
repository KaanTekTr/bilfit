package com.venividicode.bilfit.repositories;

import com.venividicode.bilfit.model.TournamentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRegistrationRepository extends JpaRepository<TournamentRegistration, Long>
{
    //TODO
}
