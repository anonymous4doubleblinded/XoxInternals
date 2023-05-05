package eu.somethingsecret.xoxinternals.controller;

/**
 * Custom Exception that is fired whenever the logic is instructed to handle parameters that semantically are not
 * applicable.
 *
 * @author Anonymous Researcher
 */
public class LogicException extends Exception {

    /**
     * Constructor for the Logic exception.
     *
     * @param cause as a string describing the reason this exception was raised.
     */
    public LogicException(String cause) {
        super(cause);
    }
}
