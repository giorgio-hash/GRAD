package model.compiler;

import java.time.LocalDate;

/**
 * Classe per i dati ausiliari dello studente.
 */
public class Student {
    /**
     * nome studente
     */
    private String name;
    /**
     * cognome studente
     */
    private String surname;
    /**
     * matricola studente
     */
    private String serial;
    /**
     * data di nascita dello studente
     */
    private LocalDate birthdate;
    /**
     * email studente
     */
    private String email;

    /**
     * Dati università dello studente (vedi <i>{link University}</i>);
     */
    private University u;

    /**
     * Costruttore
     * @param name nome studente
     * @param surname cognome studente
     * @param serial numero di matricola dello studente
     * @param birthdate data di nascita dello studente
     * @param email email dello studente
     * @param u oggetto <i>{@link University}</i> per dati università
     */
    public Student(String name, String surname, String serial, LocalDate birthdate, String email, University u) {
        this.name = name;
        this.surname = surname;
        this.serial = serial;
        this.birthdate = birthdate;
        this.email = email;
        this.u = u;
    }

    /**
     *
     * @return nome studente
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return cognome studente
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @return matricola studente
     */
    public String getSerial() {
        return serial;
    }

    /**
     *
     * @return anno di nascita dello studente
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     *
     * @return email dello studente
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return oggetto <i>{@link University}</i> con dati universitò studente
     */
    public University getUniversity() {
        return u;
    }
}
