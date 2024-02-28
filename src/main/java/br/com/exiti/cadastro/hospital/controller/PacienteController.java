package br.com.exiti.cadastro.hospital.controller;

import br.com.exiti.cadastro.hospital.entity.paciente.DadosCadastroPaciente;
import br.com.exiti.cadastro.hospital.entity.paciente.PacienteRepository;
import br.com.exiti.cadastro.hospital.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }
}
