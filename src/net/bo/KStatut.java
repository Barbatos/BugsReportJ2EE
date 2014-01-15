package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KStatut
*/
@SuppressWarnings("serial")
@Entity
@Table(name="statut")
public class KStatut extends KObject {
	private String libelle;
	private KListObject<KReport> reports;

	public KStatut() {
		super();
		//hasMany(KReport.class);
	}
	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}
	/**
	 * return the value of reports
	 * @return reports
	 */
	public KListObject<KReport> getReports(){
		return this.reports;
	}

	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}
	/**
	 * set the value of reports
	 * @param aReports
	 */
	public void setReports(KListObject<KReport> aReports){
		this.reports=aReports;
	}
	@Override
	public String toString() {
		return libelle;
	}
}