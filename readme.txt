______________________________________________________
________________________ File ________________________

Faciliter l'échange de données avec des fichiers textes. le contenu du fichier est récupéré et écris sous forme de texte.

Ecrire:
	File myfile = new File ("fileName", "text");
	myfile.toFile();

Lire:
	File myfile = new File ("fileName");
	String text = myfile.fromFile();