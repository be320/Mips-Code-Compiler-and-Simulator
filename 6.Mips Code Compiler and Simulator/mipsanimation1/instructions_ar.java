
package mipsanimation1;

public class instructions_ar {
    private int index ; 
    private String inst ;
    private String label;
    private String target;
    private register rs;
    private register rt;
    private register rd;
    private animation draw ; 
    private jr special;
    private int immed;
    private int mypc;
    protected boolean jumping=false;
    public instructions_ar() {
    }

    public animation getDraw() {
        return draw;
    }

    public int getIndex() {
        return index;
    }

    public String getInst() {
        return inst;
    }

    public String getLabel() {
        return label;
    }

    public register getRd() {
        return rd;
    }

    public register getRs() {
        return rs;
    }

    public register getRt() {
        return rt;
    }

    public void setDraw(animation draw) {
        this.draw = draw;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setRd(register rd) {
        this.rd = rd;
    }

    public void setRs(register rs) {
        this.rs = rs;
    }

    public void setRt(register rt) {
        this.rt = rt;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setImmed(int immed) {
        this.immed = immed;
    }

    public int getImmed() {
        return immed;
    }

    public void setJumping(boolean jumping) {
        this.jumping = jumping;
    }

    public void setSpecial(jr special) {
        this.special = special;
    }

    public jr getSpecial() {
        return special;
    }

    public void setMypc(int mypc) {
        this.mypc = mypc;
    }

    public int getMypc() {
        return mypc;
    }
   
   
}