package br.com.exiti.cadastro.hospital.controller;

import br.com.exiti.cadastro.hospital.entity.medico.DadosCadastroMedico;
import br.com.exiti.cadastro.hospital.entity.medico.MedicoRepository;
import br.com.exiti.cadastro.hospital.model.Endereco;
import br.com.exiti.cadastro.hospital.model.Medico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}
