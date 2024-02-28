package br.com.exiti.cadastro.hospital.model;


import br.com.exiti.cadastro.hospital.entity.medico.DadosCadastroMedico;
import br.com.exiti.cadastro.hospital.entity.medico.Especialidade;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Medico")
@Table(name = "medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded // ficara numa classe separa mas considerará que os campos fazem parte da tabela medicos
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.CRM();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
