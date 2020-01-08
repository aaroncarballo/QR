/**
 * Code generated by WINDEV Mobile - DO NOT MODIFY!
 * WINDEV Mobile object: Fenêtre
 * Android class: WIN_Consultar
 * Date: 27/09/2018 02:59:08
 * Version of wdjava.dll: 22.0.106.0
 */


package com.mycompany.qr.wdgen;


import com.mycompany.qr.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.media.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFWIN_Consultar extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_Consultar
////////////////////////////////////////////////////////////////////////////

/**
 * EDT_Partida
 */
class GWDEDT_Partida extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_Consultar.EDT_Partida
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,125,33);
super.setRectCompPrincipal(125,2,116,33);
super.setQuid(3136641507586167586l);

super.setChecksum("1257434503");

super.setNom("EDT_Partida");

super.setType(20001);

super.setLibelle("Partida");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(9, 9);

super.setTailleInitiale(241, 37);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\My Mobile Projects\\QR\\Templates\\WM\\210 Material Design Green\\Material Design Green_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Whenever modifying EDT_Partida
 */
public void modification()
{
super.modification();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_res = new WDBooleen();



// res is boolean


// res = HExecuteQuery(QRY_Filtro_Inventario,hQueryDefault,EDT_Partida)
vWD_res.setValeur(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("qry_filtro_inventario"),new WDEntier(0),new WDObjet[] {this} ));

// TableDisplay(TABLE_QRY_Filtro_Inventario)
WDAPITable.tableAffiche(mWD_TABLE_QRY_Filtro_Inventario);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDEDT_Partida mWD_EDT_Partida;

/**
 * BTN_QR
 */
class GWDBTN_QR extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_Consultar.BTN_QR
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3136641507586298689l);

super.setChecksum("1257566518");

super.setNom("BTN_QR");

super.setType(4);

super.setLibelle("QR");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(258, 8);

super.setTailleInitiale(55, 38);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 4, 4, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 4, 4, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x50AF4C, 0x2F00, 0x50AF4C, 4, 4, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("C:\\My Mobile Projects\\QR\\Templates\\WM\\210 Material Design Green\\Material Design Green_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Click BTN_QR
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_codigo_qr = WDVarNonAllouee.ref;


// codigo_qr is a BarCode = BCCapture()
vWD_codigo_qr = new WDInstance( new WDCodeBarres() );

vWD_codigo_qr.setValeur(WDAPICodeBarres.cbCapture());


// EDT_Partida = codigo_qr..RoughValue
mWD_EDT_Partida.setValeur(vWD_codigo_qr.getProp(EWDPropriete.PROP_VALEURBRUTE));

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_QR mWD_BTN_QR;

/**
 * TABLE_QRY_Filtro_Inventario
 */
class GWDTABLE_QRY_Filtro_Inventario extends WDTableFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_Consultar.TABLE_QRY_Filtro_Inventario
////////////////////////////////////////////////////////////////////////////

/**
 * COL_InventarioID
 */
class GWDCOL_InventarioID extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_InventarioID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478403988735l);

super.setNom("COL_InventarioID");

super.setType(20004);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(234);

super.setTitre("Identifier of Inventario");

super.setLiaisonFichier("qry_filtro_inventario", "inventarioid");

super.setLargeurMin(14);

super.setVisibleInitial(false);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999 999 999 999 999"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_InventarioID mWD_COL_InventarioID = new GWDCOL_InventarioID();

/**
 * COL_Tipo
 */
class GWDCOL_Tipo extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Tipo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404119823l);

super.setNom("COL_Tipo");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(45);

super.setTitre("Tipo");

super.setLiaisonFichier("qry_filtro_inventario", "tipo");

super.setLargeurMin(14);

super.setVisibleInitial(false);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(3);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Tipo mWD_COL_Tipo = new GWDCOL_Tipo();

/**
 * COL_Documento
 */
class GWDCOL_Documento extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Documento
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404250910l);

super.setNom("COL_Documento");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(140);

super.setTitre("Documento");

super.setLiaisonFichier("qry_filtro_inventario", "documento");

super.setLargeurMin(14);

super.setVisibleInitial(false);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(10);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Documento mWD_COL_Documento = new GWDCOL_Documento();

/**
 * COL_Partida
 */
class GWDCOL_Partida extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Partida
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404381998l);

super.setNom("COL_Partida");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(90);

super.setTitre("Partida");

super.setLiaisonFichier("qry_filtro_inventario", "partida");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(10);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Partida mWD_COL_Partida = new GWDCOL_Partida();

/**
 * COL_Sacos
 */
class GWDCOL_Sacos extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Sacos
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404513086l);

super.setNom("COL_Sacos");

super.setType(20004);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(83);

super.setTitre("Sacos");

super.setLiaisonFichier("qry_filtro_inventario", "sacos");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("+9 999 999 999"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Sacos mWD_COL_Sacos = new GWDCOL_Sacos();

/**
 * COL_PesoNeto
 */
class GWDCOL_PesoNeto extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_PesoNeto
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404644173l);

