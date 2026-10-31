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

    public MiembroEquipo(String ligaOrigen) {
        this.ligaOrigen = ligaOrigen;
        this.altaMedica = false;
        this.minutosJugados = 0;
        this.salarioMensual = 1000;
    }

    public void setSalarioMensual(double salario) {
        if (salario > 0) {
            this.salarioMensual = salario;
        } else {
            System.out.println("Alerta... contrato invalido");
        }
    }

    private void realizarPruebasFisicas() {
        System.out.println("Realizando las pruebas fisicas");
        String[] fases = {"Resistencia Fisica", "Fuerza", "Velocidad"};
        for (int i = 0; i < fases.length; i++) {
            System.out.printf("Aprobando Fase %d: %s%n", i + 1, fases[i]);
        }
    }

    protected void setSumarMinutos(int cantidad) {
        if (cantidad > 0) {
            System.out.println("Sumando Minutos al jugador");
            this.minutosJugados += cantidad;
        }
    }

    public void iniciarPretemporada() {
        realizarPruebasFisicas();
        this.altaMedica = true;
    }
}
