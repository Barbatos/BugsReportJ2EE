package net.bo;

import net.ko.kobject.KObject;
import net.ko.persistence.annotation.Entity;
import net.ko.persistence.annotation.Table;
import net.ko.kobject.KListObject;


/**
* Classe KReport
*/
@SuppressWarnings("serial")
@Entity
@Table(name="report")
public class KReport extends KObject {
	private int idUsecase;
	private java.sql.Date dateCreation;
	private String descriptif;
	private int idStatut;
	private int idUtilisateur;
	private String libelle;
	private String reponseOfficielle;
	private String actualResults;
	private String expectedResults;
	public String getExpectedResults() {
		return expectedResults;
	}
	public void setExpectedResults(String expectedResults) {
		this.expectedResults = expectedResults;
	}
	private String userAction;
	private KListObject<KMessage> messages;
	private KStatut statut;
	private KUsecase usecase;
	private KUtilisateur utilisateur;

	public KReport() {
		super();
		belongsTo(KUtilisateur.class);
		belongsTo(KUsecase.class);
		belongsTo(KStatut.class);
		hasMany(KMessage.class);
	}
	/**
	 * return the value of idUsecase
	 * @return idUsecase
	 */
	public int getIdUsecase(){
		return this.idUsecase;
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
	 * return the value of idStatut
	 * @return idStatut
	 */
	public int getIdStatut(){
		return this.idStatut;
	}
	/**
	 * return the value of idUtilisateur
	 * @return idUtilisateur
	 */
	public int getIdUtilisateur(){
		return this.idUtilisateur;
	}
	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}
	/**
	 * return the value of reponseOfficielle
	 * @return reponseOfficielle
	 */
	public String getReponseOfficielle(){
		return this.reponseOfficielle;
	}
	/**
	 * return the value of systemMessage
	 * @return systemMessage
	 */
	public String getActualResults(){
		return this.actualResults;
	}
	/**
	 * return the value of userAction
	 * @return userAction
	 */
	public String getUserAction(){
		return this.userAction;
	}
	/**
	 * return the value of messages
	 * @return messages
	 */
	public KListObject<KMessage> getMessages(){
		return this.messages;
	}
	/**
	 * return the value of statut
	 * @return statut
	 */
	public KStatut getStatut(){
		return this.statut;
	}
	/**
	 * return the value of usecase
	 * @return usecase
	 */
	public KUsecase getUsecase(){
		return this.usecase;
	}
	/**
	 * return the value of utilisateur
	 * @return utilisateur
	 */
	public KUtilisateur getUtilisateur(){
		return this.utilisateur;
	}

	/**
	 * set the value of code
	 * @param aCode
	 */
	public void setIdUsecase(int id){
		this.idUsecase=id;
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
	 * set the value of idStatut
	 * @param aIdStatut
	 */
	public void setIdStatut(int aIdStatut){
		this.idStatut=aIdStatut;
	}
	/**
	 * set the value of idUtilisateur
	 * @param aIdUtilisateur
	 */
	public void setIdUtilisateur(int aIdUtilisateur){
		this.idUtilisateur=aIdUtilisateur;
	}
	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}
	/**
	 * set the value of reponseOfficielle
	 * @param aReponseOfficielle
	 */
	public void setReponseOfficielle(String aReponseOfficielle){
		this.reponseOfficielle=aReponseOfficielle;
	}
	/**
	 * set the value of systemMessage
	 * @param aSystemMessage
	 */
	public void setActualResults(String actualResults){
		this.actualResults=actualResults;
	}
	/**
	 * set the value of userAction
	 * @param aUserAction
	 */
	public void setUserAction(String aUserAction){
		this.userAction=aUserAction;
	}
	/**
	 * set the value of messages
	 * @param aMessages
	 */
	public void setMessages(KListObject<KMessage> aMessages){
		this.messages=aMessages;
	}
	/**
	 * set the value of statut
	 * @param aStatut
	 */
	public void setStatut(KStatut aStatut){
		this.statut=aStatut;
	}
	/**
	 * set the value of usecase
	 * @param aUsecase
	 */
	public void setUsecase(KUsecase aUsecase){
		this.usecase=aUsecase;
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
		return " [dateCreation] = " + dateCreation+" [idStatut] = " + idStatut+" [libelle] = " + libelle+" [userAction] = " + userAction+" [systemMessage] = " + actualResults+" [idUtilisateur] = " + idUtilisateur+" [code] = " + idUsecase+" [descriptif] = " + descriptif+" [reponseOfficielle] = " + reponseOfficielle;
	}
}