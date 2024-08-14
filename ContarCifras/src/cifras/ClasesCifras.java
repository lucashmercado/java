/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifras;

/**
 *
 * @author Administrador
 */
public class ClasesCifras {
    private  int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public ClasesCifras(int valor){
        this.num=valor;
    }
    
    public String cifra(){
        int valor= this.num;
        var c1=(String.valueOf(valor));
        
        if (c1.length()==5){
            return "tiene 5 cifras";
        }
        if (c1.length()==4){
            return "tiene 4";
        }
        if (c1.length()==3){
            return "tiene 3";
        }
        if (c1.length()==2){
            return "tiene 2";
        }
        if (c1.length()==1){
            return "tiene 1";
        } else{
          return "ERROR";  
        }
        
    }
}
