package br.com.exiti.cadastro.hospital.entity.paciente;

import br.com.exiti.cadastro.hospital.entity.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String CPF,
        @NotBlank
        @Valid
        DadosCadastroEndereco endereco) {
}
