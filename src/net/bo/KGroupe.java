package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KGroupe
*/
@SuppressWarnings("serial")
@Entity
@Table(name="groupe")
public class KGroupe extends KObject {
	private String libelle;

	private KListObject<KUtilisateur> utilisateurs;
	private KListObject<KModule> modules;

	public KGroupe() {
		super();
		modules=new KListObject<>(KModule.class);
		hasMany(KUtilisateur.class);
		hasAndBelongsToMany(KDroit.class, KModule.class);
	}
	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}
	/**
	 * return the value of utilisateurs
	 * @return utilisateurs
	 */
	public KListObject<KUtilisateur> getUtilisateurs(){
		return this.utilisateurs;
	}

	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}
	/**
	 * set the value of utilisateurs
	 * @param aUtilisateurs
	 */
	public void setUtilisateurs(KListObject<KUtilisateur> aUtilisateurs){
		this.utilisateurs=aUtilisateurs;
	}
	@Override
	public String toString() {
		return " [libelle] = " + libelle;
	}
	public KListObject<KModule> getModules() {
		return modules;
	}
	public void setModules(KListObject<KModule> modules) {
		this.modules = modules;
	}
}