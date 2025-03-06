package com.example.capstoneback.Repository;

import com.example.capstoneback.Entity.MultiFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiFileRepository extends JpaRepository<MultiFile, Long> {
}
