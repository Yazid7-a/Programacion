/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum  Continentes{
    
    AFRICA(1, 300),
    ASIA(6, 5077),
    NORTEAMERICA(45, 3000),
    LATAM(54, 7000),
    OCEANIA(7, 9000),
    ANTARTIDA(35, 1000);
    
    private final int ContNum;
    private final int Superficie;

            
    Continentes(int ContNum, int Superficie) {
      this.ContNum = ContNum;
      this.Superficie = Superficie;
      
   }
    
       public int getNum() {
      return ContNum;
   }

    public int getSuperficie() {
        return Superficie;
    }

    
}
