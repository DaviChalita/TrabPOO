package projetopoo.obj;

import java.util.*;

public class RH {
    private List<Funcionario> quadroFuncionarios = new ArrayList();
    
    public void contratar(Funcionario funcionario){
         quadroFuncionarios.add(funcionario);
    }
    
    public boolean demitir(String cpf) {
        for(Funcionario f : quadroFuncionarios){
            if(!f.equals(null) && f.getCpf() == cpf){
                quadroFuncionarios.remove(f);
                return true;
            }
        }
        return false;
    }
}