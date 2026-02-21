
package modelo;


public class ciudad {
    
    private predio objpredio01,objpredio02,objpredio03,objpredio04,objpredio05;

    public ciudad() {
        objpredio01 = new predio();
        objpredio02 = new predio();
        objpredio03 = new predio();
        objpredio04 = new predio();
        objpredio05 = new predio();
       
    }

    public ciudad( propietario objpropietario05, predio objpredio01, predio objpredio02, predio objpredio03, predio objpredio04, predio objpredio05) {
        
        this.objpredio01 = objpredio01;
        this.objpredio02 = objpredio02;
        this.objpredio03 = objpredio03;
        this.objpredio04 = objpredio04;
        this.objpredio05 = objpredio05;
        
    }

  

   

    public predio getObjpredio01() {
        return objpredio01;
    }

    public void setObjpredio01(predio objpredio01) {
        this.objpredio01 = objpredio01;
    }

    public predio getObjpredio02() {
        return objpredio02;
    }

    public void setObjpredio02(predio objpredio02) {
        this.objpredio02 = objpredio02;
    }

    public predio getObjpredio03() {
        return objpredio03;
    }

    public void setObjpredio03(predio objpredio03) {
        this.objpredio03 = objpredio03;
    }

    public predio getObjpredio04() {
        return objpredio04;
    }

    public void setObjpredio04(predio objpredio04) {
        this.objpredio04 = objpredio04;
    }

    public predio getObjpredio05() {
        return objpredio05;
    }

    public void setObjpredio05(predio objpredio05) {
        this.objpredio05 = objpredio05;
    }
    
    
    
    
    
}
