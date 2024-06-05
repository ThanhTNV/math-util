/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huuthanh.mathutil.core.test;

import com.huuthanh.mathutil.core.MathUtility;
import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
// quy u?c dat ten package cua Java


public class MathUtilityTest {
    //ở đây chứa các lệnh/hàm dùng để đi test hàm chính ở bên code chính
    //
    
    
    
    
    //TEST CASE: BỘ DATA ĐƯA VÀO HÀM, APP ĐỂ VERIFY HÀM, APP CÓ XỬ LÝ
    //ĐÚNG HAY KHÔNG, NÓ ĐI KÈM THEO CÁCH XÀI HÀM, TRÌNH TỰ XÀI APP + EXPECTED
    //VALUE + STATUS TEST CASE PASSED HAY FAILED
    //TEST CASE #1: CHECK GETFACTORIAL() WITH N = 0, 0!
    //EXPECTED: RETURN 1
    @Test
    //Tên hàm mang ý nghĩa của test case
    public void testFatorialGivenRightArg0ReturnWell(){
        int n = 0; //Given right argument
        long expectedValue = 1; //Hi vọng 0! = 1
        long actualValue; //đoán kết quả trả về
        //nếu expected  == acutal thì passed
        
        actualValue = MathUtility.getFactorial(n);
        
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    
    //TEST CASE #2: CHECK GETFACTORIAL() WITH N = 1, 1!
    //EXPECTED: RETURN 1
    @Test
    public void testFactorialGivenRightArg1ReturnsWell(){
        int n = 1;
        long expectedValue = 1;
        long actualValue;
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
    }
    
    //TEST CASE #3: CHECK GETFACTORIAL() WITH N = 2, 2! -> EXPECTED = 2
    //                                   WITH N = 3, 3! -> EXPECTED = 6
    //                                   WITH N = 4, 4! -> EXPECTED = 24
    @Test
    public void testFactorialGivenRightArg234ReturnsWell(){
        int n = 2;
        long expectedValue = 2;
        long actualValue;
        actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
    }
    
    //TEST CASE #4: CHECK IF GETFACTORIAL() RETURN EXCEPTION IF WE PASS N < 0
    @Test
    public void testFactorialGivenWrongArg_1ThrowsException(){
        int n = -1;//Input n < 0; n = -1
        //nhớ quy ước: màu xanh là đúng mới kỳ vọng
        //             màu đỏ   là không đạt được kỳ vọng
        //Ngoại lệ là Exception, k phải value, k khai báo biến để gán ngoại lệ
        //ko assertEqual(value, value);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
}



//PHẦN KIẾN THỨC BỔ SUNG VÀO CV
//TDD: TEST DRIVEN DEVELOPMENT
//LÀ KĨ THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIẾT CÁC TEST CASE
//TỨC LÀ CODE MỖI HÀM LUÔN ĐI KÈM VỚI CODE KIỂM THỬ
//KẾT QUẢ HIỂN THỊ THEO 2 MÀU: XANH ĐỎ
//XANH-NGON PASS CÁC TEST CASE
//ĐỎ-KHÔNG PASS TEST CASE
//VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST CASE ĐỂ XEM
//XANH ĐỎ
//KỸ THUẬT TDD

//MỌI NGÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORK GIÚP TEST CODE 2
//MÀU, GỌI LÀ UNIT TESTING FRAMEWORK
//MỌI NGÔN NGỮ ĐỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ TEAM DEV CÓ XÀI HAY KO
//NHÓM LÀM OBS CÓ XÀI

//ĐỀ THUYẾT TRÌNH:
//NHÓM HÃY CHỌN 1 UNIT TESTING FRAMEWORK ĐỂ DEMO
//C#: NUNIT, XUNIT, MS TEST,...
//JAVA: TESTING,...
//JS: MOCHA, JASMINE,...

//DÒNG THỨ 2 TRONG CV:
//DDT - DATA DRIVEN TESTING (PARAMETERIZED TESTING): 
//VIẾT TEST CASE THEO STYLE THAM SỐ HÓA: LÀ PHẦN MỞ RỘNG THÊM, LÀ KĨ THUẬT NÂNG CAO ĐỂ GIÚP 
//TỔ CHỨC CÁC TEST CASE KHI VIẾT CODE UNIT TEST, NÓ CÓ BÀ CON VỚI TDD
//LÀ KĨ THUẬT VIẾT CÁC TEST CASE MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH
//ASSERT() ĐỂ DỄ QUẢN LÝ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE, DỄ THEO DÕI CÁC 
//PHẦN CODE LIÊN QUAN ĐẾN TEST HÀM, VÌ CÂU LỆNH SO SÁNH EXPECTED/ACTUAL TRỞ NÊN 
//GỌN NHẸ HƠN