package controller;
import model.Patient;
public class Controller {

    // Ajouter un attribut statique pour l'instance unique (Singleton)
    private static Controller instance;
    // Attribut représentant le modèle (Patient)
    private Patient patient;
    // Constructeur privé pour le Singleton
    public Controller() {
        // Initialisation du modèle
        patient = new Patient("", 0, 0.0);
    }

    // Méthode statique et finale pour obtenir l'instance unique (Singleton)
    public static synchronized Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    // Méthode pour créer un patient en initialisant le modèle avec les propriétés
    // fournies par l'utilisateur
    public void createPatient(String nom, int age, double niveauGlycemie) {
        patient = new Patient(nom, age, niveauGlycemie);
    }

    // Méthode pour obtenir la réponse de l'analyse du niveau de glycémie
    public String getResponse() {
        // Appel de la méthode de calcul dans le modèle (Patient)
        return patient.calculer();
    }
}
