package entidades;

public class Produto {

	private Integer codigo;
	private Double valorUnit;
	private Integer quantidade;
	private Double ipi;
	
	public Produto() {
	}

	public Produto(Integer codigo, Double valorUnit, Integer quantidade, Double ipi) {
		this.codigo = codigo;
		this.valorUnit = valorUnit;
		this.quantidade = quantidade;
		this.ipi = ipi;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getIpi() {
		return ipi;
	}

	public void setIpi(Double ipi) {
		this.ipi = ipi;
	}
	
	public double valorAtual() {
		return valorUnit * (1 + ipi/100) * quantidade;
	}

	public String toString() {
		return "Código: " + codigo
				+ " - Valor unitário: $"
				+ valorUnit
				+ " - Quantidade: "
				+ quantidade
				+ " - Valor com imposto atualizado: "
				+ valorAtual();
	}
	
	
}
