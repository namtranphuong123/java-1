/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class Bai3DataValiDator {
       public boolean isEmail(String st){
        String pattern ="\\w+@\\w+\\.\\w+";
        return st.matches(pattern);
    }
    public boolean isSDT(String st){
        String pattern ="0\\d(9)";
        return st.matches(pattern);
    }
    public boolean isCMND(String st){
        String pattern ="\\d(9)";
        return st.matches(pattern);
    }
}
