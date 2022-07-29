package com.bilgeadam.lesson027.factory;

import java.util.UUID;

/*
 * 
 * Tuleri olsun (Vegan,Tavuklu)
 * Staring productId;
 * boyutları olsun (Buyuk orta küçük)
 * 
 * hamur turu( ince kalın)
 * 
 * biz turlerine göre pizzalar uretelim 
 * Test sınıfında bunları kontrol edelim 
 * 
 *  Loknata menu üzerinden pizzmızın seceneklerini sececğiz ve  o pizamızı hazrlandığını çıktı vereceğiz
 * 
 * 
 * 
 * 
 */

public abstract class Pizza {

	private String id;
	private ETur tur;
	private EBoyut boyut;
	private EHamur hamur;

	public Pizza(ETur tur, EBoyut boyut, EHamur hamur) {
		super();
		this.id = UUID.randomUUID().toString();
		this.tur = tur;
		this.boyut = boyut;
		this.hamur = hamur;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ETur getTur() {
		return tur;
	}

	public void setTur(ETur tur) {
		this.tur = tur;
	}

	public EBoyut getBoyut() {
		return boyut;
	}

	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}

	public EHamur getHamur() {
		return hamur;
	}

	public void setHamur(EHamur hamur) {
		this.hamur = hamur;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", tur=" + tur + ", boyut=" + boyut + ", hamur=" + hamur + "]";
	}

}
