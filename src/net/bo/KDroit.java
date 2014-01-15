package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.persistence.annotation.Id;


/**
* Classe KDroit
*/
@SuppressWarnings("serial")
@Entity
@Table(name="droit")
public class KDroit extends KObject {
	@Id
	private int idGroupe;
	@Id
	private int idModule;
	private KGroupe groupe;
	private KModule module;

	public KDroit() {
		super();
		belongsTo(KModule.class);belongsTo(KGroupe.class);
	}
	/**
	 * return the value of idGroupe
	 * @return idGroupe
	 */
	public int getIdGroupe(){
		return this.idGroupe;
	}
	/**
	 * return the value of idModule
	 * @return idModule
	 */
	public int getIdModule(){
		return this.idModule;
	}
	/**
	 * return the value of groupe
	 * @return groupe
	 */
	public KGroupe getGroupe(){
		return this.groupe;
	}
	/**
	 * return the value of module
	 * @return module
	 */
	public KModule getModule(){
		return this.module;
	}

	/**
	 * set the value of idGroupe
	 * @param aIdGroupe
	 */
	public void setIdGroupe(int aIdGroupe){
		this.idGroupe=aIdGroupe;
	}
	/**
	 * set the value of idModule
	 * @param aIdModule
	 */
	public void setIdModule(int aIdModule){
		this.idModule=aIdModule;
	}
	/**
	 * set the value of groupe
	 * @param aGroupe
	 */
	public void setGroupe(KGroupe aGroupe){
		this.groupe=aGroupe;
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
		return " [idModule] = " + idModule+" [idGroupe] = " + idGroupe;
	}
}