
package mipsanimation1;

public class registerfile {
     private register[] registers = new register[32];
     private register sample;
    public registerfile() {
        registers[0] = new register("$0", 0, 0,"00000");
        registers[1] = new register("$at", 0, 1,"00001");
        registers[2] = new register("$v0", 0, 2, "00010");
        registers[3] = new register("$v1", 0, 3,"00011");
        registers[4] = new register("$a0", 0, 4,"00100");
        registers[5] = new register("$a1", 0, 5,"00101");
        registers[6] = new register("$a2", 0, 6,"00110");
        registers[7] = new register("$a3", 0, 7,"00111");
        registers[8] = new register("$t0", 0, 8,"01000");
        registers[9] = new register("$t1", 0, 9,"01001");
        registers[10] = new register("$t2", 0, 10,"01010");
        registers[11] = new register("$t3", 0, 11,"01011");
        registers[12] = new register("$t4", 0, 12, "01100");
        registers[13] = new register("$t5", 0, 13,"01101");
        registers[14] = new register("$t6", 0, 14,"01110");
        registers[15] = new register("$t7", 0, 15,"01111");
        registers[16] = new register("$s0", 0, 16,"10000");
        registers[17] = new register("$s1", 0, 17,"10001");
        registers[18] = new register("$s2", 0, 18,"10010");
        registers[19] = new register("$s3", 0, 19,"10011");
        registers[20] = new register("$s4", 0, 20,"10100");
        registers[21] = new register("$s5", 0, 21,"10101");
        registers[22] = new register("$s6", 0, 22, "10110");
        registers[23] = new register("$s7", 0, 23,"10111");
        registers[24] = new register("$t8", 0, 24,"11000");
        registers[25] = new register("$t9", 0, 25,"11001");
        registers[26] = new register("$k0", 0, 26,"11010");
        registers[27] = new register("$k1", 0, 27,"11011");
        registers[28] = new register("$gp", 0, 28,"11100");
        registers[29] = new register("$sp", 0, 29,"11101");
        registers[30] = new register("$fp", 0, 30,"11110");
        registers[31] = new register("$ra", 0, 31,"11111");
        
    }
    
//    public void initializeRegisters() {
//        
//    }
       
    
    public register getRegister(int regIndex) {
        return registers[regIndex];
    }
    
    public int getRegisterNum(String regName) {
        for(int i = 0; i < registers.length; i++) {
            if(registers[i].getName().equals(regName)) {
                return i;
            }
        }
        
        return -1;
    }
    public void writeData(int newValue, int index) {
        registers[index].setValue(newValue);
    }
}