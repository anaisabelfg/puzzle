package com.puzzle;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void shouldReturnThrowExceptionWhenTheBowlIsNull() {
        String message = "ANY MESSAGE";
        String bowlOfSoup = null;
        assertThatThrownBy(() -> Solution.canIWriteTheMessage(message, bowlOfSoup))
                .isInstanceOf(InvalidParameterException.class);
    }

    @Test
    public void shouldReturnThrowExceptionTheMessageIsNull() {
        String message = null;
        String bowlOfSoup = "ABCDEFGHIJKLMNOPQRSTVWYZ";
        assertThatThrownBy(() -> Solution.canIWriteTheMessage(message, bowlOfSoup))
                .isInstanceOf(InvalidParameterException.class);
    }

    @Test
    public void shouldReturnFalseWhenTheBowlIsEmpty() {
        String message = "ANY MESSAGE";
        String bowlOfSoup = "";
        assertFalse(Solution.canIWriteTheMessage(message, bowlOfSoup));
    }

    @Test
    public void shouldReturnTrueWhenTheMessageIsEmpty() {
        String message = "";
        String bowlOfSoup = "ABCDEFGHIJKLMNOPQRSTVWYZ";
        assertTrue(Solution.canIWriteTheMessage(message, bowlOfSoup));
    }

    @Test
    public void shouldReturnFalseWhenTheMessageIsNotInTheBowl() throws Exception {
        String message = "ANY MESSAGE";
        String bowlOfSoup = "ABCDEFGHIJKLMNOPQRSTVWYZ";
        assertFalse(Solution.canIWriteTheMessage(message, bowlOfSoup));
    }

    @Test
    public void shouldReturnTrueWhenTheMessageIsInTheBowl() throws Exception {
        String message = "ANY MESSAGE";
        String bowlOfSoup = "ABCDEFGHIJKLMNOPQRSTVWYZ SAE";
        assertTrue(Solution.canIWriteTheMessage(message, bowlOfSoup));
    }

}