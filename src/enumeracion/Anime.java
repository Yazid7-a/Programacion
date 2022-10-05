/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum Anime {
    
Shôjo(456),

Shônen(1246),

Seinen(865),

Mecha(768),

MagicalGirls(658),

Kodomo(677);
    
    private final int NumAnimes;

    private Anime(int NumAnimes) {
        this.NumAnimes = NumAnimes;
    }

    public int getNumAnimes() {
        return NumAnimes;
    }

    
    
}
