package com.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.cts.oracle.Oracle;

public class XmlConfigWithBeanFactory {

	private static final Logger logger = LoggerFactory.getLogger(XmlConfigWithBeanFactory.class);

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("xml-bean-factory-config.xml"));

		Oracle oracle = (Oracle) beanFactory.getBean("oracle");
		logger.info(oracle.defineMeaningOfLife());
	}

}
