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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "vd_cp_loja_virt")
@SequenceGenerator(name = "seq_vd_cp_loja_virt", sequenceName = "seq_vd_cp_loja_virt", allocationSize = 1, initialValue = 1)
public class VendaCompraLojaVirtual implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "endereco_entrega_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_entrega_fk"))
	private Endereco ederecoEntrega;

	@ManyToOne
	@JoinColumn(name = "endereco_cobranca_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_cobranca_fk"))
	private Endereco ederecoCobranca;

	@Column(nullable = false)
	private BigDecimal ValorTotal;

	private BigDecimal ValorDesconto;

	@ManyToOne
	@JoinColumn(name = "forma_pagamento_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "forma_pagamento_fk"))
	private FormaPagamento formaPagamento;

	@OneToOne
	@JoinColumn(name = "nota_fiscal_venda_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_venda_fk"))
	private NotaFiscalVenda notaficaFiscalVenda;

	@ManyToOne
	@JoinColumn(name = "cup_desc_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "cup_desc_fk"))
	private VendaCompraLojaVirtual vendaCompraLojaVirtual;

	@Column(nullable = false)
	private BigDecimal ValorFrete;

	@Column(nullable = false)
	private Integer DiasEntrega;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date DataVenda;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date DataEntrega;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEderecoEntrega() {
		return ederecoEntrega;
	}

	public void setEderecoEntrega(Endereco ederecoEntrega) {
		this.ederecoEntrega = ederecoEntrega;
	}

	public Endereco getEderecoCobranca() {
		return ederecoCobranca;
	}

	public void setEderecoCobranca(Endereco ederecoCobranca) {
		this.ederecoCobranca = ederecoCobranca;
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

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public NotaFiscalVenda getNotaficaFiscalVenda() {
		return notaficaFiscalVenda;
	}

	public void setNotaficaFiscalVenda(NotaFiscalVenda notaficaFiscalVenda) {
		this.notaficaFiscalVenda = notaficaFiscalVenda;
	}

	public VendaCompraLojaVirtual getVendaCompraLojaVirtual() {
		return vendaCompraLojaVirtual;
	}

	public void setVendaCompraLojaVirtual(VendaCompraLojaVirtual vendaCompraLojaVirtual) {
		this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
	}

	public BigDecimal getValorFrete() {
		return ValorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		ValorFrete = valorFrete;
	}

	public Integer getDiasEntrega() {
		return DiasEntrega;
	}

	public void setDiasEntrega(Integer diasEntrega) {
		DiasEntrega = diasEntrega;
	}

	public Date getDataVenda() {
		return DataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		DataVenda = dataVenda;
	}

	public Date getDataEntrega() {
		return DataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		DataEntrega = dataEntrega;
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
		VendaCompraLojaVirtual other = (VendaCompraLojaVirtual) obj;
		return Objects.equals(id, other.id);
	}

}
