package br.com.pessoal.portifolio.repository;

import br.com.pessoal.portifolio.model.Desenvolvedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesenvolvedorRepository extends JpaRepository<Desenvolvedor, Long> {
}
