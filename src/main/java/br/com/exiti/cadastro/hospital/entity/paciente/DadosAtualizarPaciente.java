package br.com.exiti.cadastro.hospital.entity.paciente;

import br.com.exiti.cadastro.hospital.entity.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosCadastroEndereco endereco) {
}
