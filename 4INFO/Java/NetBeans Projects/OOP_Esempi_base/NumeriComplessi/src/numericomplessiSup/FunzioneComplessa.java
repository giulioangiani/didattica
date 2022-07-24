/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericomplessi;

/**
 *
 * @author giulio
 */
public class FunzioneComplessa implements Complex, Funzione{


    @Override
    public float limite() {
        return (float)4.0;
    }  

    @Override
    public float re() {
        return (float)1.0;
    }

    @Override
    public float im() {
        return (float)2.0;
    }

    @Override
    public float abs() {
        return (float)3.0;
    }

}
