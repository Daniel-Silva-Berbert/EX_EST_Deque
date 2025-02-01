public class App {
    public static void main(String[] args) throws Exception {
        Deque<String> o1 = new Deque<>();

        o1.inserirInicio("teste1");
        o1.inserirInicio("test2");
        o1.inserirFim("teste3");

        while(o1.getTamanho() != 0)
        {
            System.out.println(o1.removeFim());
        }
        
    }
}
