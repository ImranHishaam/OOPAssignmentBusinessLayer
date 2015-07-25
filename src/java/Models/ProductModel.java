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
public class ProductModel {
    
    private int pro_id;
    
    private String pro_name;
    
    private String pro_description;
    
    private int supplier_id;

    /**
     * @return the pro_id
     */
    public int getPro_id() {
        return pro_id;
    }

    /**
     * @param pro_id the pro_id to set
     */
    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    /**
     * @return the pro_name
     */
    public String getPro_name() {
        return pro_name;
    }

    /**
     * @param pro_name the pro_name to set
     */
    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    /**
     * @return the pro_description
     */
    public String getPro_description() {
        return pro_description;
    }

    /**
     * @param pro_description the pro_description to set
     */
    public void setPro_description(String pro_description) {
        this.pro_description = pro_description;
    }

    /**
     * @return the supplier_id
     */
    public int getSupplier_id() {
        return supplier_id;
    }

    /**
     * @param supplier_id the supplier_id to set
     */
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
  
}