super.setNom("COL_PesoNeto");

super.setType(20004);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(102);

super.setTitre("PesoNeto");

super.setLiaisonFichier("qry_filtro_inventario", "pesoneto");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("+99 999,99"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_PesoNeto mWD_COL_PesoNeto = new GWDCOL_PesoNeto();

/**
 * COL_Fecha
 */
class GWDCOL_Fecha extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Fecha
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404775277l);

super.setNom("COL_Fecha");

super.setType(20002);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(110);

super.setTitre("Fecha");

super.setLiaisonFichier("qry_filtro_inventario", "fecha");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("UseSystemMask"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Fecha mWD_COL_Fecha = new GWDCOL_Fecha();

/**
 * COL_Expr1
 */
class GWDCOL_Expr1 extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Expr1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478404906364l);

super.setNom("COL_Expr1");

super.setType(20004);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(174);

super.setTitre("Sacos");

super.setLiaisonFichier("qry_filtro_inventario", "expr1");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("+9 999 999 999"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Expr1 mWD_COL_Expr1 = new GWDCOL_Expr1();

/**
 * COL_Tipocafe
 */
class GWDCOL_Tipocafe extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Tipocafe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478405037452l);

super.setNom("COL_Tipocafe");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(19);

super.setTitre("Tipocafe");

super.setLiaisonFichier("qry_filtro_inventario", "tipocafe");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(1);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Tipocafe mWD_COL_Tipocafe = new GWDCOL_Tipocafe();

/**
 * COL_Calidad
 */
class GWDCOL_Calidad extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Calidad
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478405168539l);

super.setNom("COL_Calidad");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(136);

super.setTitre("Calidad");

super.setLiaisonFichier("qry_filtro_inventario", "calidad");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(10);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Calidad mWD_COL_Calidad = new GWDCOL_Calidad();

/**
 * COL_Expr2
 */
class GWDCOL_Expr2 extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de WIN_Consultar.TABLE_QRY_Filtro_Inventario.COL_Expr2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478405299627l);

super.setNom("COL_Expr2");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setEtatInitial(0);

super.setLargeurInitiale(19);

super.setTitre("Tipocafe");

super.setLiaisonFichier("qry_filtro_inventario", "expr2");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(1);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Expr2 mWD_COL_Expr2 = new GWDCOL_Expr2();
/**
 * Initialise tous les champs de WIN_Consultar.TABLE_QRY_Filtro_Inventario
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_Consultar.TABLE_QRY_Filtro_Inventario
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("COL_InventarioID",mWD_COL_InventarioID);
super.ajouterColonne("COL_Tipo",mWD_COL_Tipo);
super.ajouterColonne("COL_Documento",mWD_COL_Documento);
super.ajouterColonne("COL_Partida",mWD_COL_Partida);
super.ajouterColonne("COL_Sacos",mWD_COL_Sacos);
super.ajouterColonne("COL_PesoNeto",mWD_COL_PesoNeto);
super.ajouterColonne("COL_Fecha",mWD_COL_Fecha);
super.ajouterColonne("COL_Expr1",mWD_COL_Expr1);
super.ajouterColonne("COL_Tipocafe",mWD_COL_Tipocafe);
super.ajouterColonne("COL_Calidad",mWD_COL_Calidad);
super.ajouterColonne("COL_Expr2",mWD_COL_Expr2);
mWD_COL_InventarioID.initialiserObjet();
mWD_COL_Tipo.initialiserObjet();
mWD_COL_Documento.initialiserObjet();
mWD_COL_Partida.initialiserObjet();
mWD_COL_Sacos.initialiserObjet();
mWD_COL_PesoNeto.initialiserObjet();
mWD_COL_Fecha.initialiserObjet();
mWD_COL_Expr1.initialiserObjet();
mWD_COL_Tipocafe.initialiserObjet();
mWD_COL_Calidad.initialiserObjet();
mWD_COL_Expr2.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3146958478403792065l);

super.setChecksum("1070971610");

super.setNom("TABLE_QRY_Filtro_Inventario");

super.setType(9);

super.setLibelle("QRY_Filtro_Inventario Table");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(0, 54);

super.setTailleInitiale(320, 354);

super.setValeurInitiale("");

super.setPlan(0);

super.setSourceRemplissage("qry_filtro_inventario", "", "", true, "", false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setHauteurLigne(48);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setNumColonneAncree(2);

super.setEnregistrementSortieLigne(true);

super.setPersistant(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xE1E1E1);

super.setStyleSeparateurHorizontaux(0, 0xE1E1E1);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0xE1E1E1, 0x616161, 0xF0F0F0, 4, 4, 1, 1));

super.setDessinerLigneVide(true);

super.setCouleursLigne(0x222222, 0xF0F0F0, 0x222222, 0xFFFFFF);

super.setStyleSelection(0x222222, 0xE2E2E2, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleEnteteColonne(23, 1, WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0x50AF4C, 4, 4, 1, 1), creerPolice_GEN("Roboto", -8.000000, 0), 0xFFFFFF, true, "C:\\My Mobile Projects\\QR\\Templates\\WM\\210 Material Design Green\\Material Design Green_Table_ColPict@dpi160.png");

super.setCadreFondLigne(WDCadreFactory.creerCadre_GEN("", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 0xFFFFFFFF, 0, 5));

super.setPoliceColonne(creerPolice_GEN("Roboto", -8.000000, 0));

super.setScrollRapideTable(false, null);

super.setBtnEnrouleDeroule(true);

super.setSwipe(0);

super.setNbMaxLignes(0);

super.setImagePlusMoins("C:\\My Mobile Projects\\QR\\Templates\\WM\\210 Material Design Green\\Material Design Green_Break_Pict@dpi160.png?E2_");

super.setMargeInterneEnteteColonne(0, 0, 0, 0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Initializing TABLE_QRY_Filtro_Inventario
 */
