package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {


    @Test
    void hasErrors() {
        Parser.getInstance().setFileIn(".\\resources\\career_witherrs.GRAD");
        Parser.getInstance().parse();
        assertTrue(Parser.getInstance().hasErrors());
    }

    @Test
    void getErrors(){
        Parser.getInstance().setFileIn(".\\resources\\career_witherrs.GRAD");
        Parser.getInstance().parse();
        assertEquals(1, Parser.getInstance().getErrors().size());
    }

    @Test
    void hasWarning() {
        Parser.getInstance().setFileIn(".\\resources\\career_witherrs.GRAD");
        Parser.getInstance().parse();
        assertEquals(2, Parser.getInstance().getWarnings().size());

        Parser.getInstance().setFileIn(".\\resources\\career.GRAD");
        Parser.getInstance().parse();
        assertEquals(3, Parser.getInstance().getWarnings().size());
    }

    @Test
    void hasOtherExceptions() {
        Parser.getInstance().setFileIn(".\\resources\\career_witherrs.GRAD");
        Parser.getInstance().parse();
        assertTrue(Parser.getInstance().hasOtherExceptions());

        Parser.getInstance().setFileIn(".\\resources\\career.GRAD");
        Parser.getInstance().parse();
        assertFalse(Parser.getInstance().hasOtherExceptions());
    }
}