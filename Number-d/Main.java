public class Main {

    public static void main(String[] args) {
        int[] decs = new int[]{0, 1, 63, 127, 255, 256};

        for (int i = 0; i < decs.length; i++) {
            System.out.print(decs[i] + ": (Binary)" + toBinary(decs[i]) + "(Octal)"+ toOctal(decs[i])+ "(Hex)" + toHex(decs[i]));
            System.out.println();
        }
    }

        public static String toBinary(int dec){
        String binary = "";
        for(int i = 8; i>=0; i--){
            if(dec - Math.pow(2,i)>=0){
                binary = binary + "1";
                dec = dec - (int)Math.pow(2,i);
            }else{
                binary = binary + "0";
            }
        }
            return binary;
        }
        public static String toOctal(int dec){
        String octal = "";
        for(int i = 8; i>0; i--){
            if(dec/(int)(Math.pow(8,i))>0){
                octal = octal + dec/(int)(Math.pow(8,i));
                dec = dec - (int)Math.pow(8,i)* dec/(int)(Math.pow(8,i));
            }else{
                octal = octal + "0";
            }
        }
        octal = octal +dec;

            return octal;
        }

        public static String toHex(int dec){
        String hex = "";
            for(int i = 8; i>0; i--){
                if(dec/(int)(Math.pow(16,i))>0){
                    hex = hex + dec/(int)(Math.pow(16,i));
                    dec = dec - (int)Math.pow(16,i)* dec/(int)(Math.pow(16,i));
                }else{
                    hex = hex + "0";
                }
            }
            hex = hex +dec;

            return hex;
        }
    }

