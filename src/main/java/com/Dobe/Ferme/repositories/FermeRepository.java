package com.Dobe.Ferme.repositories;

import com.Dobe.Ferme.models.Ferme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FermeRepository extends JpaRepository <Ferme, Integer>{
}
