///**
// *
// */
//
//package com.tongtong.cpp.Config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//import org.springframework.web.servlet.resource.WebJarsResourceResolver;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//
////@Configuration
////@EnableWebMvc
//public class ApplicationWebContextConfig extends WebMvcConfigurerAdapter {
//	
//
//	
//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//
//		converters.add(createMessageConverter());
//		super.configureMessageConverters(converters);
//	}
//
//	/**
//	 * Use FastJson converter
//	 *
//	 * @return converter
//	 */
//	@SuppressWarnings("all")
//	private HttpMessageConverter<Object> createMessageConverter() {
//		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
//		supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//		converter.setSupportedMediaTypes(supportedMediaTypes);
//		// SerializerFeature.WriteMapNullValue
//		converter.setFeatures(SerializerFeature.QuoteFieldNames, SerializerFeature.DisableCircularReferenceDetect);
//		return converter;
//	}
//}
