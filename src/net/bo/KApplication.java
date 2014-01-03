package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KApplication
*/
@SuppressWarnings("serial")
@Entity
@Table(name="application")
public class KApplication extends KObject {
	private java.sql.Date dateCreation;
	private String descriptif;
	private String libelle;
	private String version;
	private KListObject<KAffectation> affectations;
	private KListObject<KUsecase> usecases;

	public KApplication() {
		super();
		hasMany(KUsecase.class);
		hasMany(KAffectation.class);
	}
	/**
	 * return the value of dateCreation
	 * @return dateCreation
	 */
	public java.sql.Date getDateCreation(){
		return this.dateCreation;
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
	 * return the value of version
	 * @return version
	 */
	public String getVersion(){
		return this.version;
	}
	/**
	 * return the value of affectations
	 * @return affectations
	 */
	public KListObject<KAffectation> getAffectations(){
		return this.affectations;
	}
	/**
	 * return the value of usecases
	 * @return usecases
	 */
	public KListObject<KUsecase> getUsecases(){
		return this.usecases;
	}

	/**
	 * set the value of dateCreation
	 * @param aDateCreation
	 */
	public void setDateCreation(java.sql.Date aDateCreation){
		this.dateCreation=aDateCreation;
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
	 * set the value of version
	 * @param aVersion
	 */
	public void setVersion(String aVersion){
		this.version=aVersion;
	}
	/**
	 * set the value of affectations
	 * @param aAffectations
	 */
	public void setAffectations(KListObject<KAffectation> aAffectations){
		this.affectations=aAffectations;
	}
	/**
	 * set the value of usecases
	 * @param aUsecases
	 */
	public void setUsecases(KListObject<KUsecase> aUsecases){
		this.usecases=aUsecases;
	}
	@Override
	public String toString() {
		return libelle +" ["+ version+"]";
	}
}