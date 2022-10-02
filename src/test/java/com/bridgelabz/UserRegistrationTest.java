package com.bridgelabz;
import com.bridgelabz.UserRegestration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {
    UserRegestration userRegistration;

    @Before
    public void setup() {
        userRegistration = new UserRegestration();
    }

    @Test
    public void validateName_shouldReturnTrue_whenFirstLatterIsCapital() {
        boolean result = userRegistration.validateName("Pavithra");
        assertTrue(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameFirstLatterIsSmall() {
        boolean result = userRegistration.validateName("pavithra");
        assertFalse(result);
    }

    @Test
    public void validateName_shouldReturnTrue_whenNameStartsWithCapAndHasMini3Characters() {
        boolean result = userRegistration.validateName("Pavi");
        assertTrue(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameStartsWithCapAndHasLessThan3Characters() {
        boolean result = userRegistration.validateName("Hc");
        assertFalse(result);
    }

    @Test
    public void validateName_shouldReturnFalse_whenNameIsNull() {
        boolean result = userRegistration.validateName(null);
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnFalse_whenEmailIsNull() {
        boolean result = userRegistration.validateEmail(null);
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnFalse_whenEmailMissAnyOfMandatoryParts() {
        boolean result = userRegistration.validateEmail("@bl.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnFalse_whenEmailMissATSIGN() {
        boolean result = userRegistration.validateEmail("abc.xyz.co.in");
        assertFalse(result);
    }

    @Test
    public void validateEmail_shouldReturnTrue_whenEmailHasAllMandatoryParts() {
        boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");
        assertTrue(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenMobileNumbersAreNull() {
        boolean result = userRegistration.validatingMobile(null);
        assertFalse(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenCountryCodeIsMissing() {
        boolean result = userRegistration.validatingMobile("7259924438");
        assertFalse(result);
    }

    @Test
    public void validateMobile_shouldReturnTrue_whenCountryCodeIsMentioned() {
        boolean result = userRegistration.validatingMobile("91 7259924438");
        assertTrue(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenCountryCodeIsMentionedWithoutSpace() {
        boolean result = userRegistration.validatingMobile("917259924438");
        assertFalse(result);
    }

    @Test
    public void validateMobile_shouldReturnFalse_whenNumbersIsLessInCount() {
        boolean result = userRegistration.validatingMobile("91 89883");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordIsNull() {
        boolean result = userRegistration.validatePassword(null);
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnTrue_whenPasswordProper() {
        boolean result = userRegistration.validatePassword("Ah5f@djs");
        assertTrue(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordMissUpperCaseCharacter() {
        boolean result = userRegistration.validatePassword("as2@cfr");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordMissNumericCharacter() {
        boolean result = userRegistration.validatePassword("Ah@jscfr");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordIsLessThan8Characters() {
        boolean result = userRegistration.validatePassword("Ah@js");
        assertFalse(result);
    }

    @Test
    public void validatePassword_shouldReturnFalse_whenPasswordMissSpecialCharacter() {
        boolean result = userRegistration.validatePassword("Ah5fkdjs");
        assertFalse(result);
    }

}