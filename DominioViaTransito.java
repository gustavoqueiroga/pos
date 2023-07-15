package br.gov.mj.desarmamento.dominio;

public enum DominioViaTransito {

	TERRESTRE(1, "Terrestre"), 
	MARITIMO(2, "Maritmo"), 
	FLUVIAL(3, "Fluvial")
	;

	DominioViaTransito(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private Integer codigo;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public Integer getCodigo() {
		return codigo;
	} 

	
	public static String getDescricao(Integer codigo){
        for (DominioViaTransito o : DominioViaTransito.values() ) {
            if (codigo.intValue() == o.getCodigo().intValue()){
                return o.getDescricao();
            }
        }
        return null;
    }


}
