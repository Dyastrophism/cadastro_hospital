package br.com.exiti.cadastro.hospital.entity.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEndereco(
        @NotBlank
        String logradouro,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String UF,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String CEP) {
}
