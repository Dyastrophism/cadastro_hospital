package br.com.exiti.cadastro.hospital.entity.paciente;

import br.com.exiti.cadastro.hospital.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
