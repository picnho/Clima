/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clima_bogota;

/**
 *
 * @author Juan Felipe Rojas Muñoz 
 * 
 * Este código se realizo para la materia estructura de datos lineales. 
 */
import java.util.Random;
import java.util.ArrayList;
public class Climas_Bogota {

    public static void main(String[] args) {
       ArrayList<Clima_Tupla> listaTuplas = new ArrayList<Clima_Tupla>();
        int Dia = 1;
        int Semana = 1;
        int Mes = 1;
        
        
        for(int i=0;i<31;i++){
            
            int Temperatura = Temp_Aleatoreo(0,30);
            
            Clima_Tupla tupla = new Clima_Tupla(Dia,Semana,Mes,Temperatura);
             listaTuplas.add(tupla);
             Dia++;
             if(Dia == 8){
                Dia = 1;
                Semana++;
                 
             }
             if(Semana==5){
                Semana =1;
                Mes++;
             }
        }
        for (Clima_Tupla tupla : listaTuplas) {
            System.out.println("Tupla [dia=" + tupla.Dia + ", semana=" + tupla.Semana + ", mes=" + tupla.Mes + ", temperatura=" + tupla.Temperatura + "]");
        }
        
        
        
    }
    public static int Temp_Aleatoreo(int Min, int Max){
        Random Temperatura= new Random();
        
        return Temperatura.nextInt(Max - Min + 1) + Min;
        
    }
    public static class Clima_Tupla{
        public int Dia;
        public int Semana;
        public int Mes;
        public int Temperatura;
        
        public Clima_Tupla(int Dia,int Semana,int Mes,int Temperatura){
            this.Dia=Dia;
            this.Semana=Semana;
            this.Mes=Mes;
            this.Temperatura=Temperatura;
        }
        public int getDia() {
            return Dia;
        }

        public void setDia(int Dia) {
            this.Dia = Dia;
        }

        public int getSemana() {
            return Semana;
        }

        public void setSemana(int Semana) {
            this.Semana = Semana;
        }

        public int getMes() {
            return Mes;
        }

        public void setMes(int Mes) {
            this.Mes = Mes;
        }

        public double getTemperatura() {
            return Temperatura;
        }

        public void setTemperatura(int Temperatura) {
            this.Temperatura = Temperatura;
        }
        @Override
        public String toString() {
            return "Tupla [dia=" + Dia + ", semana=" + Semana + ", mes=" + Mes + ", temperatura=" + Temperatura + "]";
        }
    }
   
                                                                                                               
    
}
