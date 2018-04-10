package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by android on 09/04/2018.
 */

public class datos {
    private static ArrayList<persona> personas= new ArrayList<>();

    public static void guardar(persona p){
        personas.add(p);
    }
    public static ArrayList<persona> obtener(){
        return personas;
    }
}
