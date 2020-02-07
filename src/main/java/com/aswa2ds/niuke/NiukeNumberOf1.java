package com.aswa2ds.niuke;

/**
 * @author aswa2ds
 */
public class NiukeNumberOf1 {
    public int NumberOf1(int n) {
        int num = 0;
        for(int i = 0; i < 32; ++i){
            num += n & 0x1;
            n >>= 1;
        }
        return num;
    }
}
