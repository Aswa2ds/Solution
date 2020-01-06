/**
 * @author aswa2ds
 */
public class NiukeMinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }

        if (array[len - 1] > array[0]) {
            return array[0];
        }

        int i = 0;

        for (; i < len - 1; ++i) {
            if (array[i + 1] < array[i]) {
                break;
            }
        }

        if (i == len - 1) {
            return array[0];
        } else {
            return array[i + 1];
        }

    }
}
