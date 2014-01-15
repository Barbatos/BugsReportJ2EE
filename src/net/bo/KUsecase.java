package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KUsecase
*/
@SuppressWarnings("serial")
@Entity
@Table(name="usecase")
public class KUsecase extends KObject {

	private String code;
	private int idApplication;
	private String libelle;
	private KApplication application;
	private KListObject<KReport> reports;

	public KUsecase() {
		super();
		hasMany(KReport.class);
		belongsTo(KApplication.class);
	}
	/**
	 * return the value of code
	 * @return code
	 */
	public String getCode(){
		return this.code;
	}
	/**
	 * return the value of idApplication
	 * @return idApplication
	 */
	public int getIdApplication(){
		return this.idApplication;
	}
	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}
	/**
	 * return the value of application
	 * @return application
	 */
	public KApplication getApplication(){
		return this.application;
	}
	/**
	 * return the value of reports
	 * @return reports
	 */
	public KListObject<KReport> getReports(){
		return this.reports;
	}

	/**
	 * set the value of code
	 * @param aCode
	 */
	public void setCode(String aCode){
		this.code=aCode;
	}
	/**
	 * set the value of idApplication
	 * @param aIdApplication
	 */
	public void setIdApplication(int aIdApplication){
		this.idApplication=aIdApplication;
	}
	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}
	/**
	 * set the value of application
	 * @param aApplication
	 */
	public void setApplication(KApplication aApplication){
		this.application=aApplication;
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
		String strApplication="";
		if(application!=null)
			strApplication=" ("+application.getLibelle()+")";
		return libelle+strApplication;
	}
}