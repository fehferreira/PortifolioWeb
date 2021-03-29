package br.com.pessoal.portifolio.repository;

import br.com.pessoal.portifolio.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
