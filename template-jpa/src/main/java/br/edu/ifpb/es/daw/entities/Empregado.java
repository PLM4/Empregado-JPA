package br.edu.ifpb.es.daw.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "empregado",
        uniqueConstraints = @UniqueConstraint(name = "uc_empregado__cpf", columnNames = "cpf"),
        indexes = @Index(name = "ix_empregado__cpf", columnList = "cpf"))
public class Empregado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String sobreNome;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column
    private String endereco;
    @Column
    private Character sexo;
    @Column
    private BigDecimal salario;
    @Column
    private Integer nDependentes;

    public Empregado(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Integer getnDependentes() {
        return nDependentes;
    }

    public void setnDependentes(Integer nDependentes) {
        this.nDependentes = nDependentes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return Objects.equals(cpf, empregado.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", id=" + id +
                ", endereco='" + endereco + '\'' +
                ", sexo=" + sexo + '\'' +
                ", salario=" + salario + '\'' +
                ", nDependentes=" + nDependentes +
                '}';
    }
}
