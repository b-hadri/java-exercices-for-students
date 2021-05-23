# Le jeu du Serpent

## Etapes de résolution

1. Bien comprendre l'énoncé
2. Réfléchir à une solution (sur Papier ou dans un fichier texte)
3. Coder la solution
4. Vérifier la solution

Requirements > Design > Implementation > Verification > Maintenance

## 1. Comprendre l'énoncé

OK

## 2. Réfléchir à une solution (ou design d'une solution)

### Classes candidates (les classes possibles)

* Serpent
  * longueur
  * Position (x, y)
  * Direction  
* Direction
* Position
* RègleDuJeu
* Joueur
    * nom
* Grille / Plateau ...


* ElementDuSerpent = corps du serpent ?  
* Touches ?
* Bord / Paroi de la grille ???  
* Coups ?


### les étapes d'implémentation

1. créer la classe Joueur
2. créer la classe Position
3. créer la classe Direction
4. créer la classe Serpent
5. créer la classe Grille
6. créer la méthode afficher la grille
7. créer la méthode afficher la grille avec un serpent
8. déplacer le serpent sur la grille vers la droite
9. déplacer le serpent sur la grille vers la haut
10. déplacer le serpent sur la grille vers la gauche
11. déplacer le serpent sur la grille vers le bas <--
12. créer un test/une condition pour savoir quand la partie se termine par une victoire (longueur == 50)
13. créer les règles quand le serpent meurt
14. créer la méthode qui affiche quand le serpent meurt
15. créer la méthode qui affiche quand le serpent gagne
16. récupérer les coups haut, droite, gauche et bas de l'utilisateur (touches)
17. créer une classe "Main" qui permet de jouer au jeu du serpent

### conseils à ne pas oublier

* placer les fichiers dans un repertoire séparé
* compiler souvent le code et corriger les erreurs
* créer un main et tester chaque étape




