/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsolution;

import java.util.Date;

/**
 *
 * @author Lenovo-ideaPad-15isk
 */
public class RunTime {

    static long startInMiliSeconds() {
        Date date = new Date();
        return date.getTime();
    }

    static long endInMiliSeconds() {
        Date date = new Date();
        return date.getTime();
    }
}
