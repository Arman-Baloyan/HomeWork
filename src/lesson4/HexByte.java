package lesson4;

public class HexByte {
public static void main(String [] args){
    char hex[]={
            'o','1','2','3','4','5','6','7',
            '8','9','b','c','d','e','f',
    };
    byte b=(byte) 0xf1;
    System.out.println("b=0x"+hex[(b>>4)& 0x0f]+hex[b & 0x0f]);
}
}