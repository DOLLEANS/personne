public class Personne{
    /*Les PROPRIETES(ou ATTRIBUTS)définies dans une classe
     * correspondent aux caractèristiques des objets qui vont
     * être crées à partir de cette classe.
     */
    public String prenom = "défaut";  //  equivalent de this .personne
    public String  nom;
    //public int age;
    private int age;
    /**CONSTRUCTEUR
     * Un constructeur est une méthode qui est éxecutée quand un objet est instancié
     * Toutes les classes ont un constructeur par défaut dans java.Ce constructeur à 
     * le nom de la classe.Par exemple:
     * pesrsonne p = new Personne();
     * 
     * On peut définir un nouveau constructeur.
     * - §§ ( triangle ATTENTION) Un constructeur ne doit pas retourner une valeur.Donc il n'a pas de type
     *      avant le nom de la méthode lors de la déclaration.
     * En général,les constructeurs sont utilisés pour initialiser la valeur des    
     *       propriètés de l'objet.
     * 
     */
    public Personne(String name,String firstname,int old){     //  CREER UN OBJET
nom= name;
prenom =firstname;
 age = old;
    }
/**Quand on définit un constructeur ,le constructeur par défaut n'est plus accessible.
 * Si on veut l'utiliser à nouveau ,il faut déclaere un constructeur sans argument.
 * NB: on peut laisser les {} vides si aucune instruction ne doit être éxécutée.
 * S: on peut déclarer autant de constructeurs que l'on veut.}
 */
    public Personne(){}

   // public Personne(String firstname,String name, int age);
   public Personne(String prenom,String nom){                      // age sera donné par défaut
           this.prenom = prenom;    //        ORDDRE TYPE  ET ARGUMENT PEUVENT ETR MODIFIES??? A CONFIRMER
            this.nom = nom;
   }
    /** 
     * Une fonction dans une classe est appelée une METHODE.
     * @return String concatenation du prénom et du nom
     */
    /* * @param aucun parametre
    */
     
    public String identite(){
        // System.out.println("la fonction identité est executée");
        //return this.prenom+" "+this.nom;
        String temp = this.prenom +" "+this.nom;
        return temp;
    }
    public String identite(boolean vrai){
        return this.prenom +"   " + this.nom+ ", agé de "+ this.age + "ans";
    }
    public int getAge(){
            return this.age;
    }
    public void setAge(int age){// definir == set
        this.age = age;
    }
}

