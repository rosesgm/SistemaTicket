/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.sistematicket.enums;

import com.google.gson.annotations.SerializedName;

/**
 *Estatus del ticket, un ticket por default se crea abierto, un ticket cerrado ya no se puede modificar.
 * @author rosagabriela
 */
public enum Status {
     @SerializedName("abierto") ABIERTO,
     @SerializedName("en_progreso") EN_PROGRESO,
     @SerializedName("cerrado") CERRADO
}
