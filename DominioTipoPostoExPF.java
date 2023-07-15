package br.gov.mj.desarmamento.dominio;

public enum DominioTipoPostoExPF {

	EXERCITO("E", "Ex�rcito."), 
	DPF("P", "Policia Federal."), 
	;

	DominioTipoPostoExPF(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private String codigo;
	private String descricao;

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
