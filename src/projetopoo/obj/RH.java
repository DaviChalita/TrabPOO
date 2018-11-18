package projetopoo.obj;

import java.util.*;

public class RH {
    private static final List<Funcionario> quadroFuncionarios = new ArrayList<>();
  
    public void contratar(Funcionario f){
         quadroFuncionarios.add(f);
    }    
    
    public void demitir(String cpf) {
        Funcionario f = recuperar(cpf);
        
        if (f != null) 
            quadroFuncionarios.remove(f);        
    }
    
    public Funcionario recuperar(String cpf) {
        for(Funcionario f : quadroFuncionarios) {
            if(f.getCpf().equals(cpf))
                System.out.println(f.getNome());
                return f;            
        }
        
        return null;
    }
}
