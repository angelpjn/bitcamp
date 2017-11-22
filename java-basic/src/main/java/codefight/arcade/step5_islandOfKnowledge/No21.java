/*
For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

*/
package codefight.arcade.step5_islandOfKnowledge;

public class No21 {
    boolean isIPv4Address(String inputString) {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '.')
                count++;
        }
        if (count != 3)
            return false;
        
        count = 0;
        String[] ip = inputString.split("\\.");

        for (int i = 0; i < ip.length; i++) {
            if (ip[i].equals(""))
                return false;
            for (int j = 0; j < ip[i].length(); j++) {
                if (ip[i].charAt(j) - '0' < 0 || ip[i].charAt(j) - '0' > 9)
                    return false;
            }
        }

        count = 0;
        int temp = 0;
        for (int i = 0; i < ip.length; i++) {
            try {
                temp = Integer.parseInt(ip[i]);
                if (temp > 255 || temp < 0)
                    count++;
            } catch (Exception e) {
                return false;
            }

        }
        if (count > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        No21 no = new No21();

        String inputString = "129380129831213981.255.255.255";
        System.out.println(no.isIPv4Address(inputString));
    }

}
