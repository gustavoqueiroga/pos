DECLARE v_qt_ocorrencias NUMBER;
  BEGIN
     SELECT COUNT(*) INTO v_qt_ocorrencias  FROM T07_UNIDADE FILHO WHERE FILHO.T07_SIGLA_UNIDADE = 'PSFN/IPA/MG';
     IF v_qt_ocorrencias = 0 THEN
           INSERT INTO XAGU_ESTRUTURA.T07_UNIDADE (
           T07_ID_UNIDADE,
           T07_COD_ORGAO,
           T07_NOME_UNIDADE  ,
           T07_SIGLA_UNIDADE ,
           T07_COD_MUNICIPIO ,
           T07_SN_REGIMENTAL ,
           T07_COD_RELACAO_ESTRUTURA_AGU ,
           T07_SN_ATIVA ,
           T07_NUM_CPF_OPERADOR ,
           T07_DT_CRIACAO_UNIDADE,
           T07_CONT_COMP_TERR_SN)
           VALUES (SQ_T07_UNIDADE.NEXTVAL,
              17000,
                  'PROC SECCIONAL FAZ NACIONAL/IPATINGA/MG',
                  'PSFN/IPA/MG',
                  3131307,
                  'N',
                  98,
                  'S',
                  '24769533187',
                  SYSDATE,
                  'N');
        COMMIT;
     END IF;
	 
	 delete from T80_HIERARQUIA t where t.t80_cod_tipo_hierarquia = 11 and t.t80_cod_unidade = 449 and t. t80_h05 = 0;
	 commit;
  END;


