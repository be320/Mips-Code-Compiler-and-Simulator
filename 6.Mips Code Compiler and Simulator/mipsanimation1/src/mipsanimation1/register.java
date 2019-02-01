
package mipsanimation1;

public class register {
    private String name;
    private String id;
    private int value;
    private  int index;
    public register(String name,int value,int index,String id)
    {
    this.name=name;
    this.value=value;
    this.index=index;
    this.id=id;
    }
    public register(String name)
    {
    this.name=name;
    value=0;
    }
   
    public String getId() {
        return id;
        
    }
    public  void setValue(int value) {
        if(!(index==0))
        this.value = value;
    }

    public  int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
    
}


























//    public static String setId(String name) {
//        switch(name)
//        {
//            case("$0"):
//            id="00000";break;
//            case("$at"):
//            id="00001";break;
//            case("$v0"):
//            id="000010";break;
//            case("$v1"):
//            id="00011";break;
//            case("$a0"):
//            id="00100";break;
//            case("$a1"):
//            id="00101";break;
//            case("$a2"):
//            id="00110";break;
//            case("$a3"):
//            id="00111";break;
//            case("$t0"):
//            id="01000";break;
//            case("$t1"):
//            id="01001";break;
//            case("$t2"):
//            id="01010";break;
//            case("$t3"):
//            id="01011";break;
//            case("$t4"):
//            id="01100";break;
//            case("$t5"):
//            id="01101";break;
//            case("$t6"):
//            id="01110";break;
//            case("$t7"):
//            id="01111";break;
//            case("$s0"):
//            id="10000";break;
//            case("$s1"):
//            id="10001";break;
//            case("$s2"):
//            id="10010";break;
//            case("$s3"):
//            id="10011";break;
//            case("$s4"):
//            id="10100";break;
//            case("$s5"):
//            id="10101";break;
//            case("$s6"):
//            id="10110";break;
//            case("$s7"):
//            id="10111";break;
//            case("$t8"):
//            id="11000";break;
//            case("$t9"):
//            id="11001";break;
//            case("$k0"):
//            id="11010";break;
//            case("$k1"):
//            id="11011";break;
//            case("$gp"):
//            id="11100";break;
//            case("$sp"):
//            id="11101";break;
//            case("$fp"):
//            id="11110";break;
//            case("$ra"):
//            id="11111";break;
//            
//            
//        }
//        return id;
//    }


    


