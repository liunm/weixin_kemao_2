package org.fkjava.weixin.domain.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.fkjava.weixin.domain.InMessage;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventInMessage extends InMessage {

	private static final long serialVersionUID = 1L;

}
