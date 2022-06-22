package homeworks.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int countSymbol = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c){
                countSymbol++;
            }
        }
        System.out.println("Count symbol \'o\' in chars list: " + countSymbol);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("Two symbol in chars array: " + chars2[chars2.length / 2 - 1] + " and ");
        System.out.println(chars2[chars2.length / 2]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if(chars3[chars3.length-1] == 'y' && chars3[chars3.length-2] == 'l'){
            System.out.println("Chars array ends \'ly\': True");
        }else {
            System.out.println("Chars array doesn't and \'ly\': False");
        }

        char[] bobArray = {'b', 'o', 'b', 'o', 'l', 'b'};
        boolean bobText = false;
        for (int i = 0; i < bobArray.length-1; i++) {
            if(bobArray[i] == 'b' && bobArray[i + 2] == 'b'){
                bobText = true;
            }
        }
        System.out.println("In the text there is word bob: " + bobText);

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if(text[i] != ' '){
                System.out.print(text[i] + " ");
            }
        }

    }
}
