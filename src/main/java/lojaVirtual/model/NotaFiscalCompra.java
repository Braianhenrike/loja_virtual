package lojaVirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "nota_fiscal_compra")
@SequenceGenerator(name = "seq_nota_fiscal_compra", sequenceName = "seq_nota_fiscal_compra", allocationSize = 1, initialValue = 1)
public class NotaFiscalCompra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_compra")
	private Long id;

	@Column(nullable = false)
	private String NumeroNota;

	@Column(nullable = false)
	private String SerieNota;

	private String DescricaoObs;

	@Column(nullable = false)
	private BigDecimal ValorTotal;

	private BigDecimal ValorDesconto;

	@Column(nullable = false)
	private BigDecimal ValorIcms;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date DateCompra;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "conta_pagar_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk"))
	private ContaPagar contaPagar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroNota() {
		return NumeroNota;
	}

	public void setNumeroNota(String numeroNota) {
		NumeroNota = numeroNota;
	}

	public String getSerieNota() {
		return SerieNota;
	}

	public void setSerieNota(String serieNota) {
		SerieNota = serieNota;
	}

	public String getDescricaoObs() {
		return DescricaoObs;
	}

	public void setDescricaoObs(String descricaoObs) {
		DescricaoObs = descricaoObs;
	}

	public BigDecimal getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		ValorTotal = valorTotal;
	}

	public BigDecimal getValorDesconto() {
		return ValorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		ValorDesconto = valorDesconto;
	}

	public BigDecimal getValorIcms() {
		return ValorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		ValorIcms = valorIcms;
	}

	public Date getDateCompra() {
		return DateCompra;
	}

	public void setDateCompra(Date dateCompra) {
		DateCompra = dateCompra;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public ContaPagar getContaPagar() {
		return contaPagar;
	}

	public void setContaPagar(ContaPagar contaPagar) {
		this.contaPagar = contaPagar;
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
		NotaFiscalCompra other = (NotaFiscalCompra) obj;
		return Objects.equals(id, other.id);
	}

}
