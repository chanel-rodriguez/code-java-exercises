public class ServerNameGenerator {

    public static  String [] adj = {"happy", "sad", "blue", "big", "small", "round", "thin", "delicious","strong","weak"};
    public static String [] nouns = {"house","car","person","dog","cat","kid","state","president","truck","mountain"};

    public static String someStr (String[] arr){
        int length = arr.length;
        int rdm = (int) Math.floor(Math.random()*length);
        return arr[rdm];
    }

    public static void main(String[] args) {
        System.out.println(someStr(adj) + "-" + someStr(nouns));
    }

}
