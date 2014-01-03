package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KUtilisateur
*/
@SuppressWarnings("serial")
@Entity
@Table(name="utilisateur")
public class KUtilisateur extends KObject {
	private int idGroupe;
	private String login;
	private String mail;
	private String password;
	private KGroupe groupe;
	private KListObject<KAffectation> affectations;
	private KListObject<KMessage> messages;
	private KListObject<KReport> reports;

	public KUtilisateur() {
		super();
		affectations=new KListObject<>(KAffectation.class);
		hasMany(KReport.class);
		hasMany(KMessage.class);
		hasManyBelongsTo(KAffectation.class, KApplication.class);
		belongsTo(KGroupe.class);
	}
	/**
	 * return the value of idGroupe
	 * @return idGroupe
	 */
	public int getIdGroupe(){
		return this.idGroupe;
	}
	/**
	 * return the value of login
	 * @return login
	 */
	public String getLogin(){
		return this.login;
	}
	/**
	 * return the value of mail
	 * @return mail
	 */
	public String getMail(){
		return this.mail;
	}
	/**
	 * return the value of password
	 * @return password
	 */
	public String getPassword(){
		return this.password;
	}
	/**
	 * return the value of groupe
	 * @return groupe
	 */
	public KGroupe getGroupe(){
		return this.groupe;
	}
	/**
	 * return the value of affectations
	 * @return affectations
	 */
	public KListObject<KAffectation> getAffectations(){
		return this.affectations;
	}
	/**
	 * return the value of messages
	 * @return messages
	 */
	public KListObject<KMessage> getMessages(){
		return this.messages;
	}
	/**
	 * return the value of reports
	 * @return reports
	 */
	public KListObject<KReport> getReports(){
		return this.reports;
	}

	/**
	 * set the value of idGroupe
	 * @param aIdGroupe
	 */
	public void setIdGroupe(int aIdGroupe){
		this.idGroupe=aIdGroupe;
	}
	/**
	 * set the value of login
	 * @param aLogin
	 */
	public void setLogin(String aLogin){
		this.login=aLogin;
	}
	/**
	 * set the value of mail
	 * @param aMail
	 */
	public void setMail(String aMail){
		this.mail=aMail;
	}
	/**
	 * set the value of password
	 * @param aPassword
	 */
	public void setPassword(String aPassword){
		this.password=aPassword;
	}
	/**
	 * set the value of groupe
	 * @param aGroupe
	 */
	public void setGroupe(KGroupe aGroupe){
		this.groupe=aGroupe;
	}
	/**
	 * set the value of affectations
	 * @param aAffectations
	 */
	public void setAffectations(KListObject<KAffectation> aAffectations){
		this.affectations=aAffectations;
	}
	/**
	 * set the value of messages
	 * @param aMessages
	 */
	public void setMessages(KListObject<KMessage> aMessages){
		this.messages=aMessages;
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
		String strGroupe="";
		if(groupe!=null)
			strGroupe=" ("+groupe.getLibelle()+")";
		return login+strGroupe;
	}
}