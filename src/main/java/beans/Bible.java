package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Bible") 
@ManagedBean
@ViewScoped 
public class Bible {

	@NotNull
	private String book;
	@NotNull 
	private int verse;
	@NotNull
	private int chapter;
	private String scripture;
	@NotNull()
	private String search;
	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@NotNull @Min(0)
	private int ocurrences; 
	
	
	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int getVerse() {
		return verse;
	}

	public void setVerse(int verse) {
		this.verse = verse;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public String getScripture() {
		return scripture;
	}

	public void setScripture(String scripture) {
		this.scripture = scripture;
	}



	public int getOcurrences() {
		return ocurrences;
	}

	public void setOcurrences(int ocurrences) {
		this.ocurrences = ocurrences;
	}

	public Bible() {
	
		this.book = "";
		this.verse = 0;
		this.chapter = 0;
		this.scripture = "";
		this.ocurrences = 0;
		this.search = "";
	}
	
	public Bible(String book, int verse, int chapter, String scripture) {
		super();
		this.book = book;
		this.verse = verse;
		this.chapter = chapter;
		this.scripture = scripture;
	}
	
	

}
