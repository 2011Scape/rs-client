package com.jagex;/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Localization
{
	static Localization initialConsoleMessage = new Localization("This is the developer console. To close, press the `, \u00b2 or \u00a7 keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, die Tasten `, \u00b2 or \u00a7 dr\u00fccken.", "Ceci est la console de d\u00e9veloppement. Pour la fermer, appuyez sur les touches `, \u00b2 ou \u00a7.", "Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione `, \u00b2 ou \u00a7.");
	static int anInt360;
	static int anInt361;
	static int anInt362;
	private String[] localizationStrings;
	static int anInt364;
	static Localization commandError = new Localization("There was an error executing the command.", "Es gab einen Fehler beim Ausf\u00fchren des Befehls.", "Une erreur s'est produite lors de l'ex\u00e9cution de la commande.", "Houve um erro quando o comando foi executado.");
	static Localization unknownCommand = new Localization("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");
	static Localization cancel = new Localization("Cancel", "Abbrechen", "Annuler", "Cancelar");
	static Localization membersObject;
	static Localization discard1;
	static Localization discard2;
	static Localization take;
	static Localization drop;
	static Localization continueWord;
	static Localization fullFriendsList;
	static Localization loadingPleaseWait;
	static Localization profiling;
	static Localization connectionLost;
	static Localization reconnecting;
	static Localization checkingUpdates;
	static Localization fetchingUpdates;
	static Localization loading;
	static Localization friendLoggedIn;
	static Localization friendLoggedOut;
	static Localization unableToFindAddedFriend;
	static Localization examine;
	static Localization attack;
	static Localization chooseOption;
	static Localization moreOptions;
	static Localization walkHere;
	static Localization faceHere;
	static Localization level;
	static Localization skill;
	static Localization rating;
	static Localization pleaseWait;
	static Localization spaceCharacter;
	static Localization millionsCharacter1;
	static Localization millionsCharacter2;
	static Localization thousandsCharacter1;
	static Localization thousandsCharacter2;
	static Localization self;
	static Localization alreadyOnFriendsList;
	static Localization fullIgnoreList;
	static Localization alreadyOnIgnoreList;
	static Localization cantAddSelfFriends;
	static Localization cantAddSelfIgnore;
	static Localization pleaseRemoveIgnorePrefix;
	static Localization pleaseRemoveIgnoreSuffix;
	static Localization pleaseRemoveFriendPrefix;
	static Localization pleaseRemoveFriendSuffix;
	static Localization textEffectYellow;
	static Localization textEffectRed;
	static Localization textEffectGreen;
	static Localization textEffectCyan;
	static Localization textEffectPurple;
	static Localization textEffectWhite;
	static Localization textEffectflash1;
	static Localization textEffectFlash2;
	static Localization textEffectFlash3;
	static Localization textEffectGlow1;
	static Localization textEffectGlow2;
	static Localization textEffectGlow3;
	static Localization textEffectWave;
	static Localization textEffectWave2;
	static Localization textEffectShake;
	static Localization textEffectScroll;
	static Localization textEffectSlide;
	static int anInt427;
	static int anInt428;
	static int anInt429;
	static int anInt430;
	static int anInt431;
	static int anInt432;
	
	final String getLocalizationString(int i, int languageId) {
		anInt362++;
		if (i != -12273) {
			return null;
		}
		return localizationStrings[languageId];
	}
	
	static final Node_Sub13 method298(int i, byte b, int i_1_, int i_2_) {
		if (b < 107) {
			return null;
		}
		anInt364++;
		Node_Sub13 node_sub13 = null;
		if (i_2_ == 0) {
			node_sub13 = FloatBuffer.method2250(-386, Class267.aClass318_3445, Class218.worldResponseBuffer.anIsaacCipher1571);
			Node_Sub36.anInt7423++;
		}
		if (i_2_ == 1) {
			node_sub13 = FloatBuffer.method2250(-386, Class338.aClass318_4198, Class218.worldResponseBuffer.anIsaacCipher1571);
			Class189.anInt2307++;
		}
		node_sub13.aPacket7113.method2207(21226, i - -Node_Sub53.anInt7668);
		node_sub13.aPacket7113.method2207(21226, Class320_Sub4.anInt8243 + i_1_);
		node_sub13.aPacket7113.method2226(!Class175.aClass291_2100.method3450(99, 82) ? 0 : 1, false);
		Class144.aBoolean1791 = false;
		Class359.anInt4467 = i;
		Node_Sub15_Sub4.anInt9798 = i_1_;
		NpcDefinition.method3002((byte) 97);
		return node_sub13;
	}
	
	public final String toString() {
		anInt360++;
		throw new IllegalStateException();
	}
	
	public static void method299(boolean bool) {
		examine = null;
		walkHere = null;
		continueWord = null;
		textEffectWave2 = null;
		level = null;
		spaceCharacter = null;
		thousandsCharacter1 = null;
		textEffectGlow1 = null;
		textEffectGlow3 = null;
		faceHere = null;
		discard2 = null;
		skill = null;
		textEffectCyan = null;
		textEffectGlow2 = null;
		self = null;
		textEffectFlash2 = null;
		chooseOption = null;
		friendLoggedOut = null;
		attack = null;
		alreadyOnIgnoreList = null;
		pleaseRemoveFriendPrefix = null;
		pleaseRemoveIgnoreSuffix = null;
		moreOptions = null;
		cantAddSelfIgnore = null;
		membersObject = null;
		thousandsCharacter2 = null;
		textEffectYellow = null;
		alreadyOnFriendsList = null;
		unknownCommand = null;
		fullFriendsList = null;
		fetchingUpdates = null;
		friendLoggedIn = null;
		fullIgnoreList = null;
		textEffectWhite = null;
		textEffectScroll = null;
		pleaseRemoveIgnorePrefix = null;
		textEffectRed = null;
		textEffectShake = null;
		textEffectGreen = null;
		reconnecting = null;
		pleaseRemoveFriendSuffix = null;
		millionsCharacter2 = null;
		cancel = null;
		initialConsoleMessage = null;
		millionsCharacter1 = null;
		textEffectPurple = null;
		loadingPleaseWait = null;
		profiling = null;
		textEffectSlide = null;
		discard1 = null;
		textEffectWave = null;
		loading = null;
		connectionLost = null;
		commandError = null;
		take = null;
		checkingUpdates = null;
		rating = null;
		textEffectFlash3 = null;
		drop = null;
		cantAddSelfFriends = null;
		if (bool == false) {
			textEffectflash1 = null;
			unableToFindAddedFriend = null;
			pleaseWait = null;
		}
	}
	
	static final void method300(int i, boolean bool, boolean bool_3_) {
		if (bool != true) {
			textEffectWhite = null;
		}
		Class356.method4024(bool, bool_3_, loadingPleaseWait.getLocalizationString(-12273, Class35.clientLanguage), i);
		anInt361++;
	}
	
	private Localization(String english, String german, String french, String portuguese) {
		localizationStrings = new String[] { english, german, french, portuguese };
	}
	
	static {
		new Localization("#Player", "#Spieler", "#Joueur", "#Jogador");
		membersObject = new Localization("Members object", "Gegenstand f\u00fcr Mitglieder", "Objet d'abonn\u00e9s", "Objeto para membros");
		new Localization("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Localization("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.", "V\u00e1 a qualquer banco para trocar esta nota pelo objeto equivalente.");
		discard1 = new Localization("Discard", "Ablegen", "Jeter", "Descartar");
		discard2 = new Localization("Discard", "Ablegen", "Jeter", "Descartar");
		take = new Localization("Take", "Nehmen", "Prendre", "Pegar");
		drop = new Localization("Drop", "Fallen lassen", "Poser", "Largar");
		new Localization("Ok", "Okay", "OK", "Ok");
		new Localization("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
		continueWord = new Localization("Continue", "Weiter", "Continuer", "Continuar"); // Couldn't think of a better var name, continue is a keyword
		new Localization("Invalid player name.", "Unzul\u00e4ssiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.");
		new Localization("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-m\u00eame !", "Voc\u00ea n\u00e3o pode denunciar a si pr\u00f3prio!");
		new Localization("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelversto\u00df gemeldet!", "Vous avez d\u00e9j\u00e0 signal\u00e9 un abus il y a moins d'une minute ! N'abusez pas du syst\u00e8me !", "Voc\u00ea j\u00e1 enviou uma den\u00fancia de abuso h\u00e1 menos de um minuto. N\u00e3o abuse deste sistema!");
		new Localization(null, "Dieses System darf nicht missbraucht werden!", null, null);
		new Localization("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identit\u00e9.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
		new Localization("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.", "Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada pr\u00f3xima ao \u007fnome.");
		new Localization("You can report that person under a different rule.", "Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
		new Localization("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien re\u00e7u votre rapport d'abus.", "Obrigado. Sua den\u00fancia de abuso foi recebida.");
		new Localization("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet", "Impossible de signaler un abus - Erreur syst\u00e8me", "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
		new Localization("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido");
		new Localization("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Localization("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.", "Para interagir, acesse um servidor para membros.");
		new Localization("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'int\u00e9ressant.", "Nada de interessante acontece.");
		new Localization("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.");
		new Localization("Invalid teleport!", "Unzul\u00e4ssiger Teleport!", "T\u00e9l\u00e9portation non valide !", "Teleporte inv\u00e1lido!");
		new Localization("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter \u00e0 un serveur d'abonn\u00e9s pour aller \u00e0 cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		new Localization("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
		new Localization("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um amigo - jogador desconhecido.");
		new Localization("Unable to add name - system busy.", "Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.");
		new Localization("Unable to add name - unknown player.", "Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
		fullFriendsList = new Localization("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d'amis est pleine (200 noms maximum).", "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 200.");
		new Localization("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
		new Localization("Unable to delete name - system busy.", "Name konnte nicht gel\u00f6scht werden - Systemfehler.", "Impossible d'effacer le nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.");
		new Localization("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.");
		new Localization("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.");
		new Localization(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null);
		new Localization("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.");
		new Localization(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new Localization("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !", "Parece que voc\u00ea est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!");
		new Localization("If you are not, please change your password to something more obscure!", "nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !", "Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!");
		new Localization("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "N\u00e3o \u00e9 poss\u00edvel enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
		new Localization(null, "indem du dich ins Spiel einloggst.", null, null);
		new Localization("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option k\u00f6nnen nur Spieler gemeldet werden,", "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.", "Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		new Localization(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null);
		new Localization("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.", "Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.", "O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.");
		new Localization("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt k\u00f6nnen derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.", "Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.");
		new Localization(null, "geschickt werden.", null, null);
		new Localization("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.", "Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
		new Localization("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e", "Bate-papo desativado");
		new Localization("friends_chat", "friends_chat", "friends_chat", "friends_chat");
		new Localization("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d'un canal de discussion.", "No momento, voc\u00ea n\u00e3o est\u00e1 no bate-papo entre amigos.");
		new Localization("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de discussion.", "Voc\u00ea pode falar neste bate-papo entre amigos.");
		new Localization("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.", "Erreur lors de l'envoi de ce message \u2013 veuillez r\u00e9essayer ult\u00e9rieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
		new Localization("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'\u00eatre d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.", "Aguarde at\u00e9 se desconectar do canal anterior.");
		new Localization("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal.");
		new Localization("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
		new Localization("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicita\u00e7\u00e3o para deixar o canal...");
		new Localization("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...", "J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...");
		new Localization("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie d\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...", "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
		new Localization("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inv\u00e1lido!");
		new Localization("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement !", "N\u00e3o foi poss\u00edvel participar do bate-papo entre amigos - favor tentar novamente mais tarde!");
		new Localization("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando no momento no bate-papo entre amigos: ");
		new Localization("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando no momento no bate-papo entre amigos do jogador: ");
		new Localization("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, ins\u00e9rez le symbole / au d\u00e9but de chaque ligne.", "Para falar, comece cada linha de conversa com o s\u00edmbolo /.");
		new Localization("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es sp\u00e4ter erneut.", "Erreur lors de la connexion au canal de discussion - veuillez r\u00e9essayer ult\u00e9rieurement !", "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!");
		new Localization("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.", "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.", "Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente de novo depois!");
		new Localization("The channel you tried to join does not exist.", "Der von dir gew\u00fcnschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que voc\u00ea tentou acessar n\u00e3o existe.");
		new Localization("The channel you tried to join is currently full.", "Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
		new Localization("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de discussion.", "Voc\u00ea n\u00e3o tem uma classifica\u00e7\u00e3o alta o suficiente para participar deste bate-papo entre amigos.");
		new Localization("You are temporarily banned from this friends chat channel.", "Du wurdest tempor\u00e4r von diesem Freundes-Chatraum gesperrt.", "Vous avez \u00e9t\u00e9 exclu temporairement de ce canal de discussion.", "Voc\u00ea foi temporariamente banido deste bate-papo entre amigos.");
		new Localization("You are not allowed to join this user's friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de discussion de cet utilisateur.", "Voc\u00ea n\u00e3o pode participar do bate-papo entre amigos deste usu\u00e1rio.");
		new Localization(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Localization(" left the channel.", " hat den Chatraum verlassen.", " a quitt\u00e9 le canal.", " deixou o canal.");
		new Localization(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a \u00e9t\u00e9 expuls\u00e9 du canal.", " foi expulso do canal.");
		new Localization("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.", "Voc\u00ea foi expulso do canal.");
		new Localization("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.", "Voc\u00ea foi retirado desse canal.");
		new Localization("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.");
		new Localization("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activ\u00e9 !", "O seu bate-papo entre amigos foi ativado!");
		new Localization("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
		new Localization("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant d\u00e9sactiv\u00e9 !", "O seu bate-papo entre amigos foi desativado!");
		new Localization("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.");
		new Localization("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
		new Localization("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
		new Localization("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d'exclusion de ce joueur a \u00e9t\u00e9 accept\u00e9e.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.");
		new Localization("Your request to refresh this user's temporary ban was successful.", "Die Verl\u00e4ngerung der tempor\u00e4ren Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d'exclusion temporaire de ce joueur a \u00e9t\u00e9 accept\u00e9.", "Seu pedido para reiniciar a suspens\u00e3o tempor\u00e1ria deste jogador foi bem sucedido.");
		new Localization("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.", "La messagerie instantan\u00e9e a \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.", "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
		new Localization("This mute will remain for a further ", "Diese Stummschaltung gilt f\u00fcr weitere ", "Votre acc\u00e8s restera bloqu\u00e9 encore ", "Este veto permanecer\u00e1 por mais ");
		new Localization(" days.", " Tage.", " jours.", " dias.");
		new Localization("You will be un-muted within 24 hours.", "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.", "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.", "O veto ser\u00e1 retirado dentro de 24 horas.");
		new Localization("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.", "Para evitar outros vetos, leia as regras.");
		new Localization("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.", "L'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.", "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
		loadingPleaseWait = new Localization("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
		profiling = new Localization("Profiling...", "Profiling...", "Profilage...", "Profiling...");
		connectionLost = new Localization("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conex\u00e3o perdida.");
		reconnecting = new Localization("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de r\u00e9tablissement.", "Tentando reestabelecer conex\u00e3o. Aguarde.");
		checkingUpdates = new Localization("Checking for updates - ", "Suche nach Updates - ", "V\u00e9rification des mises \u00e0 jour - ", "Verificando atualiza\u00e7\u00f5es - ");
		fetchingUpdates = new Localization("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualiza\u00e7\u00f5es - ");
		new Localization("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
		new Localization("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s", "Config carregada");
		new Localization("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
		new Localization("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s", "Sprites carregados");
		new Localization("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
		new Localization("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9", "Pacote de palavras carregado");
		new Localization("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ", "Carregando interfaces - ");
		new Localization("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es", "Interfaces carregadas");
		new Localization("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
		new Localization("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces charg\u00e9es", "Interfaces carregadas");
		new Localization("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
		new Localization("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires charg\u00e9es", "Fontes principais carregadas");
		new Localization("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-m\u00fandi - ");
		new Localization("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
		new Localization("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
		new Localization("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs charg\u00e9e", "Dados da lista de mundos carregados");
		new Localization("Loaded client variable data", "Client-Variablen geladen", "Variables du client charg\u00e9es", "As vari\u00e1veis do sistema foram carregadas");
		loading = new Localization("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
		new Localization("Please close the interface you have open before using 'Report Abuse'.", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		new Localization(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null);
		new Localization("System update in: ", "System-Update in: ", "Mise \u00e0 jour syst\u00e8me dans : ", "Atualiza\u00e7\u00e3o do sistema em: ");
		friendLoggedIn = new Localization(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.");
		friendLoggedOut = new Localization(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.", " saiu do jogo.");
		unableToFindAddedFriend = new Localization("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "N\u00e3o \u00e9 poss\u00edvel encontrar ");
		new Localization("Use", "Benutzen", "Utiliser", "Usar");
		examine = new Localization("Examine", "Untersuchen", "Examiner", "Examinar");
		attack = new Localization("Attack", "Angreifen", "Attaquer", "Atacar");
		chooseOption = new Localization("Choose Option", "W\u00e4hl eine Option", "Choisir une option", "Selecionar op\u00e7\u00e3o");
		moreOptions = new Localization(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es");
		walkHere = new Localization("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1");
		faceHere = new Localization("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para c\u00e1");
		level = new Localization("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
		skill = new Localization("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ");
		rating = new Localization("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ");
		pleaseWait = new Localization("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...");
		new Localization("Close", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		spaceCharacter = new Localization(" ", ": ", " ", " "); // Not sure what German uses : for
		millionsCharacter1 = new Localization("M", "M", "M", "M");
		millionsCharacter2 = new Localization("M", "M", "M", "M");
		thousandsCharacter1 = new Localization("K", "T", "K", "K");
		thousandsCharacter2 = new Localization("K", "T", "K", "K");
		new Localization("From", "Von:", "De", "De");
		self = new Localization("Self", "Mich", "Moi", "Eu");
		alreadyOnFriendsList = new Localization(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est d\u00e9j\u00e0 dans votre liste d'amis.", " j\u00e1 est\u00e1 na sua lista de amigos.");
		fullIgnoreList = new Localization("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios.");
		alreadyOnIgnoreList = new Localization(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est d\u00e9j\u00e0 dans votre liste noire.", " j\u00e1 est\u00e1 na sua lista de ignorados.");
		cantAddSelfFriends = new Localization("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.");
		cantAddSelfIgnore = new Localization("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados.");
		new Localization("Changes will take effect on your friends chat in the next 60 seconds.", "Die \u00c4nderungen am Freundes-Chat werden innerhalb von 60 Sekunden \u00fcbernommen.", "Les modifications seront apport\u00e9s \u00e0 votre canal de discussion dans les 60 prochaines secondes.", "Mundan\u00e7as v\u00e3o ocorrer em seu bate-papo entre amigos nos pr\u00f3ximos 60 segundos.");
		pleaseRemoveIgnorePrefix = new Localization("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
		pleaseRemoveIgnoreSuffix = new Localization(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
		pleaseRemoveFriendPrefix = new Localization("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
		pleaseRemoveFriendSuffix = new Localization(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
		textEffectYellow = new Localization("yellow:", "gelb:", "jaune:", "amarelo:");
		textEffectRed = new Localization("red:", "rot:", "rouge:", "vermelho:");
		textEffectGreen = new Localization("green:", "gr\u00fcn:", "vert:", "verde:");
		textEffectCyan = new Localization("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
		textEffectPurple = new Localization("purple:", "lila:", "violet:", "roxo:");
		textEffectWhite = new Localization("white:", "weiss:", "blanc:", "branco:");
		textEffectflash1 = new Localization("flash1:", "blinken1:", "clignotant1:", "flash1:");
		textEffectFlash2 = new Localization("flash2:", "blinken2:", "clignotant2:", "flash2:");
		textEffectFlash3 = new Localization("flash3:", "blinken3:", "clignotant3:", "brilho3:");
		textEffectGlow1 = new Localization("glow1:", "leuchten1:", "brillant1:", "brilho1:");
		textEffectGlow2 = new Localization("glow2:", "leuchten2:", "brillant2:", "brilho2:");
		textEffectGlow3 = new Localization("glow3:", "leuchten3:", "brillant3:", "brilho3:");
		textEffectWave = new Localization("wave:", "welle:", "ondulation:", "onda:");
		textEffectWave2 = new Localization("wave2:", "welle2:", "ondulation2:", "onda2:");
		textEffectShake = new Localization("shake:", "sch\u00fctteln:", "tremblement:", "tremor:");
		textEffectScroll = new Localization("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:");
		textEffectSlide = new Localization("slide:", "gleiten:", "glissement:", "deslizamento:");
		new Localization("Friend", "Freund", "Ami", "Amigo");
		anInt428 = 0;
		anInt429 = 0;
		anInt432 = 100;
	}
}
