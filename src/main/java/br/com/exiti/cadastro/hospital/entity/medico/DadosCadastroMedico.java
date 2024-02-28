package br.com.exiti.cadastro.hospital.entity.medico;

import br.com.exiti.cadastro.hospital.entity.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String CRM,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosCadastroEndereco endereco) {
}
