/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.sistematicket.entities;

import java.util.List;

/**
 *Es lo que regresa la API cuando pides la lista de tickets o sea un GET
 * lo regresa como JSON
 * @author rosagabriela
 */
public class TicketListResponse {

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the data
     */
    public List<Ticket> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<Ticket> data) {
        this.data = data;
    }
    private boolean success;
    private String message;
    private List<Ticket> data ;
}
