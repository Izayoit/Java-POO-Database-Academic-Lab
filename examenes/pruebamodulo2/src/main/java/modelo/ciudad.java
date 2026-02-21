
package modelo;


public class ciudad {
    private predio objpredio1,objpredio2,objpredio3,objpredio4,objpredio5;

    public ciudad() {
        objpredio1 = new predio();
         objpredio2 = new predio(); ;
          objpredio3 = new predio();
           objpredio4 = new predio();
            objpredio5 = new predio();
         
         
        
    }
    

    public ciudad(predio objpredio1, predio objpredio2, predio objpredio3, predio objpredio4, predio objpredio5) {
        this.objpredio1 = objpredio1;
        this.objpredio2 = objpredio2;
        this.objpredio3 = objpredio3;
        this.objpredio4 = objpredio4;
        this.objpredio5 = objpredio5;
       objpredio1 = new predio();
         objpredio2 = new predio(); ;
          objpredio3 = new predio();
           objpredio4 = new predio();
            objpredio5 = new predio();
    }

    public predio getObjpredio1() {
        return objpredio1;
    }

    public void setObjpredio1(predio objpredio1) {
        this.objpredio1 = objpredio1;
    }

    public predio getObjpredio2() {
        return objpredio2;
    }

    public void setObjpredio2(predio objpredio2) {
        this.objpredio2 = objpredio2;
    }

    public predio getObjpredio3() {
        return objpredio3;
    }

    public void setObjpredio3(predio objpredio3) {
        this.objpredio3 = objpredio3;
    }

    public predio getObjpredio4() {
        return objpredio4;
    }

    public void setObjpredio4(predio objpredio4) {
        this.objpredio4 = objpredio4;
    }

    public predio getObjpredio5() {
        return objpredio5;
    }

    public void setObjpredio5(predio objpredio5) {
        this.objpredio5 = objpredio5;
    }
           
    
    
}
