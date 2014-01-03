package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KModule
*/
@SuppressWarnings("serial")
@Entity
@Table(name="module")
public class KModule extends KObject {
	private String descriptif;
	private String libelle;
	private KListObject<KPage> pages;
	private KListObject<KGroupe> groupes;

	public KModule() {
		super();
		hasMany(KPage.class);
		//hasAndBelongsToMany(KDroit.class, KGroupe.class);
	}
	/**
	 * return the value of descriptif
	 * @return descriptif
	 */
	public String getDescriptif(){
		return this.descriptif;
	}
	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}

	/**
	 * return the value of pages
	 * @return pages
	 */
	public KListObject<KPage> getPages(){
		return this.pages;
	}

	/**
	 * set the value of descriptif
	 * @param aDescriptif
	 */
	public void setDescriptif(String aDescriptif){
		this.descriptif=aDescriptif;
	}
	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}

	/**
	 * set the value of pages
	 * @param aPages
	 */
	public void setPages(KListObject<KPage> aPages){
		this.pages=aPages;
	}
	@Override
	public String toString() {
		return " [libelle] = " + libelle+" [descriptif] = " + descriptif;
	}
	public KListObject<KGroupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(KListObject<KGroupe> groupes) {
		this.groupes = groupes;
	}
}