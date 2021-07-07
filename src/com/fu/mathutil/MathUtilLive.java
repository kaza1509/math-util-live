/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author kazaf
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println("Expected 5! = 120; actual: "+result);
        
        System.out.println("Expected 6! = 720; actual: "+MathUtil.getFactorial(6));
        
        System.out.println("Expected 0! = 1; actual: "+MathUtil.getFactorial(0));
        
        //MathUtil.getFactorial(-5); ném ngoại lệ
        
        //Thêm code sau lần đầu tiên làm chuyên đấy code lên server: 5:35 pm 7/7/2021
        System.out.println("Expected 1! = 1; actual: "+MathUtil.getFactorial(1));
        System.out.println("Expected 3! = 6; actual: "+MathUtil.getFactorial(6));
        
        //kĩ thuật kiểm thử, ước chừng giá trị của hàm trả về gì
        //expect value: 5! = 120
        //actual: chương trình chạy
        //Nếu expect = actual -> chương trình ngon :v
        
    }
    
}
