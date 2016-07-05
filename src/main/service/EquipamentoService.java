package main.service;

import main.service.Conexao;
import main.model.Equipamento;


public class EquipamentoService extends Conexao {

    public EquipamentoService(){
        super();
    }

/*    public int insert(Equipamento equipamento){
        int cont =1;
        this.setPreparedStatement("INSERT INTO equipamento (patrimonio, nome, descricao, local_uso, marca) VALUES (?,?,?,?,?)");
        this.getPreparedStatement().setLong(cont++, equipamento.getNome());
        this.getPreparedStatement().setString(cont++, especieBO.getNomeCientifico());
        this.getPreparedStatement().setInt(cont++, especieBO.getStatus());
        int retorno = this.getPreparedStatement().executeUpdate();
        this.getPreparedStatement().close();
        return retorno;
    }

    public EspecieBO findById(int pk) throws SQLException {
        EspecieBO especieBO = new EspecieBO();
        this.setPreparedStatement(" SELECT id, patrimonio, nome, descricao, local_uso, marca  FROM equipamento WHERE id = ?");
        this.getPreparedStatement().setInt(1, idEspecia);
        this.setResultSet(getPreparedStatement().executeQuery());
        while (this.getResultSet().next()) {
            especieBO.setIdEspecie(getResultSet().getInt("id_especie"));
            especieBO.setNomeSimplificado(getResultSet().getString("nome_simplificado"));
            especieBO.setNomeCientifico(getResultSet().getString("nome_cientifico"));
        }
        this.getPreparedStatement().close();
        return especieBO;
    }*/

}
