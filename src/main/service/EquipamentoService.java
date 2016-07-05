package main.service;

import main.service.Conexao;
import main.model.Equipamento;

import java.sql.SQLException;


public class EquipamentoService extends Conexao {

    public EquipamentoService(){
        super();
    }

    public int insert(Equipamento equipamento){
        int cont =1;
        this.setPreparedStatement("INSERT INTO equipamento (patrimonio, nome, descricao, local_uso, marca) VALUES (?,?,?,?,?)");
        this.getPreparedStatement().setLong(cont++, equipamento.getPatrimonio());
        this.getPreparedStatement().setString(cont++, equipamento.getNome());
        this.getPreparedStatement().setString(cont++, equipamento.getDescricao());
        this.getPreparedStatement().setString(cont++, equipamento.getLocalDeUso());
        this.getPreparedStatement().setString(cont++, equipamento.getMarca());
        int retorno = this.getPreparedStatement().executeUpdate();
        this.getPreparedStatement().close();
        return retorno;
    }

    public Equipamento findById(int pk) throws SQLException {
        Equipamento equipamento = new Equipamento();
        this.setPreparedStatement(" SELECT id, patrimonio, nome, descricao, local_uso, marca  FROM equipamento WHERE id = ?");
        this.getPreparedStatement().setInt(1, pk);
        this.setResultSet(getPreparedStatement().executeQuery());
        while (this.getResultSet().next()) {
            equipamento.setId(getResultSet().getLong("id"));
            equipamento.setPatrimonio(getResultSet().getLong("patrimonio"));
            equipamento.setNome(getResultSet().getString("nome"));
            equipamento.setDescricao(getResultSet().getString("descricao"));
            equipamento.setLocalDeUso(getResultSet().getString("local_uso"));
            equipamento.setMarca(getResultSet().getString("marca"));
        }
        this.getPreparedStatement().close();
        return equipamento;
    }

}
