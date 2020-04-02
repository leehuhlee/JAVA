/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xleeji00;

/**
 *
 * @author leehu
 */
public class memoryCollection {
    String result;
    String formula;
    public memoryCollection(String _result, String _formula){
        this.result = _result;
        this.formula = _formula;
    }
    public String setResult(){
        return result;
    }
    public String setFormula(){
        return formula;
    }
}
