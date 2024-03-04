package br.com.exiti.cadastro.hospital.entity.medico;

import br.com.exiti.cadastro.hospital.entity.endereco.DadosCadastroEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosCadastroEndereco endereco) {
}
