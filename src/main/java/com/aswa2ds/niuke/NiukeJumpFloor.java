package com.aswa2ds.niuke;

public class NiukeJumpFloor {
    public int JumpFloor(int target) {
        if(target == 0) {
            return 1;
        }
        if(target == 1) {
            return 1;
        }
        int[] methods = new int[target+1];
        methods[0] = 1;
        methods[1] = 1;
        for(int i = 2; i < target+1; ++i){
            methods[i] = methods[i-1] + methods[i-2];
        }
        return methods[target];
    }
}
