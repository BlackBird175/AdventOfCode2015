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

--- Part Two ---

The elves are also running low on ribbon. Ribbon is all the same width, so they only have to worry about the length 
they need to order, which they would again like to be exact.

The ribbon required to wrap a present is the shortest distance around its sides, or the smallest perimeter of any one 
face. Each present also requires a bow made out of ribbon as well; the feet of ribbon required for the perfect bow is 
equal to the cubic feet of volume of the present. Don't ask how they tie the bow, though; they'll never tell.

For example:

    A present with dimensions 2x3x4 requires 2+2+3+3 = 10 feet of ribbon to wrap the present 
    plus 2*3*4 = 24 feet of ribbon for the bow, for a total of 34 feet.
    
    A present with dimensions 1x1x10 requires 1+1+1+1 = 4 feet of ribbon to wrap the present plus 
    1*1*10 = 10 feet of ribbon for the bow, for a total of 14 feet.

How many total feet of ribbon should they order?

Your puzzle answer was 3783758.

Both parts of this puzzle are complete! They provide two gold stars: **

At this point, you should return to your Advent calendar and try another puzzle.

If you still want to see it, you can get your puzzle input.

You can also [Shareon Bluesky Twitter Mastodon] this puzzle.

------------------------------------------------------------------------------------------------------------------------

--- Day 3: Perfectly Spherical Houses in a Vacuum ---

Santa is delivering presents to an infinite two-dimensional grid of houses.

He begins by delivering a present to the house at his starting location, and then an elf at the North Pole calls 
him via radio and tells him where to move next. 
Moves are always exactly one house to the north (^), south (v), east (>), or west (<). 
After each move, he delivers another present to the house at his new location.

However, the elf back at the north pole has had a little too much eggnog, and so his directions are a little off, 
and Santa ends up visiting some houses more than once. How many houses receive at least one present?

For example:

    > delivers presents to 2 houses: one at the starting location, and one to the east.
    ^>v< delivers presents to 4 houses in a square, including twice to the house at his starting/ending location.
    ^v^v^v^v^v delivers a bunch of presents to some very lucky children at only 2 houses.

To begin, get your puzzle input.