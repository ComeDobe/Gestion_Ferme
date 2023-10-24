package com.Dobe.Ferme.repositories;

import com.Dobe.Ferme.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository <Employe, Integer> {
}
