package character_string;

/**
 * @author Ahanabi
 * @create 2020-08-01 20:09
 *
 *
 * 题目描述：将一个字符串中的空格替换成“%20”。例如：当字符串为WeAre
Happy.则经过替换之后的字符串为We%20Are%20Happy。

思路：从后往前复制，数组长度会增加，或使用StringBuilder、StringBuffer类
8
代码实现：时间复杂度：O(n)，空间复杂度：O(n)
 */
public class 替换字符串中的空格 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("we are happy");
        System.out.println(ReplaceSpace.replaceSpace(stringBuffer));
    }
}
class ReplaceSpace{
    public static String replaceSpace(StringBuffer str){
        if (str == null)
            return null;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals(" ")){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }
}
