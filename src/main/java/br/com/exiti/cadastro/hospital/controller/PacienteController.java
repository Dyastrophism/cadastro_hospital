package br.com.exiti.cadastro.hospital.controller;

import br.com.exiti.cadastro.hospital.entity.paciente.DadosCadastroPaciente;
import br.com.exiti.cadastro.hospital.entity.paciente.DadosListagemPacientes;
import br.com.exiti.cadastro.hospital.entity.paciente.PacienteRepository;
import br.com.exiti.cadastro.hospital.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping
    public Page<DadosListagemPacientes> listagemPacientes(@PageableDefault(size = 3, sort = {"nome"}) Pageable page){
        return repository.findAll(page).map(DadosListagemPacientes::new);
    }
}
