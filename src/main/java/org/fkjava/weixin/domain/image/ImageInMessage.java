package org.fkjava.weixin.domain.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.fkjava.weixin.domain.InMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImageInMessage extends InMessage{

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "PicUrl")
	@JsonProperty("PicUrl")
	private String imageurl;
	
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String mediaid;

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getMediaid() {
		return mediaid;
	}

	public void setMediaid(String mediaid) {
		this.mediaid = mediaid;
	}

	@Override
	public String toString() {
		return "ImageInMessage [imageurl=" + imageurl + ", mediaid=" + mediaid + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}

}
