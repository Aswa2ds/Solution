/**
 * @author aswa2ds
 */
public class NiukeReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        int len =  str.length();
        for(int i = len-1; i >= 0; --i){
            if(str.charAt(i) == ' '){
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }
}
