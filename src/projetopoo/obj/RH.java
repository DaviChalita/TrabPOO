package projetopoo.obj;

import java.util.*;

public class RH {
    private static final List<Funcionario> quadroFuncionarios = new ArrayList<>();
  
    static public void contratar(Funcionario f){
         quadroFuncionarios.add(f);
    }
    
    static public void demitir(String cpf) {        
        for(Funcionario f : quadroFuncionarios){
            if((f.getCpf()).equals(cpf)){
                quadroFuncionarios.remove(f);
            }
        }
    }
    
    static public Funcionario recuperar(String cpf) {
        for(Funcionario f : quadroFuncionarios) {
            if((f.getCpf()).equals(cpf)) {
                return f;
            }
        }
        return null;
    }
}