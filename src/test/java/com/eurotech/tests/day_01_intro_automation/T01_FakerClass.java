package day_01_intro_automation;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class T01_FakerClass {
    public static void main(String[] args) {
        //to creat mock data, we creat a faker object
        Faker faker =new Faker();

        //mock name
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //credit card
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard(CreditCardType.MASTERCARD) = " + faker.finance().creditCard(CreditCardType.MASTERCARD));

        //email-internet
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
        System.out.println("faker.internet().password() = " + faker.internet().password());
        System.out.println("faker.internet().password(8,16,true,true,true) = " + faker.internet().password(8,16,true,true,true));


    }
}
