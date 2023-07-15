package br.gov.mj.desarmamento.dominio;

public enum DominioValorIndenizacao {

	CEM("100,00", "(cem reais)"), 
	DUZENTOS("200,00", "(duzentos reais)"), 
	TREZENTOS("300,00", "(trezentos reais)")
	;

	DominioValorIndenizacao(String valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	private String valor;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public String getValor() {
		return valor;
	}
	
	public static String getValorIndenizacao(String valor){
        for (DominioValorIndenizacao o : DominioValorIndenizacao.values() ) {
            if (valor.equalsIgnoreCase(o.getValor())) {
                return o.getDescricao();
            }
        }
        return null;
    } 
}
