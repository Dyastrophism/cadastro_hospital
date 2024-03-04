package br.com.exiti.cadastro.hospital.entity.medico;

import br.com.exiti.cadastro.hospital.model.Medico;

public record DadosListagemMedicos(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
