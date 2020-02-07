package com.aswa2ds.niuke;

/**
 * @author aswa2ds
 */
public class NiukeRectCover {
    public int RectCover(int target) {
        if(target == 0) {
            return 0;
        }
        if(target == 1) {
            return 1;
        }
        int[] list = new int[target + 1];
        list[0] = 1;
        list[1] = 1;
        for (int i = 2; i <= target; ++i) {
            list[i] = list[i - 2] + list[i - 1];
        }
        return list[target];
    }
}
