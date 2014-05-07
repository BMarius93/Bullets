Bullets
=======

  Enunt pe scurt:
  
  Pe scurt, un student are la dispozitie mai multe proiectile pe care le va lansa la diferite
  momente de timp si de la o anumita distanta catre o suprafata tinta. Cerinta problemei este
  sa calculati cum va arata aceasta suprafata (numita si ecran in enuntul temei) in urma impactului 
  cu multiplele proiectile lansate.
  
  Implementare:
  
  Am extins fiecare proiectil din clasa Projectile si fiecare forma si clasa BasicShape
	
	In fiecare forma geometrica am creat metoda draw, care deseneaza forma respectiva in functie 
de centru de greutate si ref.
	
	
	In metoda shoot a fiecarui proiectil am facut modificarile marimii de referinta si 
coordonatele centrului de greutate, apoi ai verificat daca se mai transforma sau nu in alt proiectil.
	
	In metoda hitScreenAction am apelat metoda draw din forma geometrica aferenta proectilului.
