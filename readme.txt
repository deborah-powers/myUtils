Les classes de ce package simplifient la manipulation d'objets (fichiers, chaines de caractères ...).

______________________________________________________
________________________ File ________________________

Echanger des données avec des fichiers textes. le contenu du fichier est récupéré et écris sous forme de texte.

Ecrire:
	File myfile = new File ("fileName", "text");
	myfile.toFile();

Lire:
	File myfile = new File ("fileName");
	String text = myfile.fromFile();

______________________________________________________
________________________ Text ________________________

Traiter les chaines de caractères.

String myString = "un texte d'où je veux extraire une portion";
Text myText = new Text (myString);
String subStr = myText.subString ("veux ", " une");
// subStr = extraire