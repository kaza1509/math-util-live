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
//Viết thư viên static
public class MathUtil {

    //n! = 1*2*3*4*4
    //0! = 1! = 1
    //không tính được giai thừa cho số âm
    //20! là vừa khớp kiểu long
    //Nếu đưa vô 21! thì không tính -> cho ra 1 ngoại lệ
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Argument n =< 20");
        }
        if(n == 0 || n == 1)
            return 1;
        //Dùng for hoặc dùng recursion: đệ quy
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product*=i;
        }
        return product;
    }
}
