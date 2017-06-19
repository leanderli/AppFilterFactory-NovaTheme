package com.leanderli.appfilter.XmlUtils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/19.
 */
public class AppFilterXmlUtil {

    public void CreateXMLByDOM4J(File dest, String[] text) {
        // 创建Document对象
        Document document = DocumentHelper.createDocument();
        // 创建根节点
        Element rss = document.addElement("resources");
        // 创建item子节点
        Element item = null;
        for (int i = 0; i < text.length; i++) {
            item = rss.addElement("item");
            item.addAttribute("component", text[i]);
            item.addAttribute("drawable", "ic_phone_red" + i);
        }

        // 创建title子节点
//        Element title = channel.addElement("title");
        // 设置title节点的值
//        title.setText("<![CDATA[上海移动互联网产业促进中心正式揭牌 ]]>");

        // 创建输出格式(OutputFormat对象)
        OutputFormat format = OutputFormat.createPrettyPrint();
        // 设置输出文件的编码
        format.setEncoding("UTF-8");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            // 创建XMLWriter对象
            XMLWriter writer = new XMLWriter(fileOutputStream, format);
            //设置不自动进行转义
            writer.setEscapeText(false);
            // 生成XML文件
            writer.write(document);
            //关闭XMLWriter对象
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
