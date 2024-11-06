public class maiorNumero {
    public static int numeral(int num1, int num2, int num3){
      int maior = num1;

      if (num2 > maior){
          maior = num2;
      } else if (num3 > maior) {
          maior = num3;
      }

      return maior;

    }
}
