/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.sistematicket.enums;

import com.google.gson.annotations.SerializedName;

/**
 *Las prioridades que puede tener un ticket
 * 
 * @author rosagabriela
 */
public enum Priority {
    @SerializedName("alta") ALTA,
    @SerializedName("media") MEDIA,
    @SerializedName("baja") BAJA
}
