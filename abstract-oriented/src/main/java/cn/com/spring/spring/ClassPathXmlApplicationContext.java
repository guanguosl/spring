package cn.com.spring.spring;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guanyl on 2017/12/4.
 */

public class ClassPathXmlApplicationContext implements BeanFactory {
    private Map<String, Object> beans = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext() throws JDOMException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
        Element elementRoot = document.getRootElement();
        List<Element> elements = elementRoot.getChildren();
        for (Element element : elements) {
            String id = element.getAttributeValue("id");
            String className = element.getAttributeValue("class");
            System.out.println(id + ":" + className);
            Object o = Class.forName(className).newInstance();
            beans.put(id, o);
        }
        this.beans = beans;
    }

    @Override
    public Object getBean(String name) {
        return beans.get(name
        );
    }
}
