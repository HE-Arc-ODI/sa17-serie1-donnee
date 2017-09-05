/*
 * HEG Haute école de gestion Arc
 * 633-1.1 Structures de données avancées 
 * 2014-2015 
 */
package ch.hearc.ig.sda.cc;

/**
 *
 * @author Philippe Daucourt <philippe.daucourt@he-arc.ch>
 */
public class MyCar implements Car {
    private final int seats; //Nombre de siège dans l'auto

    private int people; //Nombre de personne dans l'auto
    private Person driver = null; //Personne pilotant l'auto
    private final Person[] passengers; //Personnes passagères dans l'auto

    private State state = STOPPED; //Etat dans lequel se trouve la voiture
    
    public MyCar(final int seats) {
        //TODO
    }
    
    @Override
    public void getIn(final Person person) {
        //TODO
    }
    
    @Override
    public void getIn(final Person person, final boolean isDriver) {
        //TODO
    }
    
    @Override
    public int seat(Person person) {
        //TODO
    }
    
    @Override
    public void drive() {
        //TODO
    }
    
    @Override
    public int seats() {
        return seats;
    }

    @Override
    public boolean isEmpty() {
        return people() == 0;
    }

    @Override
    public boolean isFull() {
        return people() == seats();
    }

    @Override
    public boolean hasDriver() {
        return driver() != null;
    }

    @Override
    public Person driver() {
        return driver;
    }
@Override
    public int passengers() {
        return hasDriver() ? people() - 1 : people();
    }

    @Override
    public int people() {
        return people;
    }
    
    @Override
    public boolean isStopped() {
        return state == STOPPED;
    }

    @Override
    public boolean isDriving() {
        return state == DRIVING;
    }
}
