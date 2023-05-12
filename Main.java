

import outils.Personne;
public class Main{
    public static void main(String[]args){
        /*Lorsque on déclare une variable de type objet,on dit 
         * que l'on fait une INSTANCIATION.
         * Un objet est une INSTANCE d'une classe .
         * 
         */
        //Personne p = new Personne(); REMPLACER PAR 
        Personne p = new Personne( "Onyme","Anne",50);
      //XXXxxxxxxxxx voir fiche VERSION DIDIER DU 11 05 23
        System.out.println(" Nom:" + p.nom);
        System.out.println(" Prénom:"+ p.prenom);
        //System.out.println(" Age:" + p.age); // REMPLACE PAR LIGNE SUIVANTE
        System.out.println(" Age:" + p.getAge());
       // System.out.println(p);  avec seulement "p" il  affiche l'adresse mémoire ou la référence
       System.out.println(p.identite());
       Personne p1 = new Personne("Jean","Cérien"); // ELLE REMPLACE  LES 2 LIGNES SUIVANTES
       //p1.prenom ="Jean";
       //p1.nom ="Cérien";
       //p1.age = 25; A REMPLACER PAR set ligne suivante
        p1.setAge(25);
       System.out.println("identité de p1 :" +p.identite());
         
/*          * EXERCICES : 
         * 1. Déclarer un tableau d'objets Personne.
         * 2. Remplir le tableau avec les données utilisées dans exemple Array.java (cf. ci-dessous)
         * 3. Affichez toutes les identités des personnes (en utilisant la méthode identite()).
         * 4. ajoutez un constructeur qui permet d'instancier 
         *      une personne en définissant directement son prénom, 
         *      son nom et son âge. (Cherchez sur internet ce qu'est un constructeur
         		et comment le déclarer)
         */    

       Personne[]tableauPersonnes= new Personne[10];
       for(int i=0;i<tableauPersonnes.length;i++){
           tableauPersonnes[i]=new Personne();
       }
       //tableauPersonnes[0]= new Personne();pour creer un objet personne

       tableauPersonnes[0].prenom ="Gérard";
       tableauPersonnes[0].nom ="Menfin";
       //tableauPersonnes[0].age =35;
       tableauPersonnes[0].setAge(35);

       //tableauPersonnes[0]= new Personne();
       tableauPersonnes[1].prenom ="Nordine";
       tableauPersonnes[1].nom ="ATEUR";
       tableauPersonnes[1].setAge(20); // EXMPLE REMPLACE PAR SET

       for(Personne personne:tableauPersonnes){                     // exemple personne remplacé/ escalier
        System.out.println(personne.identite()+ " " + personne.getAge()); //REMPLACE LA 2 ligne
        //System.out.println(personne.identite()+ " " + personne.age());
       }
       
       //tableauPersonnes[1].identite(); IL NE VA RIEN SE PASSER
       System.out.println(tableauPersonnes[1].identite());

        /* Null est untype de données particulier.( qu'on peut considerer
             comme une valeur particuliére)
         * Une variable qui n'a pas été initialisée est considérée comme étant Null.
         */

}
}

