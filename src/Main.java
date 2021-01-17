public class Main {
    public static void main(String[] args) {


        long ticket = 199_99;
        long limit = 20;
        //отбрасываем дробную часть
        long round = ticket / limit / 100;
        // добавляем копейки 00
        long bonus = round * 100;
        System.out.println(bonus);
    }
}

