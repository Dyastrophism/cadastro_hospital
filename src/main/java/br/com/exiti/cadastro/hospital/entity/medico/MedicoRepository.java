package br.com.exiti.cadastro.hospital.entity.medico;

import br.com.exiti.cadastro.hospital.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