public void init()
//  The control is using a query with parameters to display its data.
//  The parameters of this query must be defined before or when initializing the control.
//  The query will be automatically run if at least one parameter was defined.
// 
//  See the help for more details:
//  Query with parameters, Using a table, list box or combo box control
// 
//  Parameters of 'QRY_Filtro_Inventario' query
{
super.init();

// MySource.pPartida = ""
WDContexte.getMaSource().get("pPartida").setValeur("");

}




/**
 * Traitement: Selecting a row of TABLE_QRY_Filtro_Inventario
 */
public void selectionLigne()
{
super.selectionLigne();

// IF TableCount(TABLE_QRY_Filtro_Inventario)>0 THEN
if(WDAPITable.tableOccurrence(this).opSup(0))
{
// 	gnInventarioseleccionado = TABLE_QRY_Filtro_Inventario.COL_InventarioID
GWDPQR.ms_Project.vWD_gnInventarioseleccionado.setValeur(mWD_COL_InventarioID);

// 	OpenMobileWindow(WIN_Detalle_Inventario)
WDAPIFenetre.ouvreFille(GWDPQR.ms_Project.mWD_WIN_Detalle_Inventario);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}
protected final int getIdEnteteAt(int nColonne, int nLigne) {return 0;}
protected final String getLibelleEnteteFromId(int nId) {return null;}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTABLE_QRY_Filtro_Inventario mWD_TABLE_QRY_Filtro_Inventario;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_Consultar.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 3, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x50AF4C, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * WIN_Consultar_LeftSliding
 */
class GWDWIN_Consultar_LeftSliding extends WDSlidingMenu
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_Consultar.WIN_Consultar_LeftSliding
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setFenetreInterne("IW_Menu");

super.setParamSlidingMenu(0, true, 0);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDWIN_Consultar_LeftSliding mWD_WIN_Consultar_LeftSliding;

/**
 * Traitement: Global declarations of WIN_Consultar
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: End of initialization of WIN_Consultar
 */
public void init()
{
super.init();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_res = new WDBooleen();



// res is boolean


// res = HExecuteQuery(QRY_Filtro_Inventario,hQueryDefault,"")
vWD_res.setValeur(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("qry_filtro_inventario"),new WDEntier(0),new WDObjet[] {new WDChaineU("")} ));

// TableDisplay(TABLE_QRY_Filtro_Inventario)  //NO PUEDE FALTAR
WDAPITable.tableAffiche(mWD_TABLE_QRY_Filtro_Inventario);

// ScreenFirst(EDT_Partida)
WDAPIDivers.ecranPremier(mWD_EDT_Partida);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre WIN_Consultar
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_EDT_Partida = new GWDEDT_Partida();
mWD_BTN_QR = new GWDBTN_QR();
mWD_TABLE_QRY_Filtro_Inventario = new GWDTABLE_QRY_Filtro_Inventario();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD_WIN_Consultar_LeftSliding = new GWDWIN_Consultar_LeftSliding();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre WIN_Consultar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3124901218534143065l);

super.setChecksum("1015724284");

super.setNom("WIN_Consultar");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 408);

super.setTitre("Inventario");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_Consultar
////////////////////////////////////////////////////////////////////////////
mWD_EDT_Partida.initialiserObjet();
super.ajouter("EDT_Partida", mWD_EDT_Partida);
mWD_BTN_QR.initialiserObjet();
super.ajouter("BTN_QR", mWD_BTN_QR);
mWD_TABLE_QRY_Filtro_Inventario.initialiserObjet();
super.ajouter("TABLE_QRY_Filtro_Inventario", mWD_TABLE_QRY_Filtro_Inventario);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD_WIN_Consultar_LeftSliding.initialiserObjet();
super.ajouterSlidingMenu(mWD_WIN_Consultar_LeftSliding, 0);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPQR.ms_Project.mWD_WIN_Consultar;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN GREEN#WM";
}
}
