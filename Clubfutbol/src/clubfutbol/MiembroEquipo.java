/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author RoyRo
 */
public class MiembroEquipo {
    protected String ligaOrigen;
    private double salarioMensual;
    protected boolean altaMedica;
    private int minutosJugados;
    
    public MiembroEquipo(String liga){
        this.ligaOrigen = liga;
        this.altaMedica = false;
        this.minutosJugados = 0;
        this.salarioMensual = 1000;
    }
    
    public void setSalarioMenusal(double salario){
        if (salario>0){
            this.salarioMensual = salario;
        }else{
            System.out.println("Alerta... contrato invalido");
        }
        
    }//Fin Metodo set SalarioMensual
    
    private void realizarPruebasFisicas(){
    System.out.println("Realizando las pruebas fisicas");
    String[] fases = new String[]{
        "Resistencia Fisicas",
        "Fuerza",
        "Velocidad"
    };

    for (int i = 0; i < 3; i++) {
        System.out.printf("Aprobando Fase %d: %s\n",i+i,fases[i]);
    }//Fin ciclo For

            

    
    }//Fin de Metodo realizar Pruebas

    public void setSumarMinutos(int cantidad){
        if(cantidad>0){
            System.out.println("Sumando Minutos al jugador");
            this.minutosJugados +=cantidad;
            
        }
    }//Fin de metodo sumar minutos

}//fin de class
