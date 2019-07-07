package org.fkjava.weixin.domain.shortvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.fkjava.weixin.domain.InMessage;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShortvideoInMessage extends InMessage{
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
