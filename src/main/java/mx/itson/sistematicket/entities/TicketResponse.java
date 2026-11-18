/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.sistematicket.entities;

/**
 *
 * @author rosagabriela
 */
public class TicketResponse {

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
    public Ticket getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Ticket data) {
        this.data = data;
    }
    private boolean success;
    private String message;
    private Ticket data;
}
