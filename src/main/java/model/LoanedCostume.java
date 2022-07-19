/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Kell
 */
public class LoanedCostume {
    private String id, idCostume, idLoanSlipl;
    private String name;
    private Date loandDate, returnDate;
    private float unitPrice, deposit, subTotal;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCostume() {
        return idCostume;
    }

    public void setIdCostume(String idCostume) {
        this.idCostume = idCostume;
    }

    public String getIdLoanSlipl() {
        return idLoanSlipl;
    }

    public void setIdLoanSlipl(String idLoanSlipl) {
        this.idLoanSlipl = idLoanSlipl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLoandDate() {
        return loandDate;
    }

    public void setLoandDate(Date loandDate) {
        this.loandDate = loandDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
