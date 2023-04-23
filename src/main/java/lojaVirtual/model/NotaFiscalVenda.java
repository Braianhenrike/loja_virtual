package lojaVirtual.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "nota_fiscal_venda")
@SequenceGenerator(name = "seq_nota_fiscal_venda", sequenceName = "seq_nota_fiscal_venda", allocationSize = 1, initialValue = 1)
public class NotaFiscalVenda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_venda")
	private Long id;

	@Column(nullable = false)
	private String Numero;

	@Column(nullable = false)
	private String Seria;

	@Column(nullable = false)
	private String Tipo;

	@Column(columnDefinition = "text", nullable = false)
	private String Xml;

	@Column(columnDefinition = "text", nullable = false)
	private String Pdf;
	

	@OneToOne
	@JoinColumn(name = "vd_cp_loja_virt_id", nullable = false, foreignKey = 
	@ForeignKey(value = ConstraintMode.CONSTRAINT, name = "vd_cp_loja_virt_fk"))
	private VendaCompraLojaVirtual vendaCompraLojaVirtual;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getSeria() {
		return Seria;
	}

	public void setSeria(String seria) {
		Seria = seria;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getXml() {
		return Xml;
	}

	public void setXml(String xml) {
		Xml = xml;
	}

	public String getPdf() {
		return Pdf;
	}

	public void setPdf(String pdf) {
		Pdf = pdf;
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
		NotaFiscalVenda other = (NotaFiscalVenda) obj;
		return Objects.equals(id, other.id);
	}

}
