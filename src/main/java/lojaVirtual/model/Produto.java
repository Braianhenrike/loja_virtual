package lojaVirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	private Long id;
	
	@Column(nullable = false)
	private String tipoUnidade;
	
	@Column(nullable = false)
	private String Nome;
	
	@Column(columnDefinition = "text", length = 2000, nullable = false)
	private String Descricao;
	
	/**Nota item nota produto - ASSOCIAR **/
	
	@Column(nullable = false)
	private Double Peso;
	
	@Column(nullable = false)
	private Double Largura;
	
	@Column(nullable = false)
	private Double Altura;

	@Column(nullable = false)
	private Double Profundidade;
	
	@Column(nullable = false)
	private BigDecimal valorVenda = BigDecimal.ZERO;
	
	@Column(nullable = false)
	private Integer QtdEstoque = 0;
	
	private Integer QtdAlertaEstoque = 0;
	
	private String LinkYoutube;
	
	private Boolean AlertaQtdEstoque = Boolean.FALSE;
	
	@Column(nullable = false)
	private Boolean Ativo = Boolean.TRUE;
	
	private Integer QtdClique = 0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Double getPeso() {
		return Peso;
	}

	public void setPeso(Double peso) {
		Peso = peso;
	}

	public Double getLargura() {
		return Largura;
	}

	public void setLargura(Double largura) {
		Largura = largura;
	}

	public Double getAltura() {
		return Altura;
	}

	public void setAltura(Double altura) {
		Altura = altura;
	}

	public Double getProfundidade() {
		return Profundidade;
	}

	public void setProfundidade(Double profundidade) {
		Profundidade = profundidade;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Integer getQtdEstoque() {
		return QtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		QtdEstoque = qtdEstoque;
	}

	public Integer getQtdAlertaEstoque() {
		return QtdAlertaEstoque;
	}

	public void setQtdAlertaEstoque(Integer qtdAlertaEstoque) {
		QtdAlertaEstoque = qtdAlertaEstoque;
	}

	public String getLinkYoutube() {
		return LinkYoutube;
	}

	public void setLinkYoutube(String linkYoutube) {
		LinkYoutube = linkYoutube;
	}

	public Boolean getAlertaQtdEstoque() {
		return AlertaQtdEstoque;
	}

	public void setAlertaQtdEstoque(Boolean alertaQtdEstoque) {
		AlertaQtdEstoque = alertaQtdEstoque;
	}
	public Boolean getAtivo() {
		return Ativo;
	}
	
	public void setAtivo(Boolean ativo) {
		Ativo = ativo;
	}

	public Integer getQtdClique() {
		return QtdClique;
	}

	public void setQtdClique(Integer qtdClique) {
		QtdClique = qtdClique;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
