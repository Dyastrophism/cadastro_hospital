package br.com.exiti.cadastro.hospital.entity.paciente;

import br.com.exiti.cadastro.hospital.model.Paciente;

public record DadosListagemPacientes(String nome, String email, String cpf) {

    public DadosListagemPacientes(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
