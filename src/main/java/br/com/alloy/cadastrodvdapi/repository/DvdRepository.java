package br.com.alloy.cadastrodvdapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alloy.cadastrodvdapi.model.Dvd;

@Repository
public interface DvdRepository extends JpaRepository<Dvd, Integer> {

	
	
}
