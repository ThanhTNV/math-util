/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.huuthanh.mathutil.core.test;

import com.huuthanh.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author thanh
 */
public class MathUtilityDDTTest {
    //chuẩn bị data, sau này đưa vào hàm assert() của Framework
    //data này sẽ từ từ dc trích vào trong hàm assert()
    //nó nằm trong hàm có style là static - nằm cố định trong 1 vùng RAM

    //TEST CASE: 
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120; 6! -> 720
    //TA THẤY CÓ CÁC BỘ DATA
    //{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720},...
    //  [7][2]
    //TA ĐỂ RIÊNG DATA NÀY RA 1 MẢNG 2 CHIỀU
    public static Object[][] initData() {
        return new Object[][]
        {
            {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
        };
    }
    
    //TEST CASE SO SÁNH HÀM CÓ TRẢ VỀ KỲ VỌNG HAY KHÔNG
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgReturnsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
