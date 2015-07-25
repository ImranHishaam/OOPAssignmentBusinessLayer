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
public class LogModel {
    
    private int log_id;
    
    private int log_usr_id;
            
    private String log_time_stamp;
    
    private String log_function;

    /**
     * @return the log_id
     */
    public int getLog_id() {
        return log_id;
    }

    /**
     * @param log_id the log_id to set
     */
    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    /**
     * @return the log_usr_id
     */
    public int getLog_usr_id() {
        return log_usr_id;
    }

    /**
     * @param log_usr_id the log_usr_id to set
     */
    public void setLog_usr_id(int log_usr_id) {
        this.log_usr_id = log_usr_id;
    }

    /**
     * @return the log_time_stamp
     */
    public String getLog_time_stamp() {
        return log_time_stamp;
    }

    /**
     * @param log_time_stamp the log_time_stamp to set
     */
    public void setLog_time_stamp(String log_time_stamp) {
        this.log_time_stamp = log_time_stamp;
    }

    /**
     * @return the log_function
     */
    public String getLog_function() {
        return log_function;
    }

    /**
     * @param log_function the log_function to set
     */
    public void setLog_function(String log_function) {
        this.log_function = log_function;
    }
}
