package br.com.exiti.cadastro.hospital.controller;

import br.com.exiti.cadastro.hospital.entity.medico.DadosAtualizarMedico;
import br.com.exiti.cadastro.hospital.entity.medico.DadosCadastroMedico;
import br.com.exiti.cadastro.hospital.entity.medico.DadosListagemMedicos;
import br.com.exiti.cadastro.hospital.entity.medico.MedicoRepository;
import br.com.exiti.cadastro.hospital.model.Medico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedicos> listarMedicos(@PageableDefault(size = 3, sort = {"nome"}) Pageable page) {
        return repository.findAll(page).map(DadosListagemMedicos::new);
    }

    @PutMapping
    @Transactional
    public void atualizarMedico(@RequestBody @Valid DadosAtualizarMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

}
