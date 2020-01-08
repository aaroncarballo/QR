/**
 * Code generated by WINDEV Mobile - DO NOT MODIFY!
 * WINDEV Mobile object: Projet
 * Android class: QR
 * Date: 27/09/2018 03:22:29
 * Version of wdjava.dll: 22.0.106.0
 */


package com.mycompany.qr.wdgen;


import com.mycompany.qr.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ws.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPQR extends WDProjet
{
/**
 * Accès au projet: QR
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPQR.ms_Project
 */
public static GWDPQR ms_Project;

 // WIN_Toma_Fisica
public GWDFWIN_Toma_Fisica mWD_WIN_Toma_Fisica = new GWDFWIN_Toma_Fisica();
 // accesseur de WIN_Toma_Fisica
public GWDFWIN_Toma_Fisica getWIN_Toma_Fisica()
{
mWD_WIN_Toma_Fisica.verifierOuverte();
return mWD_WIN_Toma_Fisica;
}

 // WIN_Consultar
public GWDFWIN_Consultar mWD_WIN_Consultar = new GWDFWIN_Consultar();
 // accesseur de WIN_Consultar
public GWDFWIN_Consultar getWIN_Consultar()
{
mWD_WIN_Consultar.verifierOuverte();
return mWD_WIN_Consultar;
}

 // WIN_Bajar
public GWDFWIN_Bajar mWD_WIN_Bajar = new GWDFWIN_Bajar();
 // accesseur de WIN_Bajar
public GWDFWIN_Bajar getWIN_Bajar()
{
mWD_WIN_Bajar.verifierOuverte();
return mWD_WIN_Bajar;
}

 // WIN_Cargar
public GWDFWIN_Cargar mWD_WIN_Cargar = new GWDFWIN_Cargar();
 // accesseur de WIN_Cargar
public GWDFWIN_Cargar getWIN_Cargar()
{
mWD_WIN_Cargar.verifierOuverte();
return mWD_WIN_Cargar;
}

 // WIN_Cargar_Datos
public GWDFWIN_Cargar_Datos mWD_WIN_Cargar_Datos = new GWDFWIN_Cargar_Datos();
 // accesseur de WIN_Cargar_Datos
public GWDFWIN_Cargar_Datos getWIN_Cargar_Datos()
{
mWD_WIN_Cargar_Datos.verifierOuverte();
return mWD_WIN_Cargar_Datos;
}

 // WIN_Enviar_Datos
public GWDFWIN_Enviar_Datos mWD_WIN_Enviar_Datos = new GWDFWIN_Enviar_Datos();
 // accesseur de WIN_Enviar_Datos
public GWDFWIN_Enviar_Datos getWIN_Enviar_Datos()
{
mWD_WIN_Enviar_Datos.verifierOuverte();
return mWD_WIN_Enviar_Datos;
}

 // WIN_Registro
public GWDFWIN_Registro mWD_WIN_Registro = new GWDFWIN_Registro();
 // accesseur de WIN_Registro
public GWDFWIN_Registro getWIN_Registro()
{
mWD_WIN_Registro.verifierOuverte();
return mWD_WIN_Registro;
}

 // WIN_Login
public GWDFWIN_Login mWD_WIN_Login = new GWDFWIN_Login();
 // accesseur de WIN_Login
public GWDFWIN_Login getWIN_Login()
{
mWD_WIN_Login.verifierOuverte();
return mWD_WIN_Login;
}

 // WIN_Detalle_Inventario
public GWDFWIN_Detalle_Inventario mWD_WIN_Detalle_Inventario = new GWDFWIN_Detalle_Inventario();
 // accesseur de WIN_Detalle_Inventario
public GWDFWIN_Detalle_Inventario getWIN_Detalle_Inventario()
{
mWD_WIN_Detalle_Inventario.verifierOuverte();
return mWD_WIN_Detalle_Inventario;
}

 // WIN_Detalle_Toma_Fisica
public GWDFWIN_Detalle_Toma_Fisica mWD_WIN_Detalle_Toma_Fisica = new GWDFWIN_Detalle_Toma_Fisica();
 // accesseur de WIN_Detalle_Toma_Fisica
public GWDFWIN_Detalle_Toma_Fisica getWIN_Detalle_Toma_Fisica()
{
mWD_WIN_Detalle_Toma_Fisica.verifierOuverte();
return mWD_WIN_Detalle_Toma_Fisica;
}

 // WIN_Crear_Toma_Fisica
public GWDFWIN_Crear_Toma_Fisica mWD_WIN_Crear_Toma_Fisica = new GWDFWIN_Crear_Toma_Fisica();
 // accesseur de WIN_Crear_Toma_Fisica
public GWDFWIN_Crear_Toma_Fisica getWIN_Crear_Toma_Fisica()
{
mWD_WIN_Crear_Toma_Fisica.verifierOuverte();
return mWD_WIN_Crear_Toma_Fisica;
}

 // WIN_Menu
public GWDFWIN_Menu mWD_WIN_Menu = new GWDFWIN_Menu();
 // accesseur de WIN_Menu
public GWDFWIN_Menu getWIN_Menu()
{
mWD_WIN_Menu.verifierOuverte();
return mWD_WIN_Menu;
}


 // IW_Menu
public GWDFIIW_Menu mWD_IW_Menu = new GWDFIIW_Menu();
 // accesseur de IW_Menu
public GWDFIIW_Menu getIW_Menu()
{
GWDFIIW_Menu fiCtx = (GWDFIIW_Menu)WDAppelContexte.getContexte().getFenetreInterne("IW_Menu");
return fiCtx != null ? fiCtx  : mWD_IW_Menu;
}

 // Constructeur de la classe GWDPQR
public GWDPQR()
{
ajouterFenetre("WIN_Toma_Fisica", mWD_WIN_Toma_Fisica);
ajouterFenetre("WIN_Consultar", mWD_WIN_Consultar);
ajouterFenetre("WIN_Bajar", mWD_WIN_Bajar);
ajouterFenetre("WIN_Cargar", mWD_WIN_Cargar);
ajouterFenetre("WIN_Cargar_Datos", mWD_WIN_Cargar_Datos);
ajouterFenetre("WIN_Enviar_Datos", mWD_WIN_Enviar_Datos);
ajouterFenetre("WIN_Registro", mWD_WIN_Registro);
ajouterFenetre("WIN_Login", mWD_WIN_Login);
ajouterFenetre("WIN_Detalle_Inventario", mWD_WIN_Detalle_Inventario);
ajouterFenetre("WIN_Detalle_Toma_Fisica", mWD_WIN_Detalle_Toma_Fisica);
ajouterFenetre("WIN_Crear_Toma_Fisica", mWD_WIN_Crear_Toma_Fisica);
ajouterFenetre("WIN_Menu", mWD_WIN_Menu);
ajouterFenetreInterne("IW_Menu");

ajouterRequeteWDR( new GWDRQRY_Login() );
ajouterRequeteWDR( new GWDRQRY_Filtro_TomaFisica() );
ajouterRequeteWDR( new GWDRQRY_Filtro_Inventario() );
// Exportation des WebServices
WDWSManager.declarerWebService("WSDataSQLService", "http://190.5.117.28/wsdatasql/wsdatasqlservice.asmx?wsdl");
}

// Code de déclaration de QR
public void initProjet()
{
// gnTomaseleccionada is int //Fila seleccionada de la tabla toma fisica
vWD_gnTomaseleccionada = new WDEntier();

super.ajouterVariableGlobale("gnTomaseleccionada",vWD_gnTomaseleccionada);



// gnInventarioseleccionado is int //Fila seleccionada de la tabla inventario
vWD_gnInventarioseleccionado = new WDEntier();

super.ajouterVariableGlobale("gnInventarioseleccionado",vWD_gnInventarioseleccionado);



// gsDireccionLocal is string //Direccion ip en caso que se encuentre en el almacén
vWD_gsDireccionLocal = new WDChaineU();

super.ajouterVariableGlobale("gsDireccionLocal",vWD_gsDireccionLocal);



// gdfecha_acceso is Date
vWD_gdfecha_acceso = new WDDate();

super.ajouterVariableGlobale("gdfecha_acceso",vWD_gdfecha_acceso);



// gthora_acceso is Time
vWD_gthora_acceso = new WDHeure();

super.ajouterVariableGlobale("gthora_acceso",vWD_gthora_acceso);



// gsNombreaplicacion is string 
vWD_gsNombreaplicacion = new WDChaineU();

super.ajouterVariableGlobale("gsNombreaplicacion",vWD_gsNombreaplicacion);



// sfile is string
vWD_sfile = new WDChaineU();

super.ajouterVariableGlobale("sfile",vWD_sfile);



// sCampos is array of string
vWD_sCampos = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sCampos",vWD_sCampos);



// sCamposimg is array of string
vWD_sCamposimg = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sCamposimg",vWD_sCamposimg);



// sCamposExt is array of string
vWD_sCamposExt = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sCamposExt",vWD_sCamposExt);



// sCamposExtimg is array of string
vWD_sCamposExtimg = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sCamposExtimg",vWD_sCamposExtimg);



// sTipodestinoimg is array of string
vWD_sTipodestinoimg = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sTipodestinoimg",vWD_sTipodestinoimg);



// sParametrosimg is array of string 
vWD_sParametrosimg = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sParametrosimg",vWD_sParametrosimg);



// sValParametrosimg is array of string 
vWD_sValParametrosimg = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sValParametrosimg",vWD_sValParametrosimg);



// sFilltabla is array of string
vWD_sFilltabla = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sFilltabla",vWD_sFilltabla);



// sFillTipos is array of string
vWD_sFillTipos = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sFillTipos",vWD_sFillTipos);



// sFillcampobuscar is array of string
vWD_sFillcampobuscar = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sFillcampobuscar",vWD_sFillcampobuscar);



// sFillcampollenar is array of string
vWD_sFillcampollenar = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sFillcampollenar",vWD_sFillcampollenar);



// sFillcampovalor is array of string
vWD_sFillcampovalor = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sFillcampovalor",vWD_sFillcampovalor);



// sTipos is array of string
vWD_sTipos = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sTipos",vWD_sTipos);



// gsSqlwhere is string
vWD_gsSqlwhere = new WDChaineU();

super.ajouterVariableGlobale("gsSqlwhere",vWD_gsSqlwhere);



// gssqlcampos is string
vWD_gssqlcampos = new WDChaineU();

super.ajouterVariableGlobale("gssqlcampos",vWD_gssqlcampos);



// gssqlvalores is string
vWD_gssqlvalores = new WDChaineU();

super.ajouterVariableGlobale("gssqlvalores",vWD_gssqlvalores);



// sWhere is string
vWD_sWhere = new WDChaineU();

super.ajouterVariableGlobale("sWhere",vWD_sWhere);



// gsTablename is string
vWD_gsTablename = new WDChaineU();

super.ajouterVariableGlobale("gsTablename",vWD_gsTablename);



// sParametros is string
vWD_sParametros = new WDChaineU();

super.ajouterVariableGlobale("sParametros",vWD_sParametros);



// scamposlocales is array of string
vWD_scamposlocales = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("scamposlocales",vWD_scamposlocales);



// sTiposlocales is array of string
vWD_sTiposlocales = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sTiposlocales",vWD_sTiposlocales);



// sValoreslocales is array of string
vWD_sValoreslocales = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("sValoreslocales",vWD_sValoreslocales);



// arrSParametros is array of string
vWD_arrSParametros = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("arrSParametros",vWD_arrSParametros);



// arrSValParametros is array of string
vWD_arrSValParametros = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("arrSValParametros",vWD_arrSValParametros);



// sListacampos is string
vWD_sListacampos = new WDChaineU();

super.ajouterVariableGlobale("sListacampos",vWD_sListacampos);



// sListavalores is string
vWD_sListavalores = new WDChaineU();

super.ajouterVariableGlobale("sListavalores",vWD_sListavalores);



// sWinname is string
vWD_sWinname = new WDChaineU();

super.ajouterVariableGlobale("sWinname",vWD_sWinname);



// gsParzonas is string
vWD_gsParzonas = new WDChaineU();

super.ajouterVariableGlobale("gsParzonas",vWD_gsParzonas);



// gsParzonaswhere is string
vWD_gsParzonaswhere = new WDChaineU();

super.ajouterVariableGlobale("gsParzonaswhere",vWD_gsParzonaswhere);



// gscodigofinca is string
vWD_gscodigofinca = new WDChaineU();

super.ajouterVariableGlobale("gscodigofinca",vWD_gscodigofinca);



// gsParFecha is string = DateToString(Today(),"yyyy-mm-dd")
vWD_gsParFecha = new WDChaineU();

vWD_gsParFecha.setValeur(WDAPIDate.dateVersChaine(WDAPIDate.dateDuJour(),"yyyy-mm-dd"));

super.ajouterVariableGlobale("gsParFecha",vWD_gsParFecha);



// gsProveedor is string
vWD_gsProveedor = new WDChaineU();

super.ajouterVariableGlobale("gsProveedor",vWD_gsProveedor);



// gscosecha is string
vWD_gscosecha = new WDChaineU();

super.ajouterVariableGlobale("gscosecha",vWD_gscosecha);



// gswsurl is string
vWD_gswsurl = new WDChaineU();

super.ajouterVariableGlobale("gswsurl",vWD_gswsurl);



// gsfinca is string 
vWD_gsfinca = new WDChaineU();

super.ajouterVariableGlobale("gsfinca",vWD_gsfinca);



// gsidfinca is string 
vWD_gsidfinca = new WDChaineU();

super.ajouterVariableGlobale("gsidfinca",vWD_gsidfinca);



// gsactividadanterior is string 
vWD_gsactividadanterior = new WDChaineU();

super.ajouterVariableGlobale("gsactividadanterior",vWD_gsactividadanterior);



// nuevaubicacion is boolean = False
vWD_nuevaubicacion = new WDBooleen();

vWD_nuevaubicacion.setValeur(false);

super.ajouterVariableGlobale("nuevaubicacion",vWD_nuevaubicacion);



// gnidfinca is int
vWD_gnidfinca = new WDEntier();

super.ajouterVariableGlobale("gnidfinca",vWD_gnidfinca);



// gnLastplane is int = 0
vWD_gnLastplane = new WDEntier();

vWD_gnLastplane.setValeur(0);

super.ajouterVariableGlobale("gnLastplane",vWD_gnLastplane);



// gsStablename is string 
vWD_gsStablename = new WDChaineU();

super.ajouterVariableGlobale("gsStablename",vWD_gsStablename);



// gsTabla is string
vWD_gsTabla = new WDChaineU();

super.ajouterVariableGlobale("gsTabla",vWD_gsTabla);



// sorder is string 
vWD_sorder = new WDChaineU();

super.ajouterVariableGlobale("sorder",vWD_sorder);



// gsClavereciente is string
vWD_gsClavereciente = new WDChaineU();

super.ajouterVariableGlobale("gsClavereciente",vWD_gsClavereciente);



// gsusuarioreciente is string
vWD_gsusuarioreciente = new WDChaineU();

super.ajouterVariableGlobale("gsusuarioreciente",vWD_gsusuarioreciente);



// gslastcontacto is string 
vWD_gslastcontacto = new WDChaineU();

super.ajouterVariableGlobale("gslastcontacto",vWD_gslastcontacto);



// sUrl is string
vWD_sUrl = new WDChaineU();

super.ajouterVariableGlobale("sUrl",vWD_sUrl);



// sservidor is string
vWD_sservidor = new WDChaineU();

super.ajouterVariableGlobale("sservidor",vWD_sservidor);



// sBasededatos is string
vWD_sBasededatos = new WDChaineU();

super.ajouterVariableGlobale("sBasededatos",vWD_sBasededatos);



// sUsuario is string
vWD_sUsuario = new WDChaineU();

super.ajouterVariableGlobale("sUsuario",vWD_sUsuario);



// sClave is string
vWD_sClave = new WDChaineU();

super.ajouterVariableGlobale("sClave",vWD_sClave);



// sInstancia is string
vWD_sInstancia = new WDChaineU();

super.ajouterVariableGlobale("sInstancia",vWD_sInstancia);



// gdFechaIni is Date
vWD_gdFechaIni = new WDDate();

super.ajouterVariableGlobale("gdFechaIni",vWD_gdFechaIni);



// gdFecha is Date
vWD_gdFecha = new WDDate();

super.ajouterVariableGlobale("gdFecha",vWD_gdFecha);



// sProveedorinventario is string
vWD_sProveedorinventario = new WDChaineU();

super.ajouterVariableGlobale("sProveedorinventario",vWD_sProveedorinventario);



// gnIinventario is int
vWD_gnIinventario = new WDEntier();

super.ajouterVariableGlobale("gnIinventario",vWD_gnIinventario);



// gstiposdocumento is string
vWD_gstiposdocumento = new WDChaineU();

super.ajouterVariableGlobale("gstiposdocumento",vWD_gstiposdocumento);



// arrSelcuentas is array of int
vWD_arrSelcuentas = new WDTableauSimple(1, new int[]{0}, 0, 8);
super.ajouterVariableGlobale("arrSelcuentas",vWD_arrSelcuentas);



// arrSelprovedores is array of int
vWD_arrSelprovedores = new WDTableauSimple(1, new int[]{0}, 0, 8);
super.ajouterVariableGlobale("arrSelprovedores",vWD_arrSelprovedores);



// arrSeluuid is array of string
vWD_arrSeluuid = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("arrSeluuid",vWD_arrSeluuid);



// arrSelnombreproveedor is array of string
vWD_arrSelnombreproveedor = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("arrSelnombreproveedor",vWD_arrSelnombreproveedor);



// arrSelNombre is array of string
vWD_arrSelNombre = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("arrSelNombre",vWD_arrSelNombre);



// arrSeltipodoc is array of int
vWD_arrSeltipodoc = new WDTableauSimple(1, new int[]{0}, 0, 8);
super.ajouterVariableGlobale("arrSeltipodoc",vWD_arrSeltipodoc);



// arrSelnombretipodoc is array of string
vWD_arrSelnombretipodoc = new WDTableauSimple(1, new int[]{0}, 0, 16);
super.ajouterVariableGlobale("arrSelnombretipodoc",vWD_arrSelnombretipodoc);



// paramsolicitudesid is int
vWD_paramsolicitudesid = new WDEntier();

super.ajouterVariableGlobale("paramsolicitudesid",vWD_paramsolicitudesid);



// gnParamsolbodega is int 
vWD_gnParamsolbodega = new WDEntier();

super.ajouterVariableGlobale("gnParamsolbodega",vWD_gnParamsolbodega);



// sId is string
vWD_sId = new WDChaineU();

super.ajouterVariableGlobale("sId",vWD_sId);



// gbInicial is boolean = False
vWD_gbInicial = new WDBooleen();

vWD_gbInicial.setValeur(false);

super.ajouterVariableGlobale("gbInicial",vWD_gbInicial);



// gnaccesodatos is int =1
vWD_gnaccesodatos = new WDEntier();

vWD_gnaccesodatos.setValeur(1);

super.ajouterVariableGlobale("gnaccesodatos",vWD_gnaccesodatos);



}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_gnTomaseleccionada = WDVarNonAllouee.ref;
static public WDObjet vWD_gnInventarioseleccionado = WDVarNonAllouee.ref;
static public WDObjet vWD_gsDireccionLocal = WDVarNonAllouee.ref;
static public WDObjet vWD_gdfecha_acceso = WDVarNonAllouee.ref;
static public WDObjet vWD_gthora_acceso = WDVarNonAllouee.ref;
static public WDObjet vWD_gsNombreaplicacion = WDVarNonAllouee.ref;
static public WDObjet vWD_sfile = WDVarNonAllouee.ref;
static public WDObjet vWD_sCampos = WDVarNonAllouee.ref;
static public WDObjet vWD_sCamposimg = WDVarNonAllouee.ref;
static public WDObjet vWD_sCamposExt = WDVarNonAllouee.ref;
static public WDObjet vWD_sCamposExtimg = WDVarNonAllouee.ref;
static public WDObjet vWD_sTipodestinoimg = WDVarNonAllouee.ref;
static public WDObjet vWD_sParametrosimg = WDVarNonAllouee.ref;
static public WDObjet vWD_sValParametrosimg = WDVarNonAllouee.ref;
static public WDObjet vWD_sFilltabla = WDVarNonAllouee.ref;
static public WDObjet vWD_sFillTipos = WDVarNonAllouee.ref;
static public WDObjet vWD_sFillcampobuscar = WDVarNonAllouee.ref;
static public WDObjet vWD_sFillcampollenar = WDVarNonAllouee.ref;
static public WDObjet vWD_sFillcampovalor = WDVarNonAllouee.ref;
static public WDObjet vWD_sTipos = WDVarNonAllouee.ref;
static public WDObjet vWD_gsSqlwhere = WDVarNonAllouee.ref;
static public WDObjet vWD_gssqlcampos = WDVarNonAllouee.ref;
static public WDObjet vWD_gssqlvalores = WDVarNonAllouee.ref;
static public WDObjet vWD_sWhere = WDVarNonAllouee.ref;
static public WDObjet vWD_gsTablename = WDVarNonAllouee.ref;
static public WDObjet vWD_sParametros = WDVarNonAllouee.ref;
static public WDObjet vWD_scamposlocales = WDVarNonAllouee.ref;
static public WDObjet vWD_sTiposlocales = WDVarNonAllouee.ref;
static public WDObjet vWD_sValoreslocales = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSParametros = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSValParametros = WDVarNonAllouee.ref;
static public WDObjet vWD_sListacampos = WDVarNonAllouee.ref;
static public WDObjet vWD_sListavalores = WDVarNonAllouee.ref;
static public WDObjet vWD_sWinname = WDVarNonAllouee.ref;
static public WDObjet vWD_gsParzonas = WDVarNonAllouee.ref;
static public WDObjet vWD_gsParzonaswhere = WDVarNonAllouee.ref;
static public WDObjet vWD_gscodigofinca = WDVarNonAllouee.ref;
static public WDObjet vWD_gsParFecha = WDVarNonAllouee.ref;
static public WDObjet vWD_gsProveedor = WDVarNonAllouee.ref;
static public WDObjet vWD_gscosecha = WDVarNonAllouee.ref;
static public WDObjet vWD_gswsurl = WDVarNonAllouee.ref;
static public WDObjet vWD_gsfinca = WDVarNonAllouee.ref;
static public WDObjet vWD_gsidfinca = WDVarNonAllouee.ref;
static public WDObjet vWD_gsactividadanterior = WDVarNonAllouee.ref;
static public WDObjet vWD_nuevaubicacion = WDVarNonAllouee.ref;
static public WDObjet vWD_gnidfinca = WDVarNonAllouee.ref;
static public WDObjet vWD_gnLastplane = WDVarNonAllouee.ref;
static public WDObjet vWD_gsStablename = WDVarNonAllouee.ref;
static public WDObjet vWD_gsTabla = WDVarNonAllouee.ref;
static public WDObjet vWD_sorder = WDVarNonAllouee.ref;
static public WDObjet vWD_gsClavereciente = WDVarNonAllouee.ref;
static public WDObjet vWD_gsusuarioreciente = WDVarNonAllouee.ref;
static public WDObjet vWD_gslastcontacto = WDVarNonAllouee.ref;
static public WDObjet vWD_sUrl = WDVarNonAllouee.ref;
static public WDObjet vWD_sservidor = WDVarNonAllouee.ref;
static public WDObjet vWD_sBasededatos = WDVarNonAllouee.ref;
static public WDObjet vWD_sUsuario = WDVarNonAllouee.ref;
static public WDObjet vWD_sClave = WDVarNonAllouee.ref;
static public WDObjet vWD_sInstancia = WDVarNonAllouee.ref;
static public WDObjet vWD_gdFechaIni = WDVarNonAllouee.ref;
static public WDObjet vWD_gdFecha = WDVarNonAllouee.ref;
static public WDObjet vWD_sProveedorinventario = WDVarNonAllouee.ref;
static public WDObjet vWD_gnIinventario = WDVarNonAllouee.ref;
static public WDObjet vWD_gstiposdocumento = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSelcuentas = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSelprovedores = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSeluuid = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSelnombreproveedor = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSelNombre = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSeltipodoc = WDVarNonAllouee.ref;
static public WDObjet vWD_arrSelnombretipodoc = WDVarNonAllouee.ref;
static public WDObjet vWD_paramsolicitudesid = WDVarNonAllouee.ref;
static public WDObjet vWD_gnParamsolbodega = WDVarNonAllouee.ref;
static public WDObjet vWD_sId = WDVarNonAllouee.ref;
static public WDObjet vWD_gbInicial = WDVarNonAllouee.ref;
static public WDObjet vWD_gnaccesodatos = WDVarNonAllouee.ref;
static
{
// Allocation de l'objet global
GWDPQR.ms_Project = new GWDPQR();

// Définition des langues du projet
GWDPQR.ms_Project.setLangueProjet(new int[] {2}, new int[] {0}, 2, false);
GWDPQR.ms_Project.setNomAnalyseProjet("qr");
GWDPQR.ms_Project.setModeGestionFichier(true);
GWDPQR.ms_Project.setCreationAutomatiqueFichierDonnees(true);
GWDPQR.ms_Project.setNomCollectionProcedure(new String[]{"GWDCPCOL_GlobalProcedures"});
}
public String getVersionApplication(){ return "0.0.10.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "QR";}
public int getIdNomApplication(){return com.mycompany.qr.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.mycompany.qr";}
public int getIdIconeApplication(){ return com.mycompany.qr.R.drawable.logonkg_2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 24;
case HAUTEUR_BARRE_TITRE : return 48;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 480;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\PLUS.PNG?E5",com.mycompany.qr.R.drawable.plus_30_selector, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\DELETE.PNG?E5",com.mycompany.qr.R.drawable.delete_29_selector, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_BTN_MENU.PNG?E5_3NP_10_10_10_10",com.mycompany.qr.R.drawable.material_design_green_btn_menu_28_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_TABLE_COLPICT.PNG",com.mycompany.qr.R.drawable.material_design_green_table_colpict_27, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_ROLLOVER.PNG",com.mycompany.qr.R.drawable.material_design_green_rollover_26, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_CBOX_TABLE.PNG",com.mycompany.qr.R.drawable.material_design_green_cbox_table_25, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_BREAK_PICT.PNG?E2_",com.mycompany.qr.R.drawable.material_design_green_break_pict_24_selector, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_BREAK.PNG",com.mycompany.qr.R.drawable.material_design_green_break_23, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_EDT.PNG?E5_3NP_8_8_8_8",com.mycompany.qr.R.drawable.material_design_green_edt_22_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_CBOX.PNG?E12_Radio",com.mycompany.qr.R.drawable.material_design_green_cbox_21_selector, "");
super.ajouterFichierAssocie("C:\\MY MOBILE PROJECTS\\QR\\TEMPLATES\\WM\\210 MATERIAL DESIGN GREEN\\MATERIAL DESIGN GREEN_BTN_STD.PNG?E5_3NP_10_10_10_10",com.mycompany.qr.R.drawable.material_design_green_btn_std_20_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("http://190.5.117.28/wsdatasql/wsdatasqlservice.asmx?wsdl",com.mycompany.qr.R.raw.wsdatasqlservice_19, "");
super.ajouterFichierAssocie("Interface.FIC",com.mycompany.qr.R.raw.interface_18, "##BDD##/interface.fic");
super.ajouterFichierAssocie("Tabla_InterfaseImagen.FIC",com.mycompany.qr.R.raw.tabla_interfaseimagen_17, "##BDD##/tabla_interfaseimagen.fic");
super.ajouterFichierAssocie("Interface.ndx",com.mycompany.qr.R.raw.interface_16, "##BDD##/interface.ndx");
super.ajouterFichierAssocie("Tabla_InterfaseImagen.ndx",com.mycompany.qr.R.raw.tabla_interfaseimagen_15, "##BDD##/tabla_interfaseimagen.ndx");
super.ajouterFichierAssocie("Tabla_interface.FIC",com.mycompany.qr.R.raw.tabla_interface_14, "##BDD##/tabla_interface.fic");
super.ajouterFichierAssocie("TomaFisica.fic",com.mycompany.qr.R.raw.tomafisica_13, "##BDD##/tomafisica.fic");
super.ajouterFichierAssocie("TomaFisica.ndx",com.mycompany.qr.R.raw.tomafisica_12, "##BDD##/tomafisica.ndx");
super.ajouterFichierAssocie("Parametros.fic",com.mycompany.qr.R.raw.parametros_11, "##BDD##/parametros.fic");
super.ajouterFichierAssocie("Parametros.ndx",com.mycompany.qr.R.raw.parametros_10, "##BDD##/parametros.ndx");
super.ajouterFichierAssocie("Tabla_interface.ndx",com.mycompany.qr.R.raw.tabla_interface_9, "##BDD##/tabla_interface.ndx");
super.ajouterFichierAssocie("Usuarios.fic",com.mycompany.qr.R.raw.usuarios_8, "##BDD##/usuarios.fic");
super.ajouterFichierAssocie("Usuarios.ndx",com.mycompany.qr.R.raw.usuarios_7, "##BDD##/usuarios.ndx");
super.ajouterFichierAssocie("Bodega.fic",com.mycompany.qr.R.raw.bodega_6, "##BDD##/bodega.fic");
super.ajouterFichierAssocie("Bodega.ndx",com.mycompany.qr.R.raw.bodega_5, "##BDD##/bodega.ndx");
super.ajouterFichierAssocie("Inventario.fic",com.mycompany.qr.R.raw.inventario_4, "##BDD##/inventario.fic");
super.ajouterFichierAssocie("Inventario.ndx",com.mycompany.qr.R.raw.inventario_3, "##BDD##/inventario.ndx");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPQR_InitProjet( String [] args)
{
GWDPQR.ms_Project.initialiserProjet("QR", "Android application", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPQR_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPQR.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPQR_InitProjet(null);
}
public void run()
{

GWDPQR.ms_Project.lancerProjet();
}
}
}
