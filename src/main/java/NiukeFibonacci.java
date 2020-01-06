/**
 * @author aswa2ds
 */
public class NiukeFibonacci {
    public int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int[] list = new int[n+1];
        list[0] = 0;
        list[1] = 1;
        for(int i = 2; i < n+1; ++i){
            list[i] = list[i-2] + list[i-1];
        }
        return list[n];
    }
}
