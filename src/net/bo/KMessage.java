package net.bo;

import java.util.Calendar;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;


/**
* Classe KMessage
*/
@SuppressWarnings("serial")
@Entity
@Table(name="message")
public class KMessage extends KObject {
	private String contenu;
	private java.sql.Date dateEnvoi;
	private int idReport;
	private int idUtilisateur;
	private String objet;
	private KReport report;
	private KUtilisateur utilisateur;

	public KMessage() {
		super();
		dateEnvoi=new java.sql.Date(Calendar.getInstance().getTime().getTime());
		belongsTo(KUtilisateur.class);belongsTo(KReport.class);
	}
	/**
	 * return the value of contenu
	 * @return contenu
	 */
	public String getContenu(){
		return this.contenu;
	}
	/**
	 * return the value of dateEnvoi
	 * @return dateEnvoi
	 */
	public java.sql.Date getDateEnvoi(){
		return this.dateEnvoi;
	}
	/**
	 * return the value of idReport
	 * @return idReport
	 */
	public int getIdReport(){
		return this.idReport;
	}
	/**
	 * return the value of idUtilisateur
	 * @return idUtilisateur
	 */
	public int getIdUtilisateur(){
		return this.idUtilisateur;
	}
	/**
	 * return the value of objet
	 * @return objet
	 */
	public String getObjet(){
		return this.objet;
	}
	/**
	 * return the value of report
	 * @return report
	 */
	public KReport getReport(){
		return this.report;
	}
	/**
	 * return the value of utilisateur
	 * @return utilisateur
	 */
	public KUtilisateur getUtilisateur(){
		return this.utilisateur;
	}

	/**
	 * set the value of contenu
	 * @param aContenu
	 */
	public void setContenu(String aContenu){
		this.contenu=aContenu;
	}
	/**
	 * set the value of dateEnvoi
	 * @param aDateEnvoi
	 */
	public void setDateEnvoi(java.sql.Date aDateEnvoi){
		this.dateEnvoi=aDateEnvoi;
	}
	/**
	 * set the value of idReport
	 * @param aIdReport
	 */
	public void setIdReport(int aIdReport){
		this.idReport=aIdReport;
	}
	/**
	 * set the value of idUtilisateur
	 * @param aIdUtilisateur
	 */
	public void setIdUtilisateur(int aIdUtilisateur){
		this.idUtilisateur=aIdUtilisateur;
	}
	/**
	 * set the value of objet
	 * @param aObjet
	 */
	public void setObjet(String aObjet){
		this.objet=aObjet;
	}
	/**
	 * set the value of report
	 * @param aReport
	 */
	public void setReport(KReport aReport){
		this.report=aReport;
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
		return " [objet] = " + objet+" [contenu] = " + contenu+" [idUtilisateur] = " + idUtilisateur+" [idReport] = " + idReport+" [dateEnvoi] = " + dateEnvoi;
	}
}