package com.miraouy.Repository;

import com.miraouy.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepo extends JpaRepository<Inscription,Long> {
}
