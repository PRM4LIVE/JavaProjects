public class StrEngS {
    public static void main(String[] args) {
        String str = "sadlkдывлтьдыFGфвalBdksalLылфвTRдфlaskadnEDдфылв";
        System.out.println(str);

                for (int i = 0; i < str.length(); i++) {
            if (str.charAt (i) >= 'a' && str.charAt(i) <= 'z') {
                System.out.print(str.charAt(i));
            }

        }
    }
}
