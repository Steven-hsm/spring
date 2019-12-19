import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: huangsenming
 * @Date: 2019/12/19 11:43
 * @Description: 正则测试
 */
public class MyReg {
    public static String imgStr = "<img title=\"微信图片_20190909160200.jpg\" style=\"float:none;\" " +
            "src=\"http://qnimg.zowoyoo.com/img/223212/1568082823148.jpg\"/>" +
            "<img title=\"微信图片_20190909160200.jpg\" style=\"float:none;\" " +
            "src=\"http://qnimg.zowoyoo.com/img/223212/1568082823148.jpg\"/>" +
            "这是个中文,我测试一下子" +
            "<img title=\"微信图片_20190909160200.jpg\" style=\"float:none;\" " +
            "src=\"http://qnimg.zowoyoo.com/img/223212/1568082823148.jpg\"/>";

    public static void main(String[] args) {
        //获取列表
        List<String> imgSrc = getImgSrc(imgStr);
        imgSrc.forEach( originalStr ->{
            //替换列表
            imgStr = imgStr.replaceAll(originalStr, "什么鬼");
        });
        //输出结果
        System.out.println(imgStr);
    }

    public static List<String> getImgSrc(String content){
        String imgRegex = "<(img|IMG)(.*?)(/>|></img>|>)";
        String srcRegex = "(src|SRC)=(\"|\')(.*?)(\"|\')";
        List<String> list = new ArrayList<String>();
        //目前img标签标示有3种表达式
        //<img alt="" src="1.jpg"/>   <img alt="" src="1.jpg"></img>     <img alt="" src="1.jpg">
        //开始匹配content中的<img />标签
        Pattern p_img = Pattern.compile(imgRegex);
        Matcher m_img = p_img.matcher(content);
        boolean result_img = m_img.find();
        if (result_img) {
            while (result_img) {
                //获取到匹配的<img />标签中的内容
                String str_img = m_img.group(2);

                //开始匹配<img />标签中的src
                Pattern p_src = Pattern.compile(srcRegex);
                Matcher m_src = p_src.matcher(str_img);
                if (m_src.find()) {
                    String str_src = m_src.group(3);
                    list.add(str_src);
                }
                //结束匹配<img />标签中的src
                //匹配content中是否存在下一个<img />标签，有则继续以上步骤匹配<img />标签中的src
                result_img = m_img.find();
            }
        }
        return list;
    }
}
