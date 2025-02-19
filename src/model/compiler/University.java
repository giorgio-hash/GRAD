package model.compiler;

/**
 * Rappresenta i dati per identificare un'università
 */
public class University {

    /**
     * nome dell'università
     */
    private String name;
    /**
     * indirizzo (vedi <i>{@link Address}</i>)
     */
    private Address address;

    /**
     * Costruttore
     * @param name nome università
     * @param address indirizzo università in formato <i>{@link Address}</i>
     */
    public University(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @return nome università
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return indirizzo università in formato <i>{@link Address}</i>
     */
    public Address getAddress() {
        return address;
    }
}
