package net.kelompok1.springboot.crudrestfulwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.kelompok1.springboot.crudrestfulwebservice.model.kelompok1;

@Repository
public interface Kelompok1Repository extends JpaRepository<kelompok3, Long>{

}
