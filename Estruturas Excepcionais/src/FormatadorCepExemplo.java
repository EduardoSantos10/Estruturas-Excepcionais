public class FormatadorCepExemplo {
    public static void main(String[] args) {
       
        try {
            String cepFormatado = formatarCep("23548976");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInavlidoException();

            return "3.548-976"
    }

} // Verificar esse tema !!!
