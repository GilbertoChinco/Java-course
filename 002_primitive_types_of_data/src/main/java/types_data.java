/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Exist different types of variables
 * size: n bits of memory
 * byte size = 8 and the range [-128, 127]
 * short size = 16 and the range [-32768, 32767]
 * int size = 32 and the range [-2,147,483,648 ---   2,147,483,647]
 * long size = 64 and the range [-9,223,372,036,854,775,808 ---  9,223,372,854,775,807]
 * 
 * 
 * double, size = 64
 * float, size = 32
 */
public class types_data {
    public static void main (String[] args){
        byte v_byte = 12;
        System.out.println("This is a variable byte: " + v_byte);
        
        short v_short = 12456;
        System.out.println("This is a variable short: " + v_short);
        
        int v_int = 123456;
        System.out.println("This is a variable int: " + v_int);
        
        long v_long = 123456798;
        System.out.println("This ia variable long: " + v_long);
        
        float v_float = 3.45f; //if we want to use float number aggregate "f" at the end
        System.out.println("This is a variable float:" + v_float);
        
        double v_double = 1.45;
        System.out.println("This is a variable double: " + v_double);
        
        char v_char = 'c';
        System.out.println("This a variable char: " + v_char);
        
        boolean v_boolean = true;  //false
        System.out.println("This is a variable boolean: " + v_boolean);
    }
}
