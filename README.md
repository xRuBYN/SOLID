SOLID

Single responsability, atunci cind o metoda, o clasa, o variabila, raspunde de o singura functiunalitate;

Open-close este un principiu care spune ca codul sa fie deschis pentru extidere si inchis pentru modificari.

Liskov-Substitution este un alt principiu solid care ne spunde ca o clasa parinte poate fi inlocuita 
cu una copil si logica aplicatie nu se va schimba. Adica clasa copil poate indeplini aceliasi operatii 
ca si clasa parinte.

Interface-Segregation este respectat atunci cind toate metodele unei interfete sunt implimentate,
daca nu ai nevoie de toate metodele interfetei mai bine de impartit interfata in mai multe.

Dependency Inversion este la fel un principiu din solid care spune ca programul nu trebuie sa depinda de ceva
concret ci de abstractie.

Putem dobindi o coeziune inalta respectind principiile solid, pentru face legaturile dintre clase este
de dorit de folosit clase abstracte si interfete pentru a nu lega asa strins o clasa de o logica anumita,
la fel o practica buna este screria testelor unitare 

Pentru a scadea cuplarea codului folosim asa principii ca dependency inversion, dependency injection,
si utilizare interfetelor in locul claselor concrete.
La fel evitarea dependentelor circulare

Interfetele faciliteaza mock testingul din cauza ca nu avem o implimentare ocnrecta si putem mai usor,
sai dam clasei comportamentul dorit.


Pentru a evita codul duplicat trebuie sa facem refactoring cit mai des la cod, si ca metodele sa fie cu o singura 
responsaibilitate.

Pentru a evita mostenirea multipla, putem folosi design patternul decorator la fel putem sa utilizam 
compozitia inloc de mostenire, la fel in loc sa fie mostenire la clase concrete folosim interfete.

Este un limbaj orientat pe obiecte, sunt interfete si clase abstracte.

legea lui dimiter prespune ca obiectul returnat del la o metoda nu trebuie sa fie invocat pentru a
se mai face un call la metodele acestui obiect.

DRY - dont reapit yourself 

