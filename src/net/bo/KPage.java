package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;


/**
* Classe KPage
*/
@SuppressWarnings("serial")
@Entity
@Table(name="page")
public class KPage extends KObject {
	private String controleur;
	private int idModule;
	private String libelle;
	private KModule module;

	public KPage() {
		super();
		belongsTo(KModule.class);
	}
	/**
	 * return the value of controleur
	 * @return controleur
	 */
	public String getControleur(){
		return this.controleur;
	}
	/**
	 * return the value of idModule
	 * @return idModule
	 */
	public int getIdModule(){
		return this.idModule;
	}

	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}
	/**
	 * return the value of module
	 * @return module
	 */
	public KModule getModule(){
		return this.module;
	}

	/**
	 * set the value of controleur
	 * @param aControleur
	 */
	public void setControleur(String aControleur){
		this.controleur=aControleur;
	}
	/**
	 * set the value of idModule
	 * @param aIdModule
	 */
	public void setIdModule(int aIdModule){
		this.idModule=aIdModule;
	}
	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}
	/**
	 * set the value of module
	 * @param aModule
	 */
	public void setModule(KModule aModule){
		this.module=aModule;
	}
	@Override
	public String toString() {
		return libelle +" ["+controleur+".do]";
	}
}