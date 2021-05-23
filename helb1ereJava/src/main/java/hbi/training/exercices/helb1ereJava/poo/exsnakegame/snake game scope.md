# Jeu du serpent

## Buts

* Simulation de l'examen en mode coooool et fun
* Utilisation la Programmation Orientée Objet, JAVA II

## Règles

* Le serpent avance toujours tout droit (dans sa direction courante) tant
  que le joueur ne modifie pas la direction
* Le joueur peut modifier la direction de déplacement du serpent à l’aide
  des touches suivantes :
  * Flèche Haut
  * Flèche Bas 
  * Flèche Droite 
  * Flèche Gauche
* Le serpent démarre avec une longueur de 3.
* Le serpent démarre en étant orienté vers la droite au milieu de l’écran de
    jeu.    
* Le serpent meurt si:
  * sa tête rencontre une paroi.
  * si sa tête rencontre son corps.
  * La partie se termine par une victoire si le serpent a une longueur de 50.
  * La touche escape arrête le jeu.

* rien ne se passe, si le serpent tente de faire un “demi-tour” immédiat (p.ex. il se déplace
  vers la droite et on essaie de le faire se déplacer vers la gauche).

* la longueur du serpent grandit tous les 3 coups

## Examples d'affichage

Début
```(text)
================================================
Joueur: Adam
Longueur du serpent: 3
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	x	x	X	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.
```
Le joueur appuie sur la flèche droite
```(text)
================================================
Joueur: Adam
Longueur du serpent: 3
Coup numéro 1
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	x	x	X	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.	
.	.	.	.	.	.	.	.	.	.	.	.	.	.	.
```

