
package modelo;


public class empresa1 {
    
    private evento objevento01,objevento02,objevento03,objevento04,objevento05;
    private local objlocal01,objlocal02,objlocal03,objlocal04,objlocal05;

    public empresa1() {
        
     objlocal01 = new local();
    objlocal02 = new local();
    objlocal03 = new local();
    objlocal04 = new local();
    objlocal05 = new local();
    objevento01 = new evento();
    objevento02 = new evento();
    objevento03 = new evento();
    objevento04 = new evento();
    objevento05 = new evento();
        
        
    }

    public empresa1(evento objevento01, evento objevento02, evento objevento03, evento objevento04, evento objevento05, local objlocal01, local objlocal02, local objlocal03, local objlocal04, local objlocal05) {
        this.objevento01 = objevento01;
        this.objevento02 = objevento02;
        this.objevento03 = objevento03;
        this.objevento04 = objevento04;
        this.objevento05 = objevento05;
        this.objlocal01 = objlocal01;
        this.objlocal02 = objlocal02;
        this.objlocal03 = objlocal03;
        this.objlocal04 = objlocal04;
        this.objlocal05 = objlocal05;
     
    }

   
   
    

    public evento getObjevento01() {
        return objevento01;
    }

    public void setObjevento01(evento objevento01) {
        this.objevento01 = objevento01;
    }

    public evento getObjevento02() {
        return objevento02;
    }

    public void setObjevento02(evento objevento02) {
        this.objevento02 = objevento02;
    }

    public evento getObjevento03() {
        return objevento03;
    }

    public void setObjevento03(evento objevento03) {
        this.objevento03 = objevento03;
    }

    public evento getObjevento04() {
        return objevento04;
    }

    public void setObjevento04(evento objevento04) {
        this.objevento04 = objevento04;
    }

    public evento getObjevento05() {
        return objevento05;
    }

    public void setObjevento05(evento objevento05) {
        this.objevento05 = objevento05;
    }

    public local getObjlocal01() {
        return objlocal01;
    }

    public void setObjlocal01(local objlocal01) {
        this.objlocal01 = objlocal01;
    }

    public local getObjlocal02() {
        return objlocal02;
    }

    public void setObjlocal02(local objlocal02) {
        this.objlocal02 = objlocal02;
    }

    public local getObjlocal03() {
        return objlocal03;
    }

    public void setObjlocal03(local objlocal03) {
        this.objlocal03 = objlocal03;
    }

    public local getObjlocal04() {
        return objlocal04;
    }

    public void setObjlocal04(local objlocal04) {
        this.objlocal04 = objlocal04;
    }

    public local getObjlocal05() {
        return objlocal05;
    }

    public void setObjlocal05(local objlocal05) {
        this.objlocal05 = objlocal05;
    }
    
    
    
    
}
