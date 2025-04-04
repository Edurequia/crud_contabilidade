package com.dudu.crud_contabilidade.repositories;

import com.dudu.crud_contabilidade.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
