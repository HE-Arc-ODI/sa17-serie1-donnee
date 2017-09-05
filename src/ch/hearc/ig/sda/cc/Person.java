/*
 * HEG Haute école de gestion Arc
 * 625-1.2 Outils de développement intégré 
 * 2017-2018 
 */
package ch.hearc.ig.sda.cc;

/**
 *
 * @author Philippe Daucourt <philippe.daucourt@he-arc.ch>
 */
public class Person {
    
    private String firstname;

    public Person(String firstname) {
        checkIfNullOrEmptyOrBlank(firstname);
        
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        checkIfNullOrEmptyOrBlank(firstname);
        
        this.firstname = firstname;
    }

    private void checkIfNullOrEmptyOrBlank(String firstname1) throws IllegalArgumentException {
        if (firstname1 == null || firstname1.matches("^\\s*$")) {
            throw new IllegalArgumentException("Invalid firstname");
        }
    }
    
    
}
