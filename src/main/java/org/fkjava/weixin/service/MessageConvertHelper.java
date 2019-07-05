package org.fkjava.weixin.service;

import java.io.StringReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.JAXB;

import org.fkjava.weixin.domain.InMessage;
import org.fkjava.weixin.domain.event.EventInMessage;
import org.fkjava.weixin.domain.image.ImageInMessage;
import org.fkjava.weixin.domain.link.LinkInMessage;
import org.fkjava.weixin.domain.location.LocationInMessage;
import org.fkjava.weixin.domain.shortvideo.ShortvideoInMessage;
import org.fkjava.weixin.domain.text.TextInMessage;
import org.fkjava.weixin.domain.vioce.VioceInMessage;
import org.fkjava.weixin.domain.viode.VideoInMessage;

public class MessageConvertHelper {
	
	private static final Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();
	static {
		typeMap.put("text",TextInMessage.class);
		typeMap.put("image",ImageInMessage.class);
		typeMap.put("vioce",VioceInMessage.class);
		typeMap.put("video",VideoInMessage.class);
		typeMap.put("location",LocationInMessage.class);
		typeMap.put("event",EventInMessage.class);
		typeMap.put("link",LinkInMessage.class);
		typeMap.put("shortvideo",ShortvideoInMessage.class);
		}
	
	public static  <T extends InMessage> T convert(String xml) {
		
		String type = xml.substring(xml.indexOf("<MsgType><![CDATA[") +18);
		type = type.substring(0,type.indexOf("]"));
		
		Class<? extends InMessage> c = typeMap.get(type);
		
		@SuppressWarnings("unchecked")
		T msg = (T) JAXB.unmarshal(new StringReader(xml), c);
		
		return msg;
    }
}
