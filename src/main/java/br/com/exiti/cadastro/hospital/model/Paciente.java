package br.com.exiti.cadastro.hospital.model;

import br.com.exiti.cadastro.hospital.entity.paciente.DadosAtualizarPaciente;
import br.com.exiti.cadastro.hospital.entity.paciente.DadosCadastroPaciente;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "paciente")
@Table(name = "pacientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Embedded
    private Endereco endereco;
    private boolean ativo;

    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.CPF();
        this.endereco = new Endereco(dados.endereco());
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizarPaciente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            endereco.atualizarInformacoesEndereco(dados.endereco());
        }
    }

    public void desativar() {
        this.ativo = false;
    }
}
