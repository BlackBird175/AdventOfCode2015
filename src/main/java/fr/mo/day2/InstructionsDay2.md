--- Day 2: I Was Told There Would Be No Math ---

The elves are running low on wrapping paper, and so they need to submit an order for more. They have a list of the 
dimensions (length l, width w, and height h) of each present, and only want to order exactly as much as they need.

Fortunately, every present is a box (a perfect right rectangular prism), which makes calculating the required wrapping 
paper for each gift a little easier: find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l. 
The elves also need a little extra paper for each present: the area of the smallest side.

For example:

    A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper plus 6 square 
    feet of slack, for a total of 58 square feet.
    
    A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper plus 1 square 
    foot of slack, for a total of 43 square feet.

All numbers in the elves' list are in feet. How many total square feet of wrapping paper should they order?

------------------------------------------------------------------------------------------------------------------------
--- Jour 2 : On m'a dit qu'il n'y aurait pas de maths...

Les lutins sont à court de papier d'emballage et doivent donc passer une commande pour en obtenir d'autres. 
Ils ont une liste des dimensions (longueur l, largeur w, et hauteur h) de chaque cadeau, et ne veulent commander que 
la quantité exacte dont ils ont besoin.

Heureusement, chaque cadeau est une boîte (un prisme rectangulaire droit parfait), ce qui facilite le calcul du papier 
d'emballage nécessaire pour chaque cadeau : trouver la surface de la boîte, qui est 2*l*w + 2*w*h + 2*h*l. Les lutins 
ont également besoin d'un peu de papier supplémentaire pour chaque cadeau : la surface du plus petit côté.

C'est l'aire du plus petit côté :

    Un cadeau de dimensions 2x3x4 nécessite 2*6 + 2*12 + 2*8 = 52 mètres carrés de papier d'emballage plus 6 mètres 
    carrés de mou, soit un total de 58 mètres carrés.
    
    Un cadeau de dimensions 1x1x10 nécessite 2*1 + 2*10 + 2*10 = 42 mètres carrés de papier d'emballage plus 1 mètre 
    carré de jeu, pour un total de 43 mètres carrés.

Tous les nombres de la liste des lutins sont exprimés en pieds. 
Combien de mètres carrés de papier d'emballage doivent-ils commander ?
