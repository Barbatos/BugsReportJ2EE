package net.bo;

import java.util.Calendar;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.persistence.annotation.Id;


/**
* Classe KAffectation
*/
@SuppressWarnings("serial")
@Entity
@Table(name="affectation")
public class KAffectation extends KObject {
	private java.sql.Date dateAffectation;
	@Id
	private int idApplication;
	@Id
	private int idUtilisateur;
	private KApplication application;
	private KUtilisateur utilisateur;

	public KAffectation() {
		super();
		dateAffectation=new java.sql.Date(Calendar.getInstance().getTime().getTime());
		belongsTo(KUtilisateur.class);belongsTo(KApplication.class);
	}
	/**
	 * return the value of dateAffectation
	 * @return dateAffectation
	 */
	public java.sql.Date getDateAffectation(){
		return this.dateAffectation;
	}
	/**
	 * return the value of idApplication
	 * @return idApplication
	 */
	public int getIdApplication(){
		return this.idApplication;
	}
	/**
	 * return the value of idUtilisateur
	 * @return idUtilisateur
	 */
	public int getIdUtilisateur(){
		return this.idUtilisateur;
	}
	/**
	 * return the value of application
	 * @return application
	 */
	public KApplication getApplication(){
		return this.application;
	}
	/**
	 * return the value of utilisateur
	 * @return utilisateur
	 */
	public KUtilisateur getUtilisateur(){
		return this.utilisateur;
	}

	/**
	 * set the value of dateAffectation
	 * @param aDateAffectation
	 */
	public void setDateAffectation(java.sql.Date aDateAffectation){
		this.dateAffectation=aDateAffectation;
	}
	/**
	 * set the value of idApplication
	 * @param aIdApplication
	 */
	public void setIdApplication(int aIdApplication){
		this.idApplication=aIdApplication;
	}
	/**
	 * set the value of idUtilisateur
	 * @param aIdUtilisateur
	 */
	public void setIdUtilisateur(int aIdUtilisateur){
		this.idUtilisateur=aIdUtilisateur;
	}
	/**
	 * set the value of application
	 * @param aApplication
	 */
	public void setApplication(KApplication aApplication){
		this.application=aApplication;
	}
	/**
	 * set the value of utilisateur
	 * @param aUtilisateur
	 */
	public void setUtilisateur(KUtilisateur aUtilisateur){
		this.utilisateur=aUtilisateur;
	}
	@Override
	public String toString() {
		return " [idApplication] = " + idApplication+" [idUtilisateur] = " + idUtilisateur+" [dateAffectation] = " + dateAffectation;
	}
}