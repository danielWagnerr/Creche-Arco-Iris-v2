package br.com.tis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tis.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{

}
