/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Imran
 */
public class StockModel {
    
    private int stc_id;
    
    private int stc_pro_id;
    
    private int stc_qty;
    
    private String stc_expire_date;
    
    private String stc_add_date;

    /**
     * @return the stc_id
     */
    public int getStc_id() {
        return stc_id;
    }

    /**
     * @param stc_id the stc_id to set
     */
    public void setStc_id(int stc_id) {
        this.stc_id = stc_id;
    }

    /**
     * @return the stc_pro_id
     */
    public int getStc_pro_id() {
        return stc_pro_id;
    }

    /**
     * @param stc_pro_id the stc_pro_id to set
     */
    public void setStc_pro_id(int stc_pro_id) {
        this.stc_pro_id = stc_pro_id;
    }

    /**
     * @return the stc_qty
     */
    public int getStc_qty() {
        return stc_qty;
    }

    /**
     * @param stc_qty the stc_qty to set
     */
    public void setStc_qty(int stc_qty) {
        this.stc_qty = stc_qty;
    }

    /**
     * @return the stc_expire_date
     */
    public String getStc_expire_date() {
        return stc_expire_date;
    }

    /**
     * @param stc_expire_date the stc_expire_date to set
     */
    public void setStc_expire_date(String stc_expire_date) {
        this.stc_expire_date = stc_expire_date;
    }

    /**
     * @return the stc_add_date
     */
    public String getStc_add_date() {
        return stc_add_date;
    }

    /**
     * @param stc_add_date the stc_add_date to set
     */
    public void setStc_add_date(String stc_add_date) {
        this.stc_add_date = stc_add_date;
    }
      
}