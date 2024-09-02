package com.mycompany.bilingualchatbot;

import java.util.HashMap;
import java.util.Scanner;

public class BilingualChatbot {
    public static HashMap<String, String> obtenerTextos(String idioma){
        HashMap<String, String> mensajesESP = new HashMap<>();
        mensajesESP.put("Saludo", "Hola");
        mensajesESP.put("PreguntaNombre", "Cómo es tu nombre?");
        mensajesESP.put("PreguntaEdad", "Cuál es tu edad?");
        mensajesESP.put("muestraNombre", "Tu nombre es ");
        mensajesESP.put("muestraEdad", "Tu edad es ");
        
        HashMap<String, String> mensajesENG = new HashMap<>();
        mensajesENG.put("Saludo", "Hi");
        mensajesENG.put("PreguntaNombre", "What is your name?");
        mensajesENG.put("PreguntaEdad", "How old are you?");
        mensajesENG.put("muestraNombre", "Your name is ");
        mensajesENG.put("muestraEdad", "Your age is ");
        
        switch (idioma) {
            case "Espanol":
                return mensajesESP;
            case "English":
                return mensajesENG;
        }
        return null;
    }
    

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Selecciona el idioma / Select the language");
        String idioma = lector.next();
        
        HashMap<String, String> textos = obtenerTextos(idioma);
        
        System.out.println(textos.get("Saludo"));
        System.out.println(textos.get("PreguntaNombre"));
        String nombre = lector.next();
        System.out.println(textos.get("PreguntaEdad"));
        int edad = lector.nextInt();
        System.out.println(textos.get("muestraNombre") + nombre);
        System.out.println(textos.get("muestraEdad") + edad);
    }
}
