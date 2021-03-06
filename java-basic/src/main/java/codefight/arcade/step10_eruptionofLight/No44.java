/*
An email address such as "John.Smith@example.com" is made up of a local part ("John.Smith"), an "@" symbol, then a domain part ("example.com").

The domain name part of an email address may only consist of letters, digits, hyphens and dots. The local part, however, also allows a lot of different special characters. Here you can look at several examples of correct and incorrect email addresses.

Given a valid email address, find its domain part.

Example

For address = "prettyandsimple@example.com", the output should be
findEmailDomain(address) = "example.com";
For address = "<>[]:,;@\"!#$%&*+-/=?^_{}| ~.a\"@example.org", the output should be
findEmailDomain(address) = "example.org".
*/
package codefight.arcade.step10_eruptionofLight;

public class No44 {
    String findEmailDomain(String address) {

        String domain = "";
        
        for (int i = address.length() - 1; i >= 0; i--) {
            if (address.charAt(i) == '@') 
                break;
            domain += address.charAt(i);
        }
        
        StringBuffer buf = new StringBuffer(domain);
        String result = buf.reverse().toString();
        return result;
    }

    public static void main(String[] args) {
        No44 no = new No44();
        
        String address = "someaddress@yandex.ru";
        
        System.out.println(no.findEmailDomain(address));
    }

}
