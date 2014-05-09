package trnapp.bookstore;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bookId", "imageUrl" })
public class Cover {
	@XmlElement
	private Long bookId;
	@XmlElement
	private String imageUrl;
	
	public Cover() {
	
	}
	
	public Cover(Long i, String imageUrl) {
		setBookId(i);
		setImageUrl(imageUrl);
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
