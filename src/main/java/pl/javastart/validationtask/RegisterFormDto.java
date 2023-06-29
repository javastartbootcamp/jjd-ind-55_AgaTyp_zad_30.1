package pl.javastart.validationtask;

import jakarta.validation.constraints.*;

public class RegisterFormDto {

    @NotBlank
    @Size(min = 3, max = 100)
    private String firstName;
    @NotBlank
    @Size(min = 3, max = 100)
    private String surname;
    @NotBlank
    private String address;
    @NotBlank
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}")
    private String postalCode;
    @NotBlank
    private String city;
    @NotBlank
    @EmailAddress(regexpPattern = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$")
    private String email;
    @NotBlank
//    @Pattern(regexp = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
    @Password(regexpPattern = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*]).*$")
    private String password;
    @AssertTrue
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}